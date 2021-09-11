package com.example.testmvp.ui.main.presenter

import com.example.testmvp.ui.base.presenter.MVPPresenter
import com.example.testmvp.ui.main.interactor.MainMVPInteractor
import com.example.testmvp.ui.main.view.MainMVPView

interface MainMVPPresenter<V : MainMVPView, I : MainMVPInteractor> : MVPPresenter<V, I> {

    fun getAllDivision()
//    fun getAllDistrict()
//    fun getAllThana()
//    fun getAllUnion()

}