package com.example.testmvp.ui.main.interactor

import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.OkHttpResponseListener
import com.example.testmvp.data.network.*
import com.example.testmvp.data.preferences.PreferenceHelper
import com.example.testmvp.ui.base.interactor.BaseInteractor
import okhttp3.Response
import javax.inject.Inject


class MainInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper = preferenceHelper, apiHelper = apiHelper), MainMVPInteractor {


    override fun dogetAllDivisionApiCall() = apiHelper.getAllDivisionApiCall()
//    override fun dogetAllDistrictApiCall() = apiHelper.getAllDistrictApiCall()
//    override fun dogetAllThanaApiCall() = apiHelper.getAllThanaApiCall()
//    override fun dogetAllUnionApiCall() = apiHelper.getAllUnionApiCall()


}