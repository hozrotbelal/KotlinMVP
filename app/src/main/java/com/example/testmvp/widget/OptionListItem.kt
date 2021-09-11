package com.example.testmvp.widget

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.testmvp.R

class OptionListItem @SuppressLint("InflateParams")
constructor(context: Context, title: String, notification: String, onClickListener: View.OnClickListener) {
    private val textViewNotification: TextView
    var view: View = LayoutInflater.from(context).inflate(R.layout.widget_option_item, null)

    init {
        textViewNotification = this.view.findViewById(R.id.option_item_widget_notification)
        val textViewTitle = this.view.findViewById<TextView>(R.id.option_item_widget_title)
        if (notification.isEmpty())
            this.textViewNotification.visibility = View.GONE
        else
            this.textViewNotification.text = notification
        textViewTitle.text = title
        this.view.tag = title
        this.view.setOnClickListener(onClickListener)
    }
}