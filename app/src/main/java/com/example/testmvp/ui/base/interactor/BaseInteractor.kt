package com.example.testmvp.ui.base.interactor

import com.example.testmvp.data.network.ApiHelper
import com.example.testmvp.data.preferences.PreferenceHelper



open class BaseInteractor() : MVPInteractor {

    protected lateinit var preferenceHelper: PreferenceHelper
    protected lateinit var apiHelper: ApiHelper

    constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : this() {
        this.preferenceHelper = preferenceHelper
        this.apiHelper = apiHelper

    }

    override fun isUserLoggedIn(): Boolean {
        return false;
    }

//    override fun isUserLoggedIn(): Boolean {
//        return if (this.preferenceHelper.getCurrentUserId() == null || this.preferenceHelper.getCurrentUserId()!! <= 0) {
//            false
//        } else {
//            this.preferenceHelper.getCurrentUserLoggedInMode() != AppConstants.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.type
//        }
//    }

//    override fun performUserLogout() = preferenceHelper.let {
//        it.setCurrentUserId(null)
//        it.setAccessToken("")
//        it.setCurrentUserEmail("")
//        it.setAccessCookie("")
//        it.setCurrentUserLoggedInMode(AppConstants.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT)
//    }
}