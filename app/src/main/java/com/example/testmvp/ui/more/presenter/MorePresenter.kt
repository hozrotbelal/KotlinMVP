package com.example.testmvp.ui.more.presenter

import com.example.testmvp.data.network.UserDevice
import com.example.testmvp.ui.base.presenter.BasePresenter
import com.example.testmvp.ui.more.interactor.MoreMVPInteractor
import com.example.testmvp.ui.more.view.MoreMVPView
import com.example.testmvp.util.AppConstants
import com.example.testmvp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class MorePresenter<V : MoreMVPView, I : MoreMVPInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), MoreMVPPresenter<V, I> {

    override fun onMoreButtonClicked() {

    }


}