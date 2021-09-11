package com.example.testmvp.di.builder

import com.example.testmvp.ui.main.MainActivityModule
import com.example.testmvp.ui.main.view.MainActivity
import com.example.testmvp.ui.splash.SplashActivityModule
import com.example.testmvp.ui.splash.view.SplashMVPActivity
import com.example.testmvp.ui.more.MoreFragmentProvider
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [(SplashActivityModule::class)])
    abstract fun bindSplashActivity(): SplashMVPActivity

    @ContributesAndroidInjector(modules = [(MainActivityModule::class),  (MoreFragmentProvider::class) ])
    abstract fun bindMainActivity(): MainActivity
}