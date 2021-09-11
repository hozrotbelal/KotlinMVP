package com.example.testmvp.ui.base.presenter

import com.example.testmvp.ui.base.interactor.MVPInteractor
import com.example.testmvp.ui.base.view.MVPView
import com.example.testmvp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable


abstract class BasePresenter<V : MVPView, I : MVPInteractor> internal constructor(protected var interactor: I?, protected val schedulerProvider: SchedulerProvider, protected val compositeDisposable: CompositeDisposable) : MVPPresenter<V, I> {

    private var view: V? = null
    private val isViewAttached: Boolean get() = view != null

    override fun onAttach(view: V?) {
        try{
            this.view = view
        }catch (ex:Exception){
            var msg= ex.message;
        }

    }

    override fun getView(): V? = view

    override fun onDetach() {
        compositeDisposable.dispose()
        view = null
        interactor = null
    }

    override fun onDetachView() {
        view = null
    }
}