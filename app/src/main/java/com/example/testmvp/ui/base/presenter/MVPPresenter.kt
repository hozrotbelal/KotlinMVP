package com.example.testmvp.ui.base.presenter

import com.example.testmvp.ui.base.interactor.MVPInteractor
import com.example.testmvp.ui.base.view.MVPView

interface MVPPresenter<V : MVPView, I : MVPInteractor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?

    fun onDetachView()
}