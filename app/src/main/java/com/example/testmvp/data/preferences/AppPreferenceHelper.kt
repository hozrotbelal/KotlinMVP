package com.example.testmvp.data.preferences

import android.content.Context
import android.content.SharedPreferences
import android.provider.Settings.Global.putString
import com.example.testmvp.di.PreferenceInfo
import com.example.testmvp.util.AppConstants
import javax.inject.Inject


class AppPreferenceHelper @Inject constructor(context: Context, @PreferenceInfo private val prefFileName: String) : PreferenceHelper {


    companion object {
        private val PREF_KEY_USER_LOGGED_IN_MODE = "PREF_KEY_USER_LOGGED_IN_MODE"
        private val PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID"
        private val PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN"
        private val PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME"
        private val PREF_KEY_CURRENT_USER_EMAIL = "PREF_KEY_CURRENT_USER_EMAIL"
        private val PREF_KEY_CURRENT_USER_EMAIL_VERIFIED = "PREF_KEY_CURRENT_USER_EMAIL_VERIFIED"
        private val PREF_KEY_ACCESS_COOKIE = "PREF_KEY_ACCESS_COOKIE"
        private val PREF_KEY_ACCESS_COOKIE_DATE = "PREF_KEY_ACCESS_COOKIE_DATE"

        private val PREF_KEY_CURRENT_USER_PASSWORD = "PREF_KEY_CURRENT_USER_PASSWORD"
        private val PREF_KEY_CURRENT_USER_REGION = "PREF_KEY_CURRENT_USER_REGION"
        //   private val PREF_KEY_CURRENT_USER_HOME = "PREF_KEY_CURRENT_USER_HOME"
        private val PREF_KEY_CURRENT_USER_IS_POST_TASK = "PREF_KEY_CURRENT_USER_IS_POST_TASK"
        private val PREF_KEY_CURRENT_USER_IS_COMPLETE_TASK = "PREF_KEY_CURRENT_USER_IS_COMPLETE_TASK"


        private val PREF_KEY_FIRST_NAME = "PREF_KEY_FIRST_NAME"
        private val PREF_KEY_LAST_NAME = "PREF_KEY_LAST_NAME"
        private val PREF_KEY_BRIEF_BIO = "PREF_KEY_BRIEF_BIO"
        private val PREF_KEY_HEADLINE = "PREF_KEY_HEADLINE"
        private val PREF_KEY_MOBILE_NUMBER = "PREF_KEY_MOBILE_NUMBER"
        private val PREF_KEY_OTHORIZE_MOBILE_NUMBER = "PREF_KEY_OTHORIZE_MOBILE_NUMBER"
        private val PREF_KEY_IS_MOBILE_NUMBER_VERIFIED = "PREF_KEY_IS_MOBILE_NUMBER_VERIFIED"
        private val PREF_KEY_DATE_OF_BIRTH = "PREF_KEY_DATE_OF_BIRTH"
        private val PREF_KEY_ADDRESS = "PREF_KEY_ADDRESS"
        private val PREF_KEY_CURRENT_USER_DIVISION_ID = "PREF_KEY_CURRENT_USER_DIVISION_ID"
        private val PREF_KEY_CURRENT_USER_DISTRICT_ID = "PREF_KEY_CURRENT_USER_DISTRICT_ID"
        private val PREF_KEY_CURRENT_USER_THANA_ID= "PREF_KEY_CURRENT_USER_THANA_ID"
        private val PREF_KEY_CURRENT_USER_UNION_ID = "PREF_KEY_CURRENT_USER_UNION_ID"

        private val PREF_KEY_PERMANENT_ADDRESS = "PREF_KEY_PERMANENT_ADDRESS"
        private val PREF_KEY_NID_NUMBER = "PREF_KEY_NID_NUMBER"
        private val PREF_KEY_IS_NID_NUMBER_VERIFIED = "PREF_KEY_IS_NID_NUMBER_VERIFIED"

        private val PREF_KEY_BILLING_ADDRESS = "PREF_KEY_BILLING_ADDRESS"
        private val PREF_KEY_BANK_ACCOUNT = "PREF_KEY_BANK_ACCOUNT"

        private val PREF_KEY_IS_TRANSACTIONAL_EMAIL = "PREF_KEY_IS_TRANSACTIONAL_EMAIL"
        private val PREF_KEY_IS_TRANSACTIONAL_NOTIFICATION = "PREF_KEY_IS_TRANSACTIONAL_NOTIFICATION"
        private val PREF_KEY_IS_TRANSACTIONAL_SMS = "PREF_KEY_IS_TRANSACTIONAL_SMS"


        private val PREF_KEY_PROFILE_IMAGE_URL = "PREF_KEY_PROFILE_IMAGE_URL"
        private val PREF_KEY_PROFILE_IMAGE_ID = "PREF_KEY_PROFILE_IMAGE_ID"
        private val PREF_KEY_COVER_IMAGE_URL = "PREF_KEY_COVER_IMAGE_URL"
        private val PREF_KEY_COVER_IMAGE_ID = "PREF_KEY_COVER_IMAGE_ID"
        private val PREF_KEY_NATIONAL_ID_CARD_IMAGE_URL = "PREF_KEY_NATIONAL_ID_CARD_IMAGE_URL"
        private val PREF_KEY_DRIVING_LICENCE_NO_IMAGE_URL = "PREF_KEY_DRIVING_LICENCE_NO_IMAGE_URL"
        private val PREF_KEY_TRADE_LICENCE_NO_IMAGE_URL = "PREF_KEY_TRADE_LICENCE_NO_IMAGE_URL"
        private val PREF_KEY_CORPORATE_COMPANY_DOCUMENT_IMAGE_URL = "PREF_KEY_CORPORATE_COMPANY_DOCUMENT_IMAGE_URL"
        private val PREF_KEY_REGISTRATION_NO_CARD_IMAGE_URL = "PREF_KEY_REGISTRATION_NO_CARD_IMAGE_URL"
        private val PREF_KEY_IS_NATIONAL_ID_NUMBER_VERIFIED = "PREF_KEY_IS_NATIONAL_ID_NUMBER_VERIFIED"
        private val PREF_KEY_NATIONAL_ID_NUMBER = "PREF_KEY_NATIONAL_ID_NUMBER"
        private val PREF_KEY_IS_DRIVING_LICENCE_NO_VERIFIED = "PREF_KEY_IS_DRIVING_LICENCE_NO_VERIFIED"
        private val PREF_KEY_DRIVING_LICENCE_NO = "PREF_KEY_DRIVING_LICENCE_NO"
        private val PREF_KEY_IS_REGISTRATION_NUMBER_VERIFIED = "PREF_KEY_IS_REGISTRATION_NUMBER_VERIFIED"
        private val PREF_KEY_IS_TRADE_LICENCE_NO_VERIFIED = "PREF_KEY_IS_TRADE_LICENCE_NO_VERIFIED"
        private val PREF_KEY_IS_CORPORATE_COMPANY_DOCUMENT_VERIFIED = "PREF_KEY_IS_CORPORATE_COMPANY_DOCUMENT_VERIFIED"
        private val PREF_KEY_REGISTRATION_NUMBER = "PREF_KEY_REGISTRATION_NUMBER"
        private val PREF_KEY_DISPLAY_ID = "PREF_KEY_DISPLAY_ID"
        private val PREF_KEY_FATHER_NAME = "PREF_KEY_FATHER_NAME"
        private val PREF_KEY_PROFESSION = "PREF_KEY_PROFESSION"
        private val PREF_KEY_VEHICLE_TYPE = "PREF_KEY_VEHICLE_TYPE"
        private val PREF_KEY_VEHICLE_CAPACITY = "PREF_KEY_VEHICLE_CAPACITY"
        private val PREF_KEY_VEHICLE_SIZE = "PREF_KEY_VEHICLE_SIZE"
        private val PREF_KEY_WORKING_AREA = "PREF_KEY_WORKING_AREA"
        private val PREF_KEY_WORKING_ADDRESS = "PREF_KEY_WORKING_ADDRESS"
        private val PREF_KEY_EMERGENCY_CONTACT_NO = "PREF_KEY_EMERGENCY_CONTACT_NO"
        private val PREF_KEY_COMPANY_NAME = "PREF_KEY_COMPANY_NAME"
        private val PREF_KEY_TAG = "PREF_KEY_TAG"
        private val PREF_KEY_USER_TYPE = "PREF_KEY_USER_TYPE"
        private val PREF_KEY_USER_ACCESS_TYPE = "PREF_KEY_USER_ACCESS_TYPE"
        private val PREF_KEY_STANFORD_WORKPLACE_URL = "PREF_KEY_STANFORD_WORKPLACE_URL"
        private val PREF_KEY_REFERENCE_ID = "PREF_KEY_REFERENCE_ID"
        private val PREF_KEY_REFERENCE_TYPE = "PREF_KEY_REFERENCE_TYPE"
        private val PREF_KEY_REMARKS = "PREF_KEY_REMARKS"
        private val PREF_KEY_LOCATIONS = "PREF_KEY_LOCATIONS"
        private val PREF_KEY_COHORT = "PREF_KEY_COHORT"
        private val PREF_KEY_COMMUNITY_ID = "PREF_KEY_COMMUNITY_ID"
        private val PREF_KEY_USER_PROFILE_URL = "PREF_KEY_USER_PROFILE_URL"
        private val PREF_KEY_FCMTOKEN = "FCM_TOKEN"
        private val PREF_KEY_USER_DATE_JOINED = "PREF_KEY_USER_DATE_JOINED"


        private val PREF_KEY_SETTING_AUDIO = "PREF_KEY_SETTING_AUDIO"

        private val PREF_KEY_APPLICATION_LOCALE = "PREF_KEY_APPLICATION_LOCALE"

        private val PREF_KEY_BROWSE_TASK_FILTER_IS_PERSON = "PREF_KEY_BROWSE_TASK_FILTER_IS_PERSON"
        private val PREF_KEY_BROWSE_TASK_FILTER_IS_REMOTE = "PREF_KEY_BROWSE_TASK_FILTER_IS_REMOTE"
        private val PREF_KEY_BROWSE_TASK_FILTER_IS_ALL = "PREF_KEY_BROWSE_TASK_FILTER_IS_ALL"
        private val PREF_KEY_BROWSE_TASK_FILTER_IS_DISTANCE = "PREF_KEY_BROWSE_TASK_FILTER_IS_DISTANCE"
        private val PREF_KEY_BROWSE_TASK_FILTER_FROM_PRICE = "PREF_KEY_BROWSE_TASK_FILTER_FROM_PRICE"
        private val PREF_KEY_BROWSE_TASK_FILTER_TO_PRICE = "PREF_KEY_BROWSE_TASK_FILTER_TO_PRICE"
        private val PREF_KEY_BROWSE_TASK_FILTER_TO_VEHICLE_TYPE = "PREF_KEY_BROWSE_TASK_FILTER_TO_VEHICLE_TYPE"
        private val PREF_KEY_BROWSE_TASK_FILTER_TO_VEHICLE_CAPACITY = "PREF_KEY_BROWSE_TASK_FILTER_TO_VEHICLE_CAPACITY"
        private val PREF_KEY_BROWSE_TASK_FILTER_TO_VEHICLE_SIZE = "PREF_KEY_BROWSE_TASK_FILTER_TO_VEHICLE_SIZE"
        private val PREF_KEY_BROWSE_TASK_FILTER_TO_ADDRESS = "PREF_KEY_BROWSE_TASK_FILTER_TO_ADDRESS"
        private val PREF_KEY_BROWSE_TASK_FILTER_TO_DIVISION_ID = "PREF_KEY_BROWSE_TASK_FILTER_TO_DIVISION_ID"
        private val PREF_KEY_BROWSE_TASK_FILTER_TO_DISTRICT_ID = "PREF_KEY_BROWSE_TASK_FILTER_TO_DISTRICT_ID"
        private val PREF_KEY_BROWSE_TASK_FILTER_TO_THANA_ID = "PREF_KEY_BROWSE_TASK_FILTER_TO_THANA_ID"
        private val PREF_KEY_BROWSE_TASK_FILTER_TO_UNION_ID = "PREF_KEY_BROWSE_TASK_FILTER_TO_UNION_ID"

        private val PREF_KEY_USER_ADDRESS_LATITUDE = "PREF_KEY_USER_ADDRESS_LATITUDE"
        private val PREF_KEY_USER_ADDRESS_LONGITUDE = "PREF_KEY_USER_ADDRESS_LONGITUDE"
        private val PREF_KEY_USER_TAG = "PREF_KEY_USER_TAG"

        private val PREF_KEY_USER_UNREAD_NOTIFICATION = "PREF_KEY_USER_UNREAD_NOTIFICATION"


        private val PREF_KEY_IS_FIRST_INSTALL = "PREF_KEY_IS_FIRST_INSTALL"
        private val PREF_KEY_IS_SHOW_TUTORIAL = "PREF_KEY_IS_SHOW_TUTORIAL"


        private val PREF_KEY_USER_DEVICE_DATE_BROWSE_TASK = "PREF_KEY_USER_DEVICE_DATE_BROWSE_TASK"
        private val PREF_KEY_USER_DEVICE_DATE_TASK_CATEGORY = "PREF_KEY_USER_DEVICE_DATE_TASK_CATEGORY"


        private val PREF_KEY_USER_SEND_PAYMENT_METHOD_BIKASH = "PREF_KEY_USER_SEND_PAYMENT_METHOD_BIKASH"
        private val PREF_KEY_USER_SEND_PAYMENT_METHOD_ROCKET = "PREF_KEY_USER_SEND_PAYMENT_METHOD_ROCKET"
        private val PREF_KEY_USER_SEND_PAYMENT_METHOD_BANK = "PREF_KEY_USER_SEND_PAYMENT_METHOD_BANK"
    }

    private val mPrefs: SharedPreferences = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)

    override fun getCurrentUserLoggedInMode() = mPrefs.getInt(PREF_KEY_USER_LOGGED_IN_MODE, AppConstants.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.type)
 //   override fun getAccessCookie(): String?  = mPrefs.getString(PREF_KEY_ACCESS_COOKIE, "")



    //  override fun getAccessCookie(): String = mPrefs.getString(PREF_KEY_ACCESS_COOKIE, "")
//
//
//   override fun setAccessCookieDate(FirstName: String?) = mPrefs.edit { putString(PREF_KEY_ACCESS_COOKIE_DATE, FirstName) }
//
//    override fun getAccessCookieDate(): String = mPrefs.getString(PREF_KEY_ACCESS_COOKIE_DATE, "")
//

//    override fun getCurrentUserName(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_NAME, "")
//
//    override fun setCurrentUserName(userName: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_NAME, userName) }
//
//    override fun getCurrentUserEmail(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_EMAIL, "")
//
//    override fun setCurrentUserEmail(email: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_EMAIL, email) }
//
//    override fun setCurrentUserIsEmailVerified(IsUserEmailVerified: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_CURRENT_USER_EMAIL_VERIFIED, IsUserEmailVerified) }
//
//    override fun getCurrentUserIsEmailVerified(): Boolean = mPrefs.getBoolean(PREF_KEY_CURRENT_USER_EMAIL_VERIFIED, false)
//
//    override fun getAccessToken(): String = mPrefs.getString(PREF_KEY_ACCESS_TOKEN, "")
//
//    override fun setAccessToken(accessToken: String?) = mPrefs.edit { putString(PREF_KEY_ACCESS_TOKEN, accessToken) }
//
//
//    override fun getCurrentUserId(): Long? {
//        val userId = mPrefs.getLong(PREF_KEY_CURRENT_USER_ID, AppConstants.NULL_INDEX)
//        return when (userId) {
//            AppConstants.NULL_INDEX -> null
//            else -> userId
//        }
//    }
//
//    override fun setCurrentUserId(userId: Long?) {
//        val id = userId ?: AppConstants.NULL_INDEX
//        mPrefs.edit { putLong(PREF_KEY_CURRENT_USER_ID, id) }
//    }
//
//    override fun setCurrentUserLoggedInMode(mode: AppConstants.LoggedInMode) {
//        mPrefs.edit { putInt(PREF_KEY_USER_LOGGED_IN_MODE, mode.type) }
//    }
//
//    override fun setAccessCookie(cookieToken: String?) {
//        ApiHeader.PrivateApiHeader(cookieKey = cookieToken)
//        mPrefs.edit { putString(PREF_KEY_ACCESS_COOKIE, cookieToken) }
//    }
//
 //  override fun getAccessCookie(): String = mPrefs.getString(PREF_KEY_ACCESS_COOKIE, "")
//
//
//   override fun setAccessCookieDate(FirstName: String?) = mPrefs.edit { putString(PREF_KEY_ACCESS_COOKIE_DATE, FirstName) }
//
//    override fun getAccessCookieDate(): String = mPrefs.getString(PREF_KEY_ACCESS_COOKIE_DATE, "")
//
//    override fun setCurrentUserFirstName(FirstName: String?) = mPrefs.edit { putString(PREF_KEY_FIRST_NAME, FirstName) }
//
//    override fun getCurrentUserFirstName(): String = mPrefs.getString(PREF_KEY_FIRST_NAME, "")
//
//    override fun setCurrentUserLastName(LastName: String?) = mPrefs.edit { putString(PREF_KEY_LAST_NAME, LastName) }
//
//    override fun getCurrentLastName(): String = mPrefs.getString(PREF_KEY_LAST_NAME, "")
//
//    override fun setCurrentUserBriefBio(BriefBio: String?) = mPrefs.edit { putString(PREF_KEY_BRIEF_BIO, BriefBio) }
//
//    override fun getCurrentUserBriefBio(): String = mPrefs.getString(PREF_KEY_BRIEF_BIO, "")
//
//    override fun setCurrentUserHeadline(Headline: String?) = mPrefs.edit { putString(PREF_KEY_HEADLINE, Headline) }
//
//    override fun getCurrentUserHeadline(): String = mPrefs.getString(PREF_KEY_HEADLINE, "")
//
//    override fun setCurrentUserMobileNumber(MobileNumber: String?) = mPrefs.edit { putString(PREF_KEY_MOBILE_NUMBER, MobileNumber) }
//
//    override fun getCurrentUserMobileNumber(): String = mPrefs.getString(PREF_KEY_MOBILE_NUMBER, "")
//
//    override fun setOthorizeMobileNumber(MobileNumber: String?) = mPrefs.edit { putString(PREF_KEY_OTHORIZE_MOBILE_NUMBER, MobileNumber) }
//
//    override fun getOthorizeMobileNumber(): String = mPrefs.getString(PREF_KEY_OTHORIZE_MOBILE_NUMBER, "")
//
//    override fun setCurrentUserIsMobileNumberVerified(IsMobileNumberVerified: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_IS_MOBILE_NUMBER_VERIFIED, IsMobileNumberVerified) }
//
//    override fun getCurrentUserIsMobileNumberVerified(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_MOBILE_NUMBER_VERIFIED, false)
//
//    override fun setCurrentUserNIDNumberVerifiedStatus(NIDNumber: Int) = mPrefs.edit { putInt(PREF_KEY_NID_NUMBER, NIDNumber) }
//
//    override fun getCurrentUserNIDNumberVerifiedStatus(): Int = mPrefs.getInt(PREF_KEY_NID_NUMBER, 0)
//
//    override fun setCurrentUserIsNIDNumberVerified(IsNIDNumberVerified: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_IS_NID_NUMBER_VERIFIED, IsNIDNumberVerified) }
//
//    override fun getCurrentUserIsNIDNumberVerified(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_NID_NUMBER_VERIFIED, false)
//
//    override fun setCurrentUserDateofBirth(DateofBirth: String?) = mPrefs.edit { putString(PREF_KEY_DATE_OF_BIRTH, DateofBirth) }
//
//    override fun getCurrentDateofBirth(): String = mPrefs.getString(PREF_KEY_DATE_OF_BIRTH, "")
//
//    override fun setCurrentUserAddress(Address: String?) = mPrefs.edit { putString(PREF_KEY_ADDRESS, Address) }
//
//    override fun getCurrentUserAddress(): String = mPrefs.getString(PREF_KEY_ADDRESS, "")
//
//    override fun getCurrentUserDivisionID(): Int = mPrefs.getInt(PREF_KEY_CURRENT_USER_DIVISION_ID, 0)
//
//    override fun setCurrentUserDivisionID(DivisionID: Int?) = mPrefs.edit { putInt(PREF_KEY_CURRENT_USER_DIVISION_ID, DivisionID ?: 0) }
//
//    override fun getCurrentUserDistrictID(): Int = mPrefs.getInt(PREF_KEY_CURRENT_USER_DISTRICT_ID, 0)
//
//    override fun setCurrentUserDistrictID(DistrictID: Int?) = mPrefs.edit { putInt(PREF_KEY_CURRENT_USER_DISTRICT_ID, DistrictID?: 0) }
//
//    override fun getCurrentUserThanaID(): Int = mPrefs.getInt(PREF_KEY_CURRENT_USER_THANA_ID, 0)
//
//    override fun setCurrentUserThanaID(ThanaID: Int?) = mPrefs.edit { putInt(PREF_KEY_CURRENT_USER_THANA_ID, ThanaID ?: 0) }
//
//    override fun getCurrentUserUnionID(): Int = mPrefs.getInt(PREF_KEY_CURRENT_USER_UNION_ID, 0)
//
//    override fun setCurrentUserUnionID(UnionID: Int?) = mPrefs.edit { putInt(PREF_KEY_CURRENT_USER_UNION_ID, UnionID ?: 0) }
//
//    override fun setCurrentUserPermanentAddress(PermanentAddress: String?) = mPrefs.edit { putString(PREF_KEY_PERMANENT_ADDRESS, PermanentAddress) }
//
//    override fun getCurrentUserPermanentAddress(): String = mPrefs.getString(PREF_KEY_PERMANENT_ADDRESS, "")
//
//    override fun setCurrentUserBillingAddress(BillingAddress: String?) = mPrefs.edit { putString(PREF_KEY_BILLING_ADDRESS, BillingAddress) }
//
//    override fun getCurrentUserBillingAddress(): String = mPrefs.getString(PREF_KEY_BILLING_ADDRESS, "")
//
//    override fun setCurrentUserBankAccount(BankAccount: Int) = mPrefs.edit { putInt(PREF_KEY_BANK_ACCOUNT, BankAccount) }
//
//    override fun getCurrentUserBankAccount(): Int = mPrefs.getInt(PREF_KEY_BANK_ACCOUNT, 0)
//
//    override fun setCurrentUserIsTransactionalEmail(IsTransactionalEmail: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_IS_TRANSACTIONAL_EMAIL, IsTransactionalEmail) }
//
//    override fun getCurrentIsTransactionalEmail(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_TRANSACTIONAL_EMAIL, false)
//
//    override fun setCurrentUserIsTransactionalSMS(IsTransactionalSMS: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_IS_TRANSACTIONAL_SMS, IsTransactionalSMS) }
//
//    override fun getCurrentIsTransactionalSMS(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_TRANSACTIONAL_SMS, false)
//
//    override fun setCurrentUserIsTransactionalNotification(IsTransactionalNotification: Boolean) = mPrefs.edit { putBoolean(AppPreferenceHelper.PREF_KEY_IS_TRANSACTIONAL_NOTIFICATION, IsTransactionalNotification) }
//
//    override fun getCurrentIsTransactionalNotification(): Boolean = mPrefs.getBoolean(AppPreferenceHelper.PREF_KEY_IS_TRANSACTIONAL_NOTIFICATION, false)
//
//    override fun setCurrentUserPassword(password: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_PASSWORD, password) }
//
//    override fun getCurrentUserPassword(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_PASSWORD, "")
//
//    override fun setCurrentUserRegion(region: String?) = mPrefs.edit { putString(PREF_KEY_CURRENT_USER_REGION, region) }
//
//    override fun getCurrentUserRegion(): String = mPrefs.getString(PREF_KEY_CURRENT_USER_REGION, "")
//
//    override fun setCurrentUserIsPostTask(postTask: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_CURRENT_USER_IS_POST_TASK, postTask) }
//
//    override fun getCurrentUserIsPostTask(): Boolean = mPrefs.getBoolean(PREF_KEY_CURRENT_USER_IS_POST_TASK, false)
//
//    override fun setCurrentUserIsCompleteTask(completeTask: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_CURRENT_USER_IS_COMPLETE_TASK, completeTask) }
//
//    override fun getCurrentUserIsCompleteTask(): Boolean = mPrefs.getBoolean(PREF_KEY_CURRENT_USER_IS_COMPLETE_TASK, false)
//
//    override fun getCurrentUserLastName(): String = mPrefs.getString(PREF_KEY_LAST_NAME, "")
//
//    override fun setCurrentUserProfileImageURL(ProfileImageUrl: String?) = mPrefs.edit { putString(PREF_KEY_PROFILE_IMAGE_URL, ProfileImageUrl) }
//
//    override fun getCurrentUserProfileImageURL(): String = mPrefs.getString(PREF_KEY_PROFILE_IMAGE_URL, "")
//
//    override fun getCurrentUserProfileImageID(): Int = mPrefs.getInt(PREF_KEY_PROFILE_IMAGE_ID, 0)
//
//    override fun setCurrentUserProfileImageID(ProfileImageId: Int) = mPrefs.edit { putInt(PREF_KEY_PROFILE_IMAGE_ID, ProfileImageId) }
//
//    override fun getCurrentUserCoverImageURL(): String = mPrefs.getString(PREF_KEY_COVER_IMAGE_URL, "")
//
//    override fun setCurrentUserCoverImageURL(CoverImageUrl: String?) = mPrefs.edit { putString(PREF_KEY_COVER_IMAGE_URL, CoverImageUrl) }
//
//    override fun getCurrentUserCoverImageID(): Int = mPrefs.getInt(PREF_KEY_COVER_IMAGE_ID, 0)
//
//    override fun setCurrentUserCoverImageID(CoverImageId: Int) = mPrefs.edit { putInt(PREF_KEY_COVER_IMAGE_ID, CoverImageId) }
//
//    override fun setCurrentUserNationalIDNumberImageURL(NationalIDNumberImageUrl: String?) = mPrefs.edit  { putString(PREF_KEY_NATIONAL_ID_CARD_IMAGE_URL, NationalIDNumberImageUrl) }
//
//    override fun getCurrentUserNationalIDNumberImageURL(): String = mPrefs.getString(PREF_KEY_NATIONAL_ID_CARD_IMAGE_URL, "")
//
//    override fun setCurrentUserDrivingLicenceNoImageURL(DrivingLicenceNoImageUrl: String?)  = mPrefs.edit  { putString(PREF_KEY_DRIVING_LICENCE_NO_IMAGE_URL, DrivingLicenceNoImageUrl) }
//
//    override fun getCurrentUserDrivingLicenceNoImageURL(): String = mPrefs.getString(PREF_KEY_DRIVING_LICENCE_NO_IMAGE_URL, "")
//
//    override fun setCurrentUserRegistrationNumberImageURL(RegistrationNumberImageUrl: String?) = mPrefs.edit  { putString(PREF_KEY_REGISTRATION_NO_CARD_IMAGE_URL, RegistrationNumberImageUrl) }
//
//    override fun getCurrentUserRegistrationNumberImageURL(): String = mPrefs.getString(PREF_KEY_REGISTRATION_NO_CARD_IMAGE_URL, "")
//
//    override fun setCurrentUserTradeLicenceNoImageURL(TradeLicenceNoImageUrl: String?) = mPrefs.edit  { putString(PREF_KEY_TRADE_LICENCE_NO_IMAGE_URL, TradeLicenceNoImageUrl) }
//
//    override fun getCurrentUserTradeLicenceNoImageURL(): String = mPrefs.getString(PREF_KEY_TRADE_LICENCE_NO_IMAGE_URL, "")
//
//    override fun setCurrentUserCorporateCompanyDocumentImageURL(CorporateCompanyDocumentImageUrl: String?) = mPrefs.edit  { putString(PREF_KEY_CORPORATE_COMPANY_DOCUMENT_IMAGE_URL, CorporateCompanyDocumentImageUrl) }
//
//    override fun getCurrentUserCorporateCompanyDocumentImageURL(): String = mPrefs.getString(PREF_KEY_CORPORATE_COMPANY_DOCUMENT_IMAGE_URL, "")
//
//    override fun setCurrentUserIsNationalIDNumberVerified(IsNationalIDNumberVerified: Boolean)  = mPrefs.edit { putBoolean(PREF_KEY_IS_NATIONAL_ID_NUMBER_VERIFIED, IsNationalIDNumberVerified) }
//
//    override fun getCurrentUserIsNationalIDNumberVerified(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_NATIONAL_ID_NUMBER_VERIFIED, false)
//
//    override fun setCurrentUserIsDrivingLicenseVerified(IsDrivingLicenseVerified: Boolean)  = mPrefs.edit { putBoolean(PREF_KEY_IS_DRIVING_LICENCE_NO_VERIFIED, IsDrivingLicenseVerified) }
//
//    override fun getCurrentUserIsDrivingLicenseVerified(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_DRIVING_LICENCE_NO_VERIFIED, false)
//
//    override fun setCurrentUserIsRegistrationNumberVerified(IsRegistrationNumberVerified: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_IS_REGISTRATION_NUMBER_VERIFIED, IsRegistrationNumberVerified) }
//
//    override fun getCurrentUserIsRegistrationNumberVerified(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_REGISTRATION_NUMBER_VERIFIED, false)
//
//    override fun setCurrentUserIsTradeLicenseNoVerified(IsTradeLicenseNoVerified: Boolean)  = mPrefs.edit { putBoolean(PREF_KEY_IS_TRADE_LICENCE_NO_VERIFIED, IsTradeLicenseNoVerified) }
//
//    override fun getCurrentUserIsTradeLicenseNoVerified(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_TRADE_LICENCE_NO_VERIFIED, false)
//
//    override fun setCurrentUserIsCorporateCompanyDocumentVerified(IsCorporateCompanyDocumentVerified: Boolean)  = mPrefs.edit { putBoolean(PREF_KEY_IS_CORPORATE_COMPANY_DOCUMENT_VERIFIED, IsCorporateCompanyDocumentVerified) }
//
//    override fun getCurrentUserIsCorporateCompanyDocumentVerified(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_CORPORATE_COMPANY_DOCUMENT_VERIFIED, false)
//
//    override fun setCurrentUserDisplayId(DisplayId: String?) = mPrefs.edit  { putString(PREF_KEY_DISPLAY_ID, DisplayId) }
//
//    override fun getCurrentUserDisplayId(): String = mPrefs.getString(PREF_KEY_DISPLAY_ID, "")
//
//    override fun setCurrentUserFatherName(FatherName: String?) = mPrefs.edit  { putString(PREF_KEY_FATHER_NAME, FatherName) }
//
//    override fun getCurrentUserFatherName(): String = mPrefs.getString(PREF_KEY_FATHER_NAME, "")
//
//    override fun setCurrentUserNationalIDNumber(NationalIDNumber: String?) = mPrefs.edit  { putString(PREF_KEY_NATIONAL_ID_NUMBER, NationalIDNumber) }
//
//    override fun getCurrentUserNationalIDNumber(): String = mPrefs.getString(PREF_KEY_NATIONAL_ID_NUMBER, "")
//
//    override fun setCurrentUserDrivingLicenseNo(DrivingLicenseNo: String?) = mPrefs.edit  { putString(PREF_KEY_DRIVING_LICENCE_NO, DrivingLicenseNo) }
//
//    override fun getCurrentUserDrivingLicenseNo(): String = mPrefs.getString(PREF_KEY_DRIVING_LICENCE_NO, "")
//
//    override fun setCurrentUserRegistrationNumber(RegistrationNumber: String?) = mPrefs.edit  { putString(PREF_KEY_REGISTRATION_NUMBER, RegistrationNumber) }
//
//    override fun getCurrentUserRegistrationNumber(): String = mPrefs.getString(PREF_KEY_REGISTRATION_NUMBER, "")
//
//    override fun setCurrentUserProfession(Profession: String?)= mPrefs.edit  { putString(PREF_KEY_PROFESSION, Profession) }
//
//    override fun getCurrentUserProfession(): String = mPrefs.getString(PREF_KEY_PROFESSION, "")
//
//    override fun setCurrentUserVehicleType(VehicleType: String?) = mPrefs.edit  { putString(PREF_KEY_VEHICLE_TYPE, VehicleType) }
//
//    override fun getCurrentUserVehicleType(): String = mPrefs.getString(PREF_KEY_VEHICLE_TYPE, "")
//
//    override fun setCurrentUserVehicleCapacity(VehicleCapacity: String?) = mPrefs.edit  { putString(PREF_KEY_VEHICLE_CAPACITY, VehicleCapacity) }
//
//    override fun getCurrentUserVehicleCapacity(): String = mPrefs.getString(PREF_KEY_VEHICLE_CAPACITY, "")
//
//    override fun setCurrentUserVehicleSize(VehicleSize: String?) = mPrefs.edit  { putString(PREF_KEY_VEHICLE_SIZE, VehicleSize) }
//
//    override fun getCurrentUserVehicleSize(): String = mPrefs.getString(PREF_KEY_VEHICLE_SIZE, "")
//
//    override fun setCurrentUserWorkingArea(WorkingArea: String?) = mPrefs.edit  { putString(PREF_KEY_WORKING_AREA, WorkingArea) }
//
//    override fun getCurrentUserWorkingArea(): String = mPrefs.getString(PREF_KEY_WORKING_AREA, "")
//
//    override fun setCurrentUserWorkingAddress(WorkingAddress: String?) = mPrefs.edit  { putString(PREF_KEY_WORKING_ADDRESS, WorkingAddress) }
//
//    override fun getCurrentUserWorkingAddress(): String = mPrefs.getString(PREF_KEY_WORKING_ADDRESS, "")
//
//    override fun setCurrentUserEmergencyContactNo(EmergencyContactNo: String?) = mPrefs.edit  { putString(PREF_KEY_EMERGENCY_CONTACT_NO, EmergencyContactNo) }
//
//    override fun getCurrentUserEmergencyContactNo(): String = mPrefs.getString(PREF_KEY_EMERGENCY_CONTACT_NO, "")
//
//    override fun setCurrentUserCompanyName(CompanyName: String?) = mPrefs.edit  { putString(PREF_KEY_COMPANY_NAME, CompanyName) }
//
//    override fun getCurrentUserCompanyName(): String = mPrefs.getString(PREF_KEY_COMPANY_NAME, "")
//
//    override fun setCurrentUserTag(Tag: String?) = mPrefs.edit  { putString(PREF_KEY_TAG, Tag) }
//
//    override fun getCurrentUserTag(): String = mPrefs.getString(PREF_KEY_TAG, "")
//
//    override fun getUserType(): Int = mPrefs.getInt(PREF_KEY_USER_TYPE,0)
//
//    override fun setUserType(UserType: Int?) = mPrefs.edit{putInt(PREF_KEY_USER_TYPE,UserType ?: 0)}
//
//    override fun getUserAccessType(): Int = mPrefs.getInt(PREF_KEY_USER_ACCESS_TYPE,0)
//
//    override fun setUserAccessType(UserAccessType: Int?) = mPrefs.edit{putInt(PREF_KEY_USER_ACCESS_TYPE,UserAccessType ?: 0)}
//
//    override fun getCurrentUserStanfordWorkplaceURL(): String = mPrefs.getString(PREF_KEY_STANFORD_WORKPLACE_URL, "")
//
//    override fun setCurrentUserStanfordWorkplaceURL(StanfordWorkplaceURL: String?) = mPrefs.edit { putString(PREF_KEY_STANFORD_WORKPLACE_URL, StanfordWorkplaceURL) }
//
//    override fun getCurrentUserReferenceID(): String = mPrefs.getString(PREF_KEY_REFERENCE_ID, "")
//
//    override fun setCurrentUserReferenceID(ReferenceId: String?) = mPrefs.edit { putString(PREF_KEY_REFERENCE_ID, ReferenceId) }
//
//    override fun getCurrentUserReferenceType(): String = mPrefs.getString(PREF_KEY_REFERENCE_TYPE, "")
//
//    override fun setCurrentUserReferenceType(ReferenceType: String?) = mPrefs.edit { putString(PREF_KEY_REFERENCE_TYPE, ReferenceType) }
//
//    override fun getCurrentUserRemarks(): String = mPrefs.getString(PREF_KEY_REMARKS, "")
//
//    override fun setCurrentUserRemarks(Remarks: String?) = mPrefs.edit { putString(PREF_KEY_REMARKS, Remarks) }
//
//    override fun getCurrentUserCohort(): String = mPrefs.getString(PREF_KEY_COHORT, "")
//
//    override fun setCurrentUserCohort(Cohort: String?) = mPrefs.edit { putString(PREF_KEY_COHORT, Cohort) }
//
//    override fun getCurrentUserCommunityID(): String = mPrefs.getString(PREF_KEY_COMMUNITY_ID, "")
//
//    override fun setCurrentUserCommunityID(CommunityId: String?) = mPrefs.edit { putString(PREF_KEY_COMMUNITY_ID, CommunityId) }
//
//    override fun getCurrentUserProfileURL(): String = mPrefs.getString(PREF_KEY_USER_PROFILE_URL, "")
//
//    override fun setCurrentUserProfileURL(ProfileUrl: String?) = mPrefs.edit { putString(PREF_KEY_USER_PROFILE_URL, ProfileUrl) }
//
//    override fun getFCMTOKEN(): String = mPrefs.getString(PREF_KEY_FCMTOKEN, "")
//
//    override fun setFCMToken(token: String?) = mPrefs.edit { putString(PREF_KEY_FCMTOKEN, token) }
//
//    override fun getCurrentUserJoinedDate(): String = mPrefs.getString(PREF_KEY_USER_DATE_JOINED, "")
//
//    override fun setCurrentUserJoinedDate(DateCreatedLocal: String?) = mPrefs.edit { putString(PREF_KEY_USER_DATE_JOINED, DateCreatedLocal) }
//
//
//    override fun getSettingAudioPlay(): Boolean = mPrefs.getBoolean(PREF_KEY_SETTING_AUDIO, true)
//
//    override fun setSettingAudioPlay(IsAudioPlay: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_SETTING_AUDIO, IsAudioPlay) }
//
//
//    override fun getApplicationLanguage(): String = mPrefs.getString(PREF_KEY_APPLICATION_LOCALE, "bn")
//
//    override fun setApplicationLanguage(local: String) = mPrefs.edit { putString(PREF_KEY_APPLICATION_LOCALE, local) }
//
//
//    override fun getBrowseTaskFilterIsPerson(): Boolean = mPrefs.getBoolean(PREF_KEY_BROWSE_TASK_FILTER_IS_PERSON, false)
//
//    override fun setBrowseTaskFilterIsPerson(IsPerson: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_BROWSE_TASK_FILTER_IS_PERSON, IsPerson) }
//
//    override fun getBrowseTaskFilterIsRemote(): Boolean = mPrefs.getBoolean(PREF_KEY_BROWSE_TASK_FILTER_IS_REMOTE, false)
//
//    override fun setBrowseTaskFilterIsRemote(IsRemote: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_BROWSE_TASK_FILTER_IS_REMOTE, IsRemote) }
//
//    override fun getBrowseTaskFilterIsAll(): Boolean = mPrefs.getBoolean(PREF_KEY_BROWSE_TASK_FILTER_IS_ALL, true)
//
//    override fun setBrowseTaskFilterIsAll(IsAll: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_BROWSE_TASK_FILTER_IS_ALL, IsAll) }
//
//    override fun getBrowseTaskFilterDistance(): String = mPrefs.getString(PREF_KEY_BROWSE_TASK_FILTER_IS_DISTANCE, "1000")
//
//    override fun setBrowseTaskFilterDistance(Distance: String) = mPrefs.edit { putString(PREF_KEY_BROWSE_TASK_FILTER_IS_DISTANCE, Distance) }
//
//    override fun getBrowseTaskFilterFromPrice(): String = mPrefs.getString(PREF_KEY_BROWSE_TASK_FILTER_FROM_PRICE, "1")
//
//    override fun setBrowseTaskFilterFromPrice(FromPrice: String) = mPrefs.edit { putString(PREF_KEY_BROWSE_TASK_FILTER_FROM_PRICE, FromPrice) }
//
//    override fun getBrowseTaskFilterToPrice(): String = mPrefs.getString(PREF_KEY_BROWSE_TASK_FILTER_TO_PRICE, "100000")
//
//    override fun setBrowseTaskFilterToPrice(ToPrice: String) = mPrefs.edit { putString(PREF_KEY_BROWSE_TASK_FILTER_TO_PRICE, ToPrice) }
//
//    override fun getBrowseTaskFilterTpVehicleType(): String = mPrefs.getString(PREF_KEY_BROWSE_TASK_FILTER_TO_VEHICLE_TYPE, "")
//
//    override fun setBrowseTaskFilterToVehicleType(ToVehicleType: String) = mPrefs.edit { putString(PREF_KEY_BROWSE_TASK_FILTER_TO_VEHICLE_TYPE, ToVehicleType) }
//
//    override fun getBrowseTaskFilterToVehicleCapacity(): String = mPrefs.getString(PREF_KEY_BROWSE_TASK_FILTER_TO_VEHICLE_CAPACITY, "")
//
//    override fun setBrowseTaskFilterToVehicleCapacity(ToVehicleCapacity: String) = mPrefs.edit { putString(PREF_KEY_BROWSE_TASK_FILTER_TO_VEHICLE_CAPACITY, ToVehicleCapacity) }
//
//    override fun getBrowseTaskFilterToVehicleSize(): String = mPrefs.getString(PREF_KEY_BROWSE_TASK_FILTER_TO_VEHICLE_SIZE, "")
//
//    override fun setBrowseTaskFilterToVehicleSize(ToVehicleSize: String) = mPrefs.edit { putString(PREF_KEY_BROWSE_TASK_FILTER_TO_VEHICLE_SIZE, ToVehicleSize) }
//
//    override fun setBrowseTaskFilterToAddress(Address: String?) = mPrefs.edit { putString(PREF_KEY_BROWSE_TASK_FILTER_TO_ADDRESS, Address) }
//
//    override fun getBrowseTaskFilterToAddress(): String = mPrefs.getString(PREF_KEY_BROWSE_TASK_FILTER_TO_ADDRESS, "")
//
//    override fun getBrowseTaskFilterToDivisionID(): Int = mPrefs.getInt(PREF_KEY_BROWSE_TASK_FILTER_TO_DIVISION_ID, 0)
//
//    override fun setBrowseTaskFilterToDivisionID(DivisionID: Int) = mPrefs.edit { putInt(PREF_KEY_BROWSE_TASK_FILTER_TO_DIVISION_ID, DivisionID) }
//
//    override fun getBrowseTaskFilterToDistrictID(): Int = mPrefs.getInt(PREF_KEY_BROWSE_TASK_FILTER_TO_DISTRICT_ID, 0)
//
//    override fun setBrowseTaskFilterToDistrictID(DistrictID: Int) = mPrefs.edit { putInt(PREF_KEY_BROWSE_TASK_FILTER_TO_DISTRICT_ID, DistrictID) }
//
//    override fun getBrowseTaskFilterToThanaID(): Int = mPrefs.getInt(PREF_KEY_BROWSE_TASK_FILTER_TO_THANA_ID, 0)
//
//    override fun setBrowseTaskFilterToThanaID(ThanaID: Int) = mPrefs.edit { putInt(PREF_KEY_BROWSE_TASK_FILTER_TO_THANA_ID, ThanaID) }
//
//    override fun getBrowseTaskFilterToUnionID(): Int = mPrefs.getInt(PREF_KEY_BROWSE_TASK_FILTER_TO_UNION_ID, 0)
//
//    override fun setBrowseTaskFilterToUnionID(UnionID: Int) = mPrefs.edit { putInt(PREF_KEY_BROWSE_TASK_FILTER_TO_UNION_ID, UnionID) }
//
//    override fun getLatitude(): String = mPrefs.getString(PREF_KEY_USER_ADDRESS_LATITUDE, "0.0")
//    override fun setLatitude(Latitude: String?) = mPrefs.edit { putString(PREF_KEY_USER_ADDRESS_LATITUDE, Latitude) }
//    override fun setLongitude(Longitude: String?) = mPrefs.edit { putString(PREF_KEY_USER_ADDRESS_LONGITUDE, Longitude) }
//    override fun getLongitude(): String = mPrefs.getString(PREF_KEY_USER_ADDRESS_LONGITUDE, "0.0")
//
//    override fun setTag(Tag: String?)  = mPrefs.edit { putString(PREF_KEY_USER_TAG, Tag) }
//    override fun getTag(): String = mPrefs.getString(PREF_KEY_USER_TAG, "")
//
//    override fun setUnreadNotificationCount(UnreadNotificationCount: Int?) = mPrefs.edit {
//        if (UnreadNotificationCount != null) {
//            putInt(PREF_KEY_USER_UNREAD_NOTIFICATION, UnreadNotificationCount)
//        }
//    }
//
//    override fun getUnreadNotificationCount(): Int = mPrefs.getInt(PREF_KEY_USER_UNREAD_NOTIFICATION, 0)
//
//
//    override fun getIsFirstInstall(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_FIRST_INSTALL, true)
//
//    override fun setIsFirstInstall(IsFirstInstall: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_IS_FIRST_INSTALL, IsFirstInstall) }
//
//    override fun getIsShowTutorial(): Boolean = mPrefs.getBoolean(PREF_KEY_IS_SHOW_TUTORIAL, false)
//
//    override fun setIsShowTutorial(IsShowTutorial: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_IS_SHOW_TUTORIAL, IsShowTutorial) }
//
//    override fun setUserDeviceDateForTaskCategory(userDeviceDate: String?) = mPrefs.edit { putString(PREF_KEY_USER_DEVICE_DATE_TASK_CATEGORY, userDeviceDate) }
//
//    override fun getUserDeviceDateForTaskCategory(): String = mPrefs.getString(PREF_KEY_USER_DEVICE_DATE_TASK_CATEGORY, "")
//
//    override fun setUserDeviceDateForBrowseTask(userDeviceDate: String?) = mPrefs.edit { putString(PREF_KEY_USER_DEVICE_DATE_BROWSE_TASK, userDeviceDate) }
//
//    override fun getUserDeviceDateForBrowseTask(): String = mPrefs.getString(PREF_KEY_USER_DEVICE_DATE_BROWSE_TASK, "")
//
//    override fun setBikashAccount(IsbikashAccount: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_USER_SEND_PAYMENT_METHOD_BIKASH, IsbikashAccount) }
//
//    override fun getBikashAccount(): Boolean = mPrefs.getBoolean(PREF_KEY_USER_SEND_PAYMENT_METHOD_BIKASH, false)
//
//    override fun setRocketAccount(IsbikashAccount: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_USER_SEND_PAYMENT_METHOD_ROCKET, IsbikashAccount) }
//
//    override fun getRocketAccount(): Boolean = mPrefs.getBoolean(PREF_KEY_USER_SEND_PAYMENT_METHOD_ROCKET, false)
//
//    override fun setBackAccount(IsbikashAccount: Boolean) = mPrefs.edit { putBoolean(PREF_KEY_USER_SEND_PAYMENT_METHOD_BANK, IsbikashAccount) }
//
//    override fun getBackAccount(): Boolean = mPrefs.getBoolean(PREF_KEY_USER_SEND_PAYMENT_METHOD_BANK, false)
}