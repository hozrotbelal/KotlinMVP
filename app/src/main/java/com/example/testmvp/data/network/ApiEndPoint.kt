package com.example.testmvp.data.network

import com.example.testmvp.BuildConfig

object ApiEndPoint {


    var BASE_API_URL = "http://demo.trux24.com/"
//    val ENDPOINT_GOOGLE_LOGIN = BuildConfig.BASE_URL + "/588d14f4100000a9072d2943"
//    val ENDPOINT_FACEBOOK_LOGIN = BuildConfig.BASE_URL + "/588d15d3100000ae072d2944"
//    val ENDPOINT_SERVER_LOGIN = BuildConfig.BASE_URL + "/588d15f5100000a8072d2945"
//    val ENDPOINT_LOGOUT = BuildConfig.BASE_URL + "/588d161c100000a9072d2946"
//    val ENDPOINT_BLOG = BuildConfig.BASE_URL + "/5926ce9d11000096006ccb30"
//    val ENDPOINT_OPEN_SOURCE = BuildConfig.BASE_URL + "/5926c34212000035026871cd"

    // Location
    val ENDPOINT_SERVER_GET_ALL_LOCATION_GET = "$BASE_API_URL/api/address/getall"
    val ENDPOINT_SERVER_GET_ALL_DIVISION_GET = "$BASE_API_URL/api/address/getdivisions"
    val ENDPOINT_SERVER_GET_ALL_DISTRICT_GET = "$BASE_API_URL/api/address/getdistricts"
    val ENDPOINT_SERVER_GET_ALL_THANA_GET = "$BASE_API_URL/api/address/getthanas"
    val ENDPOINT_SERVER_GET_ALL_UNION_GET = "$BASE_API_URL/api/address/getunions"
    val ENDPOINT_SERVER_GET_ALL_UNION_BY_THANA_GET = "$BASE_API_URL/api/address/getunionsbythana"

}