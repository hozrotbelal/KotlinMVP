package com.example.testmvp.ui.splash.presenter

import com.example.testmvp.ui.base.presenter.BasePresenter
import com.example.testmvp.ui.splash.interactor.SplashMVPInteractor
import com.example.testmvp.ui.splash.view.SplashMVPView
import com.example.testmvp.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class SplashPresenter<V : SplashMVPView, I : SplashMVPInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), SplashMVPPresenter<V, I> {

    override fun onAttach(view: V?) {
        super.onAttach(view)
       // getView()?.getInstalledDeviceInfo()
      //  decideActivityToOpen()
    }



//    private fun isUserLoggedIn(): Boolean {
//        interactor?.let { return it.isUserLoggedIn() }
//        return false
//    }


    override fun getUserInfo() {
        try {

//            interactor?.let {
//                compositeDisposable.add(it.dogetUserInfoDataApiCall()
//                        .compose(schedulerProvider.ioToMainObservableScheduler())
//                        .subscribe({ userResponse ->
//                            getView()?.let {
//
//                                if (userResponse.Success && userResponse.responseData!!.user!!.Id>0) {
//                                    updateUserCommunityIdSharedPref(userResponse.responseData!!.user!!)
//                                    try {
//                                        var user = userResponse.responseData!!.user!!
//
//                                    } catch (ex: Exception) {
//                                        var msg = ex.message;
//                                    }
//
//                                    it.goToMainActivity();
//                                } else {
//                                    it.openLoginWithOTPActivity()
//                                }
//                            }
//                        }, { err ->
//                            println(err)
//                            getView()?.let {
//                                it.hideProgress()
//                                it.openLoginWithOTPActivity()
//                            }
//                        }))
//            }
        } catch (ex: Exception) {
            var msg = ex.message;
        }
    }




   // private fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode) =      interactor?.updateUserInSharedPref(loginResponse, loggedInMode)

}