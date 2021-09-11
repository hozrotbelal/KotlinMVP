package com.example.testmvp.ui.base.view

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.res.Configuration
import android.net.ConnectivityManager
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.ContextThemeWrapper
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import com.example.testmvp.R
import com.example.testmvp.data.preferences.AppPreferenceHelper
import com.example.testmvp.util.AppConstants
import com.example.testmvp.util.CommonUtil
import com.example.testmvp.util.NetworkChangeReceiver
import com.example.testmvp.widget.ProgressDialog
import dagger.android.AndroidInjection
import java.util.*


abstract class BaseActivity : AppCompatActivity(), MVPView, BaseFragment.CallBack, NetworkChangeReceiver.ConnectivityReceiverListener {

    private var progressDialog: ProgressDialog? = null
    private var receiver: BroadcastReceiver? = null
    private var dialog: android.app.AlertDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        try {
            super.onCreate(savedInstanceState)
            dialog = CommonUtil.showNoInternetConnectionDialog(this, getString(R.string.dialog_network_unavailable_title), getString(R.string.dialog_network_unavailable_message_retry))
            receiver = NetworkChangeReceiver()
            registerReceiver(receiver, IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION))
            performDI()
        }catch (ex:Exception){

        }
    }

    fun showNoInternetConnectionDialog(context: Context, title: String?, message: String?): AlertDialog {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton(context?.resources?.getString(R.string.dialog_default_positive_button_label)) { dialog, _ ->
            dialog.dismiss()
        }
        return builder.create()
    }

    override fun onNetworkConnectionChanged(isConnected: Boolean) {
        try {
            if (!isConnected) {
                if (!dialog!!.isShowing) {
                    dialog?.show()
                }
            } else {
                if (dialog!!.isShowing) {
                    dialog?.dismiss()
                }
            }
        }catch (ex:Exception){

        }
    }

    override fun onResume() {
        try {
            super.onResume()
            NetworkChangeReceiver.connectivityReceiverListener = this
        }catch (ex:Exception){

        }
    }

    override fun onStart() {
        try {
            super.onStart()
            setUpNavigation()
        }catch (ex:Exception){

        }
    }

    override fun onDestroy() {
        try {
            super.onDestroy()
            if (dialog?.isShowing!!) {
                dialog?.dismiss()
            }
            unregisterReceiver(receiver)
        }catch (ex:Exception){

        }
    }

    override fun hideProgress() {
        try {
            progressDialog?.let { if (it.isShowing) it.cancel() }
        }catch (ex:Exception){

        }
    }

    override fun showProgress() {
        try {
            hideProgress()
            progressDialog = CommonUtil.showLoadingDialog(this)
        }catch (ex:Exception){

        }
    }

    private fun performDI() = AndroidInjection.inject(this)

    abstract fun setUpNavigation()

    companion object {
        public var dLocale: Locale? = null
    }

    init {
        updateConfig(this)
    }

    fun updateConfig(wrapper: ContextThemeWrapper) {
        if(dLocale==Locale("") ) // Do nothing if dLocale is null
            return

       // Locale.setDefault(dLocale)
        val configuration = Configuration()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
           // configuration.setLocale(dLocale)
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            wrapper.applyOverrideConfiguration(configuration)
        }
    }

}