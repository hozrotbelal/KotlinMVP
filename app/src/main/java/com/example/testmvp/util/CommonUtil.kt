package com.example.testmvp.util

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.PopupMenu
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast
import com.example.testmvp.R
import com.example.testmvp.data.managers.TaskManager
import com.example.testmvp.data.network.ApiEndPoint

import com.example.testmvp.widget.ProgressDialog



object CommonUtil {

    private lateinit var pictureDialog: AlertDialog

    fun showLoadingDialog(context: Activity?): ProgressDialog {
        val progressDialog = ProgressDialog(context!!)
        progressDialog.setMessage(context.getString(R.string.please_wait))
        progressDialog.setCancelable(false)
        progressDialog.show()
        return progressDialog
    }

    fun showNoInternetConnectionDialog(context: Context?, title: String?, message: String?): AlertDialog {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton(context?.resources?.getString(R.string.dialog_default_positive_button_label)) { dialog, _ ->
            dialog.dismiss()
        }
        return builder.create()
    }

    fun showExitDialog(context: Context?, title: String?, message: String?, onClickListener: View.OnClickListener) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton(context?.resources?.getString(R.string.dialog_default_positive_button_label)) { dialog, which ->
            onClickListener.onClick(null)
        }
        builder.setNegativeButton(context?.resources?.getString(R.string.dialog_default_negative_button_label)) { dialog, which ->
            dialog.dismiss()
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }


    fun optStringNullCheckValue(myString: String?): String {
        return if (myString == null || myString.equals("") || myString.equals("null"))
            ""
        else
            myString
    }

}
