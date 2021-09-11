package com.example.testmvp.ui.main

import com.example.testmvp.ui.main.interactor.MainInteractor
import com.example.testmvp.ui.main.interactor.MainMVPInteractor
import com.example.testmvp.ui.main.presenter.MainMVPPresenter
import com.example.testmvp.ui.main.presenter.MainPresenter
import com.example.testmvp.ui.main.view.MainMVPView
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    internal fun provideMainInteractor(mainInteractor: MainInteractor): MainMVPInteractor = mainInteractor

    @Provides
    internal fun provideMainPresenter(mainPresenter: MainPresenter<MainMVPView, MainMVPInteractor>): MainMVPPresenter<MainMVPView, MainMVPInteractor> = mainPresenter
}