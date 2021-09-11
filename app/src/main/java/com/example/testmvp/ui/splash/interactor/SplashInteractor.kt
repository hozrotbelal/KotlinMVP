package com.example.testmvp.ui.splash.interactor

import android.content.Context
import com.example.testmvp.data.network.*
import com.example.testmvp.data.preferences.PreferenceHelper
import com.example.testmvp.ui.base.interactor.BaseInteractor
import javax.inject.Inject

class SplashInteractor @Inject constructor(private val mContext: Context, preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), SplashMVPInteractor {

  //  override fun performPostUserDeviceServerCall(userDevice: UserDevice): Observable<UserDeviceResponse>  = apiHelper.performPostUserDeviceApiCall(UserDeviceRequest.ServerUserDevicePostRequest(userDevice.EventType!!, userDevice.DeviceName!!, userDevice.ModleName!!, userDevice.OSVersion!!, userDevice.EventDate!!, userDevice.Remarks!!, userDevice.DeviceId, userDevice.UserId))

    //override fun dogetUserInfoDataApiCall() = apiHelper.getUserInfoApiCall()


}