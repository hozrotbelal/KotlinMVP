package com.example.testmvp.ui.more.interactor

import com.example.testmvp.data.network.ApiHelper
import com.example.testmvp.data.preferences.PreferenceHelper
import com.example.testmvp.ui.base.interactor.BaseInteractor
import io.reactivex.Observable
import javax.inject.Inject

class MoreInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), MoreMVPInteractor {

    override fun doLoogerServerApiCall() {

    }
}