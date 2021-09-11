package com.example.testmvp.di.component

import android.app.Application
import com.example.testmvp.di.builder.ActivityBuilder
import com.example.testmvp.di.module.AppModule
import com.example.testmvp.TestMVPApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidInjectionModule::class), (AppModule::class), (ActivityBuilder::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: TestMVPApp)
}