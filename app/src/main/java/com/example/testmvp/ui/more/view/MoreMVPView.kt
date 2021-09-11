package com.example.testmvp.ui.more.view

import com.example.testmvp.ui.base.view.MVPView

interface MoreMVPView : MVPView {

    fun showValidationMessage(errorCode: Int)

    fun clearData()

}