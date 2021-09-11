package com.example.testmvp.ui.more

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testmvp.ui.more.interactor.MoreInteractor
import com.example.testmvp.ui.more.interactor.MoreMVPInteractor
import com.example.testmvp.ui.more.presenter.MoreMVPPresenter
import com.example.testmvp.ui.more.presenter.MorePresenter
import com.example.testmvp.ui.more.view.MoreFragment
import com.example.testmvp.ui.more.view.MoreMVPView
import dagger.Module
import dagger.Provides

@Module
class MoreFragmentModule {

    @Provides
    internal fun provideMoreInteractor(interactor: MoreInteractor): MoreMVPInteractor = interactor

    @Provides
    internal fun provideMorePresenter(presenter: MorePresenter<MoreMVPView, MoreMVPInteractor>): MoreMVPPresenter<MoreMVPView, MoreMVPInteractor> = presenter

    @Provides
    internal fun provideLinearLayoutManager(fragment: MoreFragment): LinearLayoutManager = LinearLayoutManager(fragment.activity)
}