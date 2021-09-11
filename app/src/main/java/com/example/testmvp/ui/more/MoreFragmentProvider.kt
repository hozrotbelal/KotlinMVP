package com.example.testmvp.ui.more

import com.example.testmvp.ui.more.view.MoreFragment
import com.example.testmvp.ui.more.MoreFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MoreFragmentProvider {

    @ContributesAndroidInjector(modules = [(MoreFragmentModule::class)])
    internal abstract fun provideMoreFragmentFactory(): MoreFragment
}