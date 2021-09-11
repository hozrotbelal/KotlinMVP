package com.example.testmvp.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(

        @Expose
        @SerializedName("FirstName")
        var FirstName: String? = null,

        @Expose
        @SerializedName("LastName")
        var LastName: String? = null,

        @Expose
        @SerializedName("UserName")
        var UserName: String? = null,

        @Expose
        @SerializedName("Name")
        var Name: String? = null,

        @Expose
        @SerializedName("ProfileImageUrl")
        var ProfileImageUrl: String? = null,

        @Expose
        @SerializedName("CoverImageUrl")
        var CoverImageUrl: String? = null,

        @Expose
        @SerializedName("ProfileUrl")
        var ProfileUrl: String? = null,

        @Expose
        @SerializedName("IsFirstLogin")
        var IsFirstLogin: Boolean = false,

        @Expose
        @SerializedName("MobileNumber")
        var MobileNumber: String? = null,

        @Expose
        @SerializedName("IsMobileNumberVerified")
        var IsMobileNumberVerified: Boolean = false,


        @Expose
        @SerializedName("IsNationalIDNumberVerified")
        var IsNationalIDNumberVerified: Boolean = false,

        @Expose
        @SerializedName("IsDrivingLicenseVerified")
        var IsDrivingLicenseVerified: Boolean = false,

        @Expose
        @SerializedName("IsRegistrationNumberVerified")
        var IsRegistrationNumberVerified: Boolean = false,

        @Expose
        @SerializedName("IsTradeLicenseNoVerified")
        var IsTradeLicenseNoVerified: Boolean = false,

        @Expose
        @SerializedName("IsCompanyDocumentsVerified")
        var IsCompanyDocumentsVerified: Boolean = false,

        @Expose
        @SerializedName("NationalIDNumberURL")
        var NationalIDNumberURL: String? = null,

        @Expose
        @SerializedName("DrivingLicenseURL")
        var DrivingLicenseURL: String? = null,

        @Expose
        @SerializedName("RegistrationNumberURL")
        var RegistrationNumberURL: String? = null,

        @Expose
        @SerializedName("TradeLicenseNoURL")
        var TradeLicenseNoURL: String? = null,

        @Expose
        @SerializedName("CompanyDocumentsURL")
        var CompanyDocumentsURL: String? = null,

        @Expose
        @SerializedName("IsProfileImageVerified")
        var IsProfileImageVerified: Boolean = false,

        @Expose
        @SerializedName("IsEmailVerified")
        var IsEmailVerified: Boolean = false,

        @Expose
        @SerializedName("Headline")
        var Headline: String? = null,

        @Expose
        @SerializedName("BriefBio")
        var BriefBio: String? = null,

        @Expose
        @SerializedName("ReferenceId")
        var ReferenceId: String? = null,

        @Expose
        @SerializedName("ReferenceType")
        var ReferenceType: String? = null,

        @Expose
        @SerializedName("Remarks")
        var Remarks: String? = null,

        @Expose
        @SerializedName("Locations")
        var Locations: String? = null,

        @Expose
        @SerializedName("UserProfileUrl")
        var UserProfileUrl: String? = null,

        @Expose
        @SerializedName("Id")
        var Id: Long = 0,

        @Expose
        @SerializedName("Email")
        var Email: String? = null,

        @Expose
        @SerializedName("ProfileImageId")
        var ProfileImageId: Int? = 0,

        @Expose
        @SerializedName("CoverImageId")
        var CoverImageId: Int? = 0,

        @Expose
        @SerializedName("StanfordWorkplaceURL")
        var StanfordWorkplaceURL: String? = null,

        @Expose
        @SerializedName("Cohort")
        var Cohort: String? = null,

        @Expose
        @SerializedName("CommunityId")
        var CommunityId: String? = null,

        @Expose
        @SerializedName("DateofBirth")
        var DateofBirth: String? = null,

        @Expose
        @SerializedName("Address")
        var Address: String? = null,

        @Expose
        @SerializedName("PermanentAddress")
        var PermanentAddress: String? = null,

        @Expose
        @SerializedName("DateCreatedLocal")
        var DateCreatedLocal: String? = null,

        @Expose
        @SerializedName("IsOnline")
        var IsOnline: Boolean? = false,

        @Expose
        @SerializedName("LastLoginDate")
        var LastLoginDate: String? = null,

        @Expose
        @SerializedName("Latitude")
        var Latitude: String? = null,

        @Expose
        @SerializedName("Longitude")
        var Longitude: String? = null,

        @Expose
        @SerializedName("UnreadNotificationCount")
        var UnreadNotificationCount: Int? = 0,


        @Expose
        @SerializedName("NationalIDVerifiedStatus")
        var NationalIDVerifiedStatus: Int? = 0,
        @Expose
        @SerializedName("BankVerifiedStatus")
        var BankVerifiedStatus: Int? = 0,


        @Expose
        @SerializedName("DisplayId")
        var DisplayId: String? = null,

        @Expose
        @SerializedName("FatherName")
        var FatherName: String? = null,

        @Expose
        @SerializedName("NationalIDNumber")
        var NationalIDNumber: String? = null,

        @Expose
        @SerializedName("RegistrationNumber")
        var RegistrationNumber: String? = null,


        @Expose
        @SerializedName("Profession")
        var Profession: String? = null,


        @Expose
        @SerializedName("DrivingLicenseNo")
        var DrivingLicenseNo: String? = null,

        @Expose
        @SerializedName("VehicleType")
        var VehicleType: String? = null,

        @Expose
        @SerializedName("VehicleCapacity")
        var VehicleCapacity: String? = null,

        @Expose
        @SerializedName("VehicleSize")
        var VehicleSize: String? = null,

        @Expose
        @SerializedName("WorkingArea")
        var WorkingArea: String? = null,

        @Expose
        @SerializedName("WorkingAddress")
        var WorkingAddress: String? = null,

        @Expose
        @SerializedName("EmergencyContactNo")
        var EmergencyContactNo: String? = null,

        @Expose
        @SerializedName("CompanyID")
        var CompanyID: String? = null,

        @Expose
        @SerializedName("CompanyName")
        var CompanyName: String? = null,

        @Expose
        @SerializedName("Tag")
        var Tag: String? = null,

        @Expose
        @SerializedName("CreatedBy")
        var CreatedBy: Long? = 0,

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
        @SerializedName("RoleId")
        var RoleId: Int? = 0,

        @Expose
        @SerializedName("UserAccesType")
        var UserAccesType: Int? = 0,


        @Expose
        @SerializedName("UserType")
        var UserType: Int? = 0

)