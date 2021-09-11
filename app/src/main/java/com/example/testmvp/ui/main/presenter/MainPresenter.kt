package com.example.testmvp.ui.main.presenter

import com.bumptech.glide.load.HttpException
import com.example.testmvp.data.managers.LocationManager
import com.example.testmvp.data.managers.LookupManager
import com.example.testmvp.ui.base.presenter.BasePresenter
import com.example.testmvp.ui.main.interactor.MainMVPInteractor
import com.example.testmvp.ui.main.view.MainMVPView
import com.example.testmvp.util.AppConstants
import com.example.testmvp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import java.lang.Exception
import javax.inject.Inject


class MainPresenter<V : MainMVPView, I : MainMVPInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), MainMVPPresenter<V, I> {

    override fun onAttach(view: V?) {
        super.onAttach(view)

    }


    override fun getAllDivision() {
        try {
            interactor?.let {
                compositeDisposable.add(it.dogetAllDivisionApiCall()
                        .compose(schedulerProvider.ioToMainObservableScheduler())
                        .subscribe({ allAddressResponse ->
                            LocationManager.divisions = allAddressResponse.ResponseData!!.divisions!!
                        }, { err ->

                        }))
            }
        } catch (ex: Exception) {
            var msg = ex.message;
        }
    }
//
//    override fun getAllDistrict() {
//        try {
//            interactor?.let {
//                compositeDisposable.add(it.dogetAllDistrictApiCall()
//                        .compose(schedulerProvider.ioToMainObservableScheduler())
//                        .subscribe({ allAddressResponse ->
//                            LocationManager.districts = allAddressResponse.ResponseData!!.districts!!
//
//                        }, { err ->
//                            println(err)
//
//                        }))
//            }
//        } catch (ex: Exception) {
//            var msg = ex.message;
//        }
//    }
//
//    override fun getAllThana() {
//        try {
//            interactor?.let {
//                compositeDisposable.add(it.dogetAllThanaApiCall()
//                        .compose(schedulerProvider.ioToMainObservableScheduler())
//                        .subscribe({ allAddressResponse ->
//                            LocationManager.thanas = allAddressResponse.ResponseData!!.thanas!!
//                            getView()?.hideProgress();
//                        }, { err ->
//                            println(err)
//                        }))
//            }
//        } catch (ex: Exception) {
//            var msg = ex.message;
//        }
//    }
//
//    override fun getAllUnion() {
//        try {
//            interactor?.let {
//                compositeDisposable.add(it.dogetAllUnionApiCall()
//                        .compose(schedulerProvider.ioToMainObservableScheduler())
//                        .subscribe({ allAddressResponse ->
//                            LocationManager.allunions = allAddressResponse.ResponseData!!.unions!!
//                            getView()?.hideProgress();
//                        }, { err ->
//                            println(err)
//                        }))
//            }
//        } catch (ex: Exception) {
//            var msg = ex.message;
//        }
//    }



}