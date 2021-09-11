package com.example.testmvp.ui.main.view

import com.example.testmvp.ui.base.view.MVPView

interface MainMVPView : MVPView {

   // fun openLoginActivity()
    fun checkServerAppVersion(checkVersion:String,serverVersion:String)
  //  fun openLoginWithOTPActivity()


}