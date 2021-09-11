package com.example.testmvp.ui.splash.view

import com.example.testmvp.ui.base.view.MVPView

interface SplashMVPView : MVPView {

    fun showSuccessToast()
//    fun showErrorToast()
  // fun openMainActivity()
//    fun openLoginSignUpActivity()
//    fun getInstalledDeviceInfo()
//
//    fun openLoginWithOTPActivity()
  fun goToMainActivity()

    //fun showValidationMessage(errorCode: Int)
   // fun showLogInErrors(erros: String)


};