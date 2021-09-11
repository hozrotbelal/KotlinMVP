package com.example.testmvp.ui.base.view

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.testmvp.R

class ConnectivityChange : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connectivity_change)

        val alBuilder = AlertDialog.Builder(this)
        alBuilder.setTitle(applicationContext.getString(R.string.dialog_network_unavailable_title))
        alBuilder.setMessage(applicationContext.getString(R.string.dialog_network_unavailable_message_retry))
        alBuilder.setPositiveButton("OK") { _: DialogInterface, _: Int ->
            finish()
        }
        alBuilder.setNegativeButton("CANCEL") { _: DialogInterface, _: Int ->
            android.os.Process.killProcess(android.os.Process.myPid())
            System.exit(1)
        }
        val alertDialog: AlertDialog = alBuilder.create()
        alertDialog.show()
    }
}