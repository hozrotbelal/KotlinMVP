package com.example.testmvp.di.module

import android.app.Application
import android.content.Context
import com.example.testmvp.BuildConfig
import com.example.testmvp.data.network.ApiHeader
import com.example.testmvp.data.preferences.AppPreferenceHelper
import com.example.testmvp.data.preferences.PreferenceHelper
import com.example.testmvp.di.ApiKeyInfo
import com.example.testmvp.di.PreferenceInfo
import com.example.testmvp.util.AppConstants
import com.example.testmvp.util.SchedulerProvider
import com.example.testmvp.data.network.ApiHelper
import com.example.testmvp.data.network.AppApiHelper

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton


@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    @ApiKeyInfo
    internal fun provideApiKey(): String = BuildConfig.API_KEY

    @Provides
    @PreferenceInfo
    internal fun provideprefFileName(): String = AppConstants.PREF_NAME

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppPreferenceHelper): PreferenceHelper = appPreferenceHelper

//    @Provides
//    @Singleton
//    internal fun provideProtectedApiHeader(@ApiKeyInfo apiKey: String, preferenceHelper: PreferenceHelper)
//            : ApiHeader.ProtectedApiHeader = ApiHeader.ProtectedApiHeader(apiKey = apiKey,
//            userId = preferenceHelper.getCurrentUserId(),
//            accessToken = preferenceHelper.getAccessToken())

//    @Provides
//    @Singleton
//    internal fun providePrivateApiHeader(@ApiKeyInfo apiKey: String, preferenceHelper: PreferenceHelper)
//            : ApiHeader.PrivateApiHeader = ApiHeader.PrivateApiHeader(cookieKey = preferenceHelper.getAccessCookie())

    @Provides
    @Singleton
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper = appApiHelper

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProvider()
}