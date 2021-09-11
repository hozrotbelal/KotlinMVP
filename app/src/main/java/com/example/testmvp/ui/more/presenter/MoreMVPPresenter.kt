package com.example.testmvp.ui.more.presenter

import com.example.testmvp.data.network.UserDevice
import com.example.testmvp.ui.base.presenter.MVPPresenter
import com.example.testmvp.ui.more.interactor.MoreMVPInteractor
import com.example.testmvp.ui.more.view.MoreMVPView

interface MoreMVPPresenter<V : MoreMVPView, I : MoreMVPInteractor> : MVPPresenter<V, I> {

    fun onMoreButtonClicked()

}