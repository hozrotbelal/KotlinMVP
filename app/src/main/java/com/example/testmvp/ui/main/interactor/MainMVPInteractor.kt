package com.example.testmvp.ui.main.interactor

import com.example.testmvp.data.network.*
import com.example.testmvp.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

interface MainMVPInteractor : MVPInteractor {


    fun dogetAllDivisionApiCall() : Observable<Address.AddressResponse>
//    fun dogetAllDistrictApiCall() : Observable<Address.AddressResponse>
//    fun dogetAllThanaApiCall() : Observable<Address.AddressResponse>
//    fun dogetAllUnionApiCall() : Observable<Address.AddressResponse>


}