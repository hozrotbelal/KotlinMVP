package com.example.testmvp

import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.example.testmvp.data.preferences.AppPreferenceHelper
import com.example.testmvp.di.component.AppComponent
import com.example.testmvp.di.component.DaggerAppComponent

import com.example.testmvp.util.AppConstants
import com.example.testmvp.ui.base.view.BaseActivity
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import java.util.*
import javax.inject.Inject


class TestMVPApp : MultiDexApplication(), HasAndroidInjector {

    lateinit var appPreferenceHelper: AppPreferenceHelper

    @Inject
    internal lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> = activityDispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        appPreferenceHelper = AppPreferenceHelper(this, AppConstants.PREF_NAME)

        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this)



        MultiDex.install(this)

      //  AppEventsLogger.activateApp(this)

       // BaseActivity.dLocale = Locale(appPreferenceHelper.getApplicationLanguage())
    }


    init {
        instance = this
    }

    companion object {
        private var instance: TestMVPApp? = null

        fun applicationContext() : Context {
            return instance!!.applicationContext
        }
    }
}


