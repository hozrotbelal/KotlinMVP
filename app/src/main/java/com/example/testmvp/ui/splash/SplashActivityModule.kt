package com.example.testmvp.ui.splash

import com.example.testmvp.ui.splash.interactor.SplashInteractor
import com.example.testmvp.ui.splash.interactor.SplashMVPInteractor
import com.example.testmvp.ui.splash.presenter.SplashMVPPresenter
import com.example.testmvp.ui.splash.presenter.SplashPresenter
import com.example.testmvp.ui.splash.view.SplashMVPView
import dagger.Module
import dagger.Provides

@Module
class SplashActivityModule {

    @Provides
    internal fun provideSplashInteractor(splashInteractor: SplashInteractor): SplashMVPInteractor = splashInteractor

    @Provides
    internal fun provideSplashPresenter(splashPresenter: SplashPresenter<SplashMVPView, SplashMVPInteractor>)
            : SplashMVPPresenter<SplashMVPView, SplashMVPInteractor> = splashPresenter
}