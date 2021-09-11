package com.example.testmvp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ResponseData(

        @Expose
        @SerializedName("User")
        var user: User? = null,

        @Expose
        @SerializedName("Divisions")
        var divisions: List<Address.Division>? = null,

        @Expose
        @SerializedName("Districts")
        var districts: List<Address.District>? = null,

        @Expose
        @SerializedName("Thanas")
        var thanas: List<Address.Thana>? = null,

        @Expose
        @SerializedName("Unions")
        var unions: List<Address.Union>? = null,

        @Expose
        @SerializedName("Division")
        var division: String? = null,

        @Expose
        @SerializedName("District")
        var district: String? = null,

        @Expose
        @SerializedName("Thana")
        var thana: String? = null,

        @Expose
        @SerializedName("Union")
        var union: String? = null,

        @Expose
        @SerializedName("URL")
        var URL : String? = null
)