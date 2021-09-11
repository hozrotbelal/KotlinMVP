package com.example.testmvp.ui.more.interactor

import com.example.testmvp.data.network.UserDevice
import com.example.testmvp.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

interface MoreMVPInteractor : MVPInteractor {

    fun doLoogerServerApiCall()

}