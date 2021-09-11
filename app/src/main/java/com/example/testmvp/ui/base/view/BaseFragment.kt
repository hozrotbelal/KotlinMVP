package com.example.testmvp.ui.base.view

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.testmvp.util.CommonUtil
import com.example.testmvp.widget.ProgressDialog
import dagger.android.support.AndroidSupportInjection

abstract class BaseFragment : Fragment(), MVPView {

    private var parentActivity: BaseActivity? = null
    private var progressDialog: ProgressDialog? = null

    override fun onAttach(context: Context) {
        try {
            super.onAttach(context)
            if (context is BaseActivity) {
                val activity = context as BaseActivity?
                this.parentActivity = activity
                activity?.onFragmentAttached()
            }
        }catch (ex:Exception){
            var msg= ex.message;
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        try {
            super.onCreate(savedInstanceState)
            performDependencyInjection()
            setHasOptionsMenu(false)
        }catch (ex:Exception){
            var msg= ex.message;
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            super.onViewCreated(view, savedInstanceState)
            setUp()
        }catch (ex:Exception){
            var msg= ex.message;
        }
    }

    override fun hideProgress() {
        try {
            if (progressDialog != null && progressDialog?.isShowing!!) {
                progressDialog?.cancel()
            }
        }catch (ex:Exception){
            var msg= ex.message;
        }
    }

    override fun showProgress() {
        try {
            hideProgress()
            progressDialog = CommonUtil.showLoadingDialog(this.parentActivity)
        }catch (ex:Exception){
            var msg= ex.message;
        }
    }

    fun getBaseActivity() = parentActivity

    private fun performDependencyInjection() = AndroidSupportInjection.inject(this)

    interface CallBack {
        fun onFragmentAttached()
        fun onFragmentDetached(tag: String)
    }

    abstract fun setUp()
}