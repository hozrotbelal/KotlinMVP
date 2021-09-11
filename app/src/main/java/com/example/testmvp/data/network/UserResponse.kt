package com.example.testmvp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserResponse (

        @Expose
      @SerializedName("Success")
       var Success: Boolean = false,

      @Expose
      @SerializedName("ResponseData")
      var responseData: ResponseData? = null
)
