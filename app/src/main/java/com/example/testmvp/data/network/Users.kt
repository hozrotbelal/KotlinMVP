package com.example.testmvp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Users(

        @Expose
        @SerializedName("Id")
        var Id: Long = 0,

        @Expose
        @SerializedName("Name")
        var Name: String? = null,

        @Expose
        @SerializedName("OnlyName")
        var OnlyName: String? = null,

        @Expose
        @SerializedName("NameWithTag")
        var NameWithTag: String? = null,

        @Expose
        @SerializedName("MobileNumber")
        var MobileNumber: String? = null,

        @Expose
        @SerializedName("RegistrationNumber")
        var RegistrationNumber: String? = null



)