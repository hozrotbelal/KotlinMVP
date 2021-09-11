package com.example.testmvp.ui.main.view

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.core.content.ContextCompat
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import com.example.testmvp.R
import com.example.testmvp.data.managers.TaskManager
import com.example.testmvp.data.preferences.AppPreferenceHelper
import com.example.testmvp.ui.base.view.BaseActivity

import com.example.testmvp.ui.main.interactor.MainMVPInteractor
import com.example.testmvp.ui.main.presenter.MainMVPPresenter
import com.example.testmvp.ui.more.view.MoreFragment
import com.example.testmvp.util.*
import com.example.testmvp.util.extension.active
import com.example.testmvp.util.extension.disableShiftMode
import com.example.testmvp.util.extension.removeFragment

import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_navigation.*
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper
import javax.inject.Inject


class MainActivity : BaseActivity(), MainMVPView, BottomNavigationView.OnNavigationItemSelectedListener, HasAndroidInjector {


    private val KEY_POSITION = "keyPosition"
    private var navPosition: BottomNavigationPosition = BottomNavigationPosition.POSTTASK

    @Inject
    internal lateinit var presenter: MainMVPPresenter<MainMVPView, MainMVPInteractor>

    @Inject
    internal lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    lateinit var appPreferenceHelper: AppPreferenceHelper

    var itemViewNotification: BottomNavigationItemView? = null

    var tutorialNumber = 0

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        try {
            if (savedInstanceState != null)
                restoreSaveInstanceState(savedInstanceState)
            else
                super.onCreate(savedInstanceState)

            appPreferenceHelper = AppPreferenceHelper(this, AppConstants.PREF_NAME)
           // LocaleHelper.setLocale(this, appPreferenceHelper.getApplicationLanguage())

            setContentView(R.layout.activity_main)

            try {
                setSupportActionBar(toolbar)
                setupBottomNavigation()
                initFragment(savedInstanceState)
                updateFCMDeviceToken()
                presenter.onAttach(this)
                presenter.getAllDivision()
//                presenter.getAllDistrict()
//                presenter.getAllThana()
              //  presenter.getAllUnion()

            } catch (ex: Exception) {
                var error = ex.message
            }


        } catch (ex: Exception) {

        }
    }

    override fun onBackPressed() {
        val onClickListener = View.OnClickListener {
            finish()
        }
        CommonUtil.showExitDialog(this, getString(R.string.dialog_exit_title), getString(R.string.dialog_exit_message), onClickListener)
    }

    override fun checkServerAppVersion(checkVersion: String, serverVersion: String) {
        try {
            val manager = this.packageManager
            val info = manager.getPackageInfo(this.packageName, PackageManager.GET_ACTIVITIES)
            var installVersion = info.versionName;
            if (checkVersion.equals("Yes") && installVersion != serverVersion) {
                try {
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=${info.packageName}")))
                    finish()
                } catch (anfe: android.content.ActivityNotFoundException) {
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=${info.packageName}")))
                    finish()
                }

            }
        } catch (ex: Exception) {
        }
    }

    override fun onStart() {
      //  TaskManager.CurrentForBrowseTask = 0
        super.onStart()
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onFragmentDetached(tag: String) {
        supportFragmentManager?.removeFragment(tag = tag)
    }

    override fun onFragmentAttached() {
    }


//
//    override fun openLoginActivity() {
//        val intent = Intent(this, LoginActivity::class.java)
//        startActivity(intent)
//        finish()
//    }



    override fun androidInjector() = fragmentDispatchingAndroidInjector

    override fun onSaveInstanceState(outState: Bundle) {
        outState?.putInt(KEY_POSITION, navPosition.id)
        super.onSaveInstanceState(outState)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        navPosition = findNavigationPositionById(item.itemId)

        if (navPosition == BottomNavigationPosition.BROWSETASK) {
            textViewTutorial_Task_Messgae.text = getString(R.string.tutorial_text_browse_task)
            textViewTutorial_Task_Messgae.visibility = View.VISIBLE
            textViewTutorial_Task_Messgae.setBackgroundColor(ContextCompat.getColor(this, R.color.grey2))

        } else if (navPosition == BottomNavigationPosition.POSTTASK) {
            textViewTutorial_Task_Messgae.text = getString(R.string.tutorial_text_task_post)
            textViewTutorial_Task_Messgae.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            textViewTutorial_Task_Messgae.visibility = View.VISIBLE

        } else if (navPosition == BottomNavigationPosition.MYTASK) {
            textViewTutorial_Task_Messgae.text = getString(R.string.tutorial_text_my_task)
            textViewTutorial_Task_Messgae.visibility = View.VISIBLE
            textViewTutorial_Task_Messgae.setBackgroundColor(ContextCompat.getColor(this, R.color.grey2))
        } else {
            textViewTutorial_Task_Messgae.visibility = View.GONE
        }

        return switchFragment(navPosition)
    }

    private fun hideBottomNavigationItem(id: Int, bottomNavigationView: BottomNavigationView) {
        try {
            var menuView = bottomNavigationView.getChildAt(0) as BottomNavigationMenuView;
            val valCount: Int = menuView!!.getChildCount()
            for (i in 0..valCount) {
                var itemView = menuView.getChildAt(i);
                var getID: Int = itemView.getId()
                if (itemView.getId() == id) {
                    itemView.setVisibility(View.GONE);
                    bottomNavigationView.menu.findItem(R.id.nav_bar_browse_tasks).isVisible = false
                }


            }
        } catch (ex: Exception) {
            var error = ex.message
        }

        //  menuView.findViewById<BottomNavigationView>(id).setVisibility(View.GONE);
    }
//    private fun hideBottomNavigationItems(id: Int, bottomNavigationView : BottomNavigationView) {
//        var menuView =  bottomNavigationView.getChildAt(0);
//
//}


    private fun restoreSaveInstanceState(savedInstanceState: Bundle?) {
        // Restore the current navigation position.
        savedInstanceState?.also {
            val id = it.getInt(KEY_POSITION, BottomNavigationPosition.POSTTASK.id)
            navPosition = findNavigationPositionById(id)
        }
    }

    private fun setupBottomNavigation() {

        try {
            val tab_position = intent.getIntExtra("tab_position", 0)
            //      bottom_navigation.active(tab_position)

            when (tab_position) {
                2 -> {
                    navPosition = BottomNavigationPosition.MYTASK
                    switchFragment(navPosition)
                    textViewTutorial_Task_Messgae.setBackgroundColor(ContextCompat.getColor(this, R.color.grey2))
                    textViewTutorial_Task_Messgae.visibility = View.GONE

                }
                4 -> {
                    navPosition = BottomNavigationPosition.MORE
                    switchFragment(navPosition)
                    textViewTutorial_Task_Messgae.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                    textViewTutorial_Task_Messgae.visibility = View.GONE
                }
                1 -> {
                    navPosition = BottomNavigationPosition.MYTASK
                    switchFragment(navPosition)
                    textViewTutorial_Task_Messgae.setBackgroundColor(ContextCompat.getColor(this, R.color.grey2))
                    textViewTutorial_Task_Messgae.visibility = View.GONE
                }
                0 -> {
                    navPosition = BottomNavigationPosition.POSTTASK
                    switchFragment(navPosition)
                }
            }

        } catch (ex: Exception) {

        }

        bottom_navigation.disableShiftMode() // Extension function
        bottom_navigation.active(navPosition.position)   // Extension function
        bottom_navigation.setOnNavigationItemSelectedListener(this)

//        val menu = bottom_navigation.getChildAt(0) as BottomNavigationMenuView
//
//        val message = menu.getChildAt(3)
//        val itemViewMessage = message as BottomNavigationItemView
//        val badgeMessage = LayoutInflater.from(this).inflate(R.layout.layout_badge, menu, false)
//        itemViewMessage.addView(badgeMessage)


        // UnreadNotificationCount
//        if (appPreferenceHelper.getUnreadNotificationCount() > 0) {
//            val notification = menu.getChildAt(4)
//            itemViewNotification = notification as BottomNavigationItemView
//            val badgeNotification = LayoutInflater.from(this).inflate(R.layout.layout_badge, menu, false)
//            badgeNotification.notifications_badge.text = appPreferenceHelper.getUnreadNotificationCount().toString()
//            itemViewNotification.addView(badgeNotification)
//        }
    }

    private fun initFragment(savedInstanceState: Bundle?) {
        savedInstanceState ?: switchFragment(navPosition)

    }

    private fun switchFragment(navPosition: BottomNavigationPosition): Boolean {
        val fragment = supportFragmentManager.findFragment(navPosition)
        if (fragment.isAdded) return false
        detachFragment()
        attachFragment(fragment, navPosition.getTag())
        supportFragmentManager.executePendingTransactions()
        return true
    }

    private fun FragmentManager.findFragment(position: BottomNavigationPosition): Fragment {
        return findFragmentByTag(position.getTag()) ?: position.createFragment()
    }

    private fun detachFragment() {
        supportFragmentManager.findFragmentById(R.id.container)?.also {
            supportFragmentManager.beginTransaction().detach(it).commit()
        }
    }

    private fun attachFragment(fragment: Fragment, tag: String) {
        if (fragment.isDetached) {
            supportFragmentManager.beginTransaction().attach(fragment).commit()
        } else {
            supportFragmentManager.beginTransaction().add(R.id.container, fragment, tag).commit()
        }
        // Set a transition animation for this transaction.
        supportFragmentManager.beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit()
    }

    override fun setUpNavigation() {
    }

    private fun updateFCMDeviceToken() {
        val appPreferenceHelper = AppPreferenceHelper(applicationContext, AppConstants.PREF_NAME)

    }

    public fun refreshActivity(tab_position: Int) {
        // this.recreate()
        // val intent = intent
        finish()
        intent.putExtra("tab_position", tab_position)
        startActivity(intent)

    }

    override fun attachBaseContext(base: Context?) {
        try {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
                super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
            } else {
                super.attachBaseContext(base);
            }
        } catch (ex: Exception) {
            var msg = ex.message;
        }
    }

    override fun onResume() {
        try{
        super.onResume()
        refreshCountData()
        }catch (ex:Exception){
            var msg= ex.message;
        }
    }


    public fun refreshCountData() {

    }

}
