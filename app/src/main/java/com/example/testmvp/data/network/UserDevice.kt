package com.example.testmvp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserDevice(

        @Expose
        @SerializedName("Id")
        var Id: Long? = null,

        @Expose
        @SerializedName("Status")
        var Status: Int? = null,

        @Expose
        @SerializedName("CreationDate")
        var CreationDate: String? = null,

        @Expose
        @SerializedName("UserId")
        var UserId: Long? = null,

        @Expose
        @SerializedName("EventType")
        var EventType: String? = null,

        @Expose
        @SerializedName("DeviceName")
        var DeviceName: String? = null,

        @Expose
        @SerializedName("ModleName")
        var ModleName: String? = null,

        @Expose
        @SerializedName("OSVersion")
        var OSVersion: String? = null,

        @Expose
        @SerializedName("EventDate")
        var EventDate: String? = null,

        @Expose
        @SerializedName("Remarks")
        var Remarks: String? = null,

        @Expose
        @SerializedName("DeviceId")
        var DeviceId: String? = null
)



