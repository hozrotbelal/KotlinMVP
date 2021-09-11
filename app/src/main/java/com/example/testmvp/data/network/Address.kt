package com.example.testmvp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Address {


    data class Division internal constructor(
            @Expose
            @SerializedName("Id")
            internal val Id: Int,
            @Expose
            @SerializedName("Name")
            internal val Name: String,
            @Expose
            @SerializedName("NameBN")
            internal val NameBN: String,
            @Expose
            @SerializedName("Latitude")
            var Latitude: Double = 0.0,
            @Expose
            @SerializedName("Longitude")
            var Longitude: Double = 0.0,
            @Expose
            @SerializedName("ItemCount")
            internal val ItemCount: Int = 0)

    data class District internal constructor(
            @Expose
            @SerializedName("Id")
            internal val Id: Int,
            @Expose
            @SerializedName("DivisionId")
            internal val DivisionId: Int,
            @Expose
            @SerializedName("Name")
            internal val Name: String,
            @Expose
            @SerializedName("NameBN")
            internal val NameBN: String,
            @Expose
            @SerializedName("Latitude")
            var Latitude: Double = 0.0,
            @Expose
            @SerializedName("Longitude")
            var Longitude: Double = 0.0,
            @Expose
            @SerializedName("ItemCount")
            internal val ItemCount: Int = 0)

    data class Thana internal constructor(
            @Expose
            @SerializedName("Id")
            internal val Id: Int,
            @Expose
            @SerializedName("DistrictId")
            internal val DistrictId: Int,
            @Expose
            @SerializedName("Name")
            internal val Name: String,
            @Expose
            @SerializedName("NameBN")
            internal val NameBN: String,

            @Expose
            @SerializedName("HasUnion")
            internal val HasUnion: Boolean = false,

            @Expose
            @SerializedName("Latitude")
            var Latitude: Double = 0.0,
            @Expose
            @SerializedName("Longitude")
            var Longitude: Double = 0.0,
            @Expose
            @SerializedName("ItemCount")
            internal val ItemCount: Int = 0)

    data class Union internal constructor(
            @Expose
            @SerializedName("Id")
            internal val Id: Int,
            @Expose
            @SerializedName("ThanaId")
            internal val ThanaId: Int,
            @Expose
            @SerializedName("Name")
            internal val Name: String,
            @Expose
            @SerializedName("NameBN")
            internal val NameBN: String,
            @Expose
            @SerializedName("Latitude")
            var Latitude: Double = 0.0,
            @Expose
            @SerializedName("Longitude")
            var Longitude: Double = 0.0,
            @Expose
            @SerializedName("ItemCount")
            internal val ItemCount: Int = 0)

    data class AddressResponse(

            @Expose
            @SerializedName("Success")
            private var Success: Boolean = false,

            @Expose
            @SerializedName("ResponseData")
            var ResponseData: ResponseData? = null
    )

    data class Location internal constructor(
                @Expose
                @SerializedName("Id")
                internal val Id: Int,
                @Expose
                @SerializedName("Name")
                internal val Name: String,
                @Expose
                @SerializedName("Type")
                internal val Type: Int,
                @Expose
                @SerializedName("Latitude")
                var Latitude: Double = 0.0,
                @Expose
                @SerializedName("Longitude")
                var Longitude: Double = 0.0,
                @Expose
                @SerializedName("ItemCount")
                internal val ItemCount: Int = 0,
                @Expose
                @SerializedName("LocationText")
                internal val LocationText: String = "",

                @Expose
                @SerializedName("Ids")
                internal val Ids: String = ""
    )




    data class TaskAddressAll(
            @Expose
            @SerializedName("Type")
            var Type: Int = 0,

            @Expose
            @SerializedName("Name")
            var Name : String = "",

            @Expose
            @SerializedName("NameBN")
            var NameBN  : String = ""
            )

    data class SearchAddress(
            @Expose
            @SerializedName("Id")
            var Id: String = "",

            @Expose
            @SerializedName("Name")
            var Name : String = "",

            @Expose
            @SerializedName("NameBN")
            var NameBN  : String = ""
    )



    data class TaskLocationOther(

            @Expose
            @SerializedName("Id")
            val Id: Int = 0,

            @Expose
            @SerializedName("Type")
            val Type: Int = 0,

            @Expose
            @SerializedName("OrderId")
            val OrderId : Int = 0,

            @Expose
            @SerializedName("AddressText")
            val AddressText: String = "",

            @Expose
            @SerializedName("DivisionId")
            var DivisionId: Int? = 0,

            @Expose
            @SerializedName("DistrictId")
            var DistrictId: Int? = 0,

            @Expose
            @SerializedName("ThanaId")
            var ThanaId: Int? = 0,

            @Expose
            @SerializedName("UnionId")
            var UnionId: Int? = 0,

            @Expose
            @SerializedName("LocationName")
            var LocationName : String? = "",

            @Expose
            @SerializedName("LocationNameBN")
            var LocationNameBN : String? = "",

            @Expose
            @SerializedName("PreferredLocationId")
            var PreferredLocationId: Int? = 0

    ): java.io.Serializable



    data class SelectedLocation (
                var DivisionId: Int? = 0,
                var DivisionName: String? = "",
                var DistrictId: Int? = 0,
                var DistrictName: String? = "",
                var ThanaId: Int? = 0,
                var ThanaName: String? = "",
                var UnionId: Int? = 0,
                var UnionName: String? = "",
                var FullLocationName: String? = "",
                var Latitude: Double? = 0.0,
                var Longitude: Double? = 0.0,
                var Id: Int? = 0
    ): java.io.Serializable
}