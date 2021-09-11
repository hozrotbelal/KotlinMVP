package com.example.testmvp.ui.splash.view

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.widget.Toast
import com.example.testmvp.R
import com.example.testmvp.data.preferences.AppPreferenceHelper
import com.example.testmvp.ui.base.view.BaseActivity
import com.example.testmvp.ui.main.view.MainActivity

import com.example.testmvp.ui.splash.interactor.SplashMVPInteractor
import com.example.testmvp.ui.splash.presenter.SplashMVPPresenter
import com.example.testmvp.util.AppConstants
import com.example.testmvp.util.CommonUtil

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper
import javax.inject.Inject

class SplashMVPActivity : BaseActivity(), SplashMVPView {

    @Inject
    lateinit var presenter: SplashMVPPresenter<SplashMVPView, SplashMVPInteractor>

    private val SPLASH_TIME_OUT = 3000

    lateinit var appPreferenceHelper: AppPreferenceHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        appPreferenceHelper = AppPreferenceHelper(this, AppConstants.PREF_NAME)
       // LocaleHelper.setLocale(this, appPreferenceHelper.getApplicationLanguage())

        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            presenter.onAttach(this)
            goToMainActivity()
        }, SPLASH_TIME_OUT.toLong())
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onFragmentDetached(tag: String) {
    }

    override fun onFragmentAttached() {
    }

    override fun showSuccessToast() {
    }


    override fun goToMainActivity(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }


    override fun setUpNavigation() {
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

}
