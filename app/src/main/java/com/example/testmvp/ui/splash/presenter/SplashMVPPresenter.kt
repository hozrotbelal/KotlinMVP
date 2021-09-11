package com.example.testmvp.ui.splash.presenter

import com.example.testmvp.ui.base.presenter.MVPPresenter
import com.example.testmvp.ui.splash.interactor.SplashMVPInteractor
import com.example.testmvp.ui.splash.view.SplashMVPView


interface SplashMVPPresenter<V : SplashMVPView, I : SplashMVPInteractor> : MVPPresenter<V,I>{

   // fun onPostUserDevice(userDevice: UserDevice)

    fun getUserInfo()

  //  fun onMobileSignInButtonClicked(mobileNumber: String)

}