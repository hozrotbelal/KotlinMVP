package com.example.testmvp.data.preferences

import com.example.testmvp.util.AppConstants

interface PreferenceHelper {

    fun getCurrentUserLoggedInMode(): Int
//
 //   fun setCurrentUserLoggedInMode(mode: AppConstants.LoggedInMode)
//
//    fun getCurrentUserId(): Long?
//
//    fun setCurrentUserId(userId: Long?)
//
//    fun getCurrentUserName(): String
//
//    fun setCurrentUserName(userName: String?)
//
//    fun getCurrentUserEmail(): String?
//
//    fun setCurrentUserEmail(email: String?)
//
//    fun setCurrentUserIsEmailVerified(IsEmailVerified: Boolean)
//
//    fun getCurrentUserIsEmailVerified(): Boolean
//
//    fun setCurrentUserPassword(password: String?)
//
//    fun getCurrentUserPassword(): String?
//
//    fun setCurrentUserRegion(region: String?)
//
//    fun getCurrentUserRegion(): String?
//
//    fun setCurrentUserIsPostTask(postTask: Boolean)
//
//    fun getCurrentUserIsPostTask(): Boolean
//
//    fun setCurrentUserIsCompleteTask(compleeteTask: Boolean)
//
//    fun getCurrentUserIsCompleteTask(): Boolean
//
//    fun getAccessToken(): String?
//
//    fun setAccessToken(accessToken: String?)
//
  //  fun getAccessCookie(): String?
//
//    fun getAccessCookieDate(): String?
//    fun setAccessCookieDate(cookieDate: String?)
//
//    fun setCurrentUserFirstName(FirstName: String?)
//
//    fun getCurrentUserFirstName(): String
//
//    fun setCurrentUserLastName(LastName: String?)
//
//    fun getCurrentLastName(): String
//
//    fun setCurrentUserBriefBio(BriefBio: String?)
//
//    fun getCurrentUserBriefBio(): String
//
//    fun setCurrentUserHeadline(Headline: String?)
//
//    fun getCurrentUserHeadline(): String
//
//    fun setCurrentUserMobileNumber(MobileNumber: String?)
//
//    fun getCurrentUserMobileNumber(): String
//
//
//    fun setOthorizeMobileNumber(MobileNumber: String?)
//
//    fun getOthorizeMobileNumber(): String
//
//    fun setCurrentUserIsMobileNumberVerified(IsMobileNumberVerified: Boolean)
//
//    fun getCurrentUserIsMobileNumberVerified(): Boolean
//
//    fun setCurrentUserNIDNumberVerifiedStatus(NIDNumber: Int)
//
//    fun getCurrentUserNIDNumberVerifiedStatus(): Int
//
//    fun setCurrentUserIsNIDNumberVerified(IsNIDNumberVerified: Boolean)
//
//    fun getCurrentUserIsNIDNumberVerified(): Boolean
//
//    fun setCurrentUserNationalIDNumberImageURL(NationalIDNumberImageUrl: String?)
//
//    fun getCurrentUserNationalIDNumberImageURL(): String
//
//    fun setCurrentUserDrivingLicenceNoImageURL(DrivingLicenceNoImageUrl: String?)
//
//    fun getCurrentUserDrivingLicenceNoImageURL(): String
//
//    fun setCurrentUserTradeLicenceNoImageURL(TradeLicenceNoImageUrl: String?)
//
//    fun getCurrentUserTradeLicenceNoImageURL(): String
//
//    fun setCurrentUserRegistrationNumberImageURL(RegistrationNumberImageUrl: String?)
//
//    fun getCurrentUserRegistrationNumberImageURL(): String
//
//    fun setCurrentUserCorporateCompanyDocumentImageURL(CorporateCompanyDocumentImageUrl: String?)
//
//    fun getCurrentUserCorporateCompanyDocumentImageURL(): String
//
//    fun setCurrentUserIsNationalIDNumberVerified(IsNationalIDNumberVerified: Boolean)
//
//    fun getCurrentUserIsNationalIDNumberVerified(): Boolean
//
//    fun setCurrentUserIsDrivingLicenseVerified(IsDrivingLicenseVerified: Boolean)
//
//    fun getCurrentUserIsDrivingLicenseVerified(): Boolean
//
//    fun setCurrentUserIsRegistrationNumberVerified(IsRegistrationNumberVerified: Boolean)
//
//    fun getCurrentUserIsRegistrationNumberVerified(): Boolean
//
//    fun setCurrentUserIsTradeLicenseNoVerified(IsTradeLicenseNoVerified: Boolean)
//
//    fun getCurrentUserIsTradeLicenseNoVerified(): Boolean
//
//    fun setCurrentUserIsCorporateCompanyDocumentVerified(IsCorporateCompanyDocumentVerified: Boolean)
//
//    fun getCurrentUserIsCorporateCompanyDocumentVerified(): Boolean
//
//    fun setCurrentUserDisplayId(DisplayId: String?)
//
//    fun getCurrentUserDisplayId(): String
//
//    fun setCurrentUserFatherName(FatherName: String?)
//
//    fun getCurrentUserFatherName(): String
//
//    fun setCurrentUserNationalIDNumber(NationalIDNumber: String?)
//
//    fun getCurrentUserNationalIDNumber(): String
//
//    fun setCurrentUserRegistrationNumber(RegistrationNumber: String?)
//
//    fun getCurrentUserRegistrationNumber(): String
//
//    fun setCurrentUserProfession(Profession: String?)
//
//    fun getCurrentUserProfession(): String
//
//    fun setCurrentUserDrivingLicenseNo(DrivingLicenseNo: String?)
//
//    fun getCurrentUserDrivingLicenseNo(): String
//
//    fun setCurrentUserVehicleType(VehicleType: String?)
//
//    fun getCurrentUserVehicleType(): String
//
//    fun setCurrentUserVehicleCapacity(VehicleCapacity: String?)
//
//    fun getCurrentUserVehicleCapacity(): String
//
//    fun setCurrentUserVehicleSize(VehicleSize: String?)
//
//    fun getCurrentUserVehicleSize(): String
//
//
//    fun setCurrentUserWorkingArea(WorkingArea: String?)
//
//    fun getCurrentUserWorkingArea(): String
//
//    fun setCurrentUserWorkingAddress(WorkingAddress: String?)
//
//    fun getCurrentUserWorkingAddress(): String
//
//    fun setCurrentUserEmergencyContactNo(EmergencyContactNo: String?)
//
//    fun getCurrentUserEmergencyContactNo(): String
//
//    fun setCurrentUserCompanyName(CompanyName: String?)
//
//    fun getCurrentUserCompanyName(): String
//
//    fun setCurrentUserTag(Tag: String?)
//
//    fun getCurrentUserTag(): String
//
//    fun getUserType(): Int
//
//    fun setUserType(UserAccessType: Int?)
//
//    fun getUserAccessType(): Int
//
//    fun setUserAccessType(UserAccessType: Int?)
//
//    fun setCurrentUserDateofBirth(DateofBirth: String?)
//
//    fun getCurrentDateofBirth(): String
//
//    fun setCurrentUserAddress(Address: String?)
//
//    fun getCurrentUserAddress(): String
//
//    fun getCurrentUserDivisionID(): Int
//    fun setCurrentUserDivisionID(DivisionID: Int?)
//
//    fun getCurrentUserDistrictID(): Int
//    fun setCurrentUserDistrictID(DistrictID: Int?)
//
//    fun getCurrentUserThanaID(): Int
//    fun setCurrentUserThanaID(ThanaID: Int?)
//
//    fun getCurrentUserUnionID(): Int
//    fun setCurrentUserUnionID(UnionID: Int?)
//
//
//    fun setCurrentUserPermanentAddress(PermanentAddress: String?)
//
//    fun getCurrentUserPermanentAddress(): String
//
//
//    fun setCurrentUserBillingAddress(BillingAddress: String?)
//
//    fun getCurrentUserBillingAddress(): String
//
//    fun setCurrentUserBankAccount(BankAccount: Int)
//
//    fun getCurrentUserBankAccount(): Int
//
//    fun setCurrentUserIsTransactionalEmail(IsTransactionalEmail: Boolean)
//
//    fun getCurrentIsTransactionalEmail(): Boolean
//
//    fun setCurrentUserIsTransactionalSMS(IsTransactionalSMS: Boolean)
//
//    fun getCurrentIsTransactionalSMS(): Boolean
//
//    fun setCurrentUserIsTransactionalNotification(IsTransactionalNotification: Boolean)
//
//    fun getCurrentIsTransactionalNotification(): Boolean
//
//    fun getCurrentUserLastName(): String
//
//    fun getCurrentUserProfileImageURL(): String
//
//    fun setCurrentUserProfileImageURL(ProfileImageUrl: String?)
//
//    fun getCurrentUserProfileImageID(): Int
//
//    fun setCurrentUserProfileImageID(ProfileImageId: Int)
//
//    fun getCurrentUserCoverImageURL(): String
//
//    fun setCurrentUserCoverImageURL(CoverImageUrl: String?)
//
//    fun getCurrentUserCoverImageID(): Int
//
//    fun setCurrentUserCoverImageID(CoverImageId: Int)
//
//    fun getCurrentUserStanfordWorkplaceURL(): String
//
//    fun setCurrentUserStanfordWorkplaceURL(StanfordWorkplaceURL: String?)
//
//    fun getCurrentUserReferenceID(): String
//
//    fun setCurrentUserReferenceID(ReferenceId: String?)
//
//    fun getCurrentUserReferenceType(): String
//
//    fun setCurrentUserReferenceType(ReferenceType: String?)
//
//    fun getCurrentUserRemarks(): String
//
//    fun setCurrentUserRemarks(Remarks: String?)
//
//    fun getCurrentUserCohort(): String
//
//    fun setCurrentUserCohort(Cohort: String?)
//
//    fun getCurrentUserCommunityID(): String
//
//    fun setCurrentUserCommunityID(CommunityId: String?)
//
//    fun getCurrentUserProfileURL(): String
//
//    fun setCurrentUserProfileURL(ProfileUrl: String?)
//
//
//    fun getFCMTOKEN(): String
//
//    fun setFCMToken(token: String?)
//
//    fun getCurrentUserJoinedDate(): String
//    fun setCurrentUserJoinedDate(DateCreatedLocal: String?)
//
//
//    fun getSettingAudioPlay(): Boolean
//    fun setSettingAudioPlay(IsAudioPlay: Boolean)
//
//
//    fun getApplicationLanguage(): String
//    fun setApplicationLanguage(local: String)
//
//    fun getBrowseTaskFilterIsPerson(): Boolean
//    fun setBrowseTaskFilterIsPerson(IsPerson: Boolean)
//
//    fun getBrowseTaskFilterIsRemote(): Boolean
//    fun setBrowseTaskFilterIsRemote(IsRemote: Boolean)
//
//    fun getBrowseTaskFilterIsAll(): Boolean
//    fun setBrowseTaskFilterIsAll(IsAll: Boolean)
//
//    fun getBrowseTaskFilterDistance(): String
//    fun setBrowseTaskFilterDistance(Distance: String)
//
//    fun getBrowseTaskFilterFromPrice(): String
//    fun setBrowseTaskFilterFromPrice(FromPrice: String)
//
//    fun getBrowseTaskFilterToPrice(): String
//    fun setBrowseTaskFilterToPrice(ToPrice: String)
//
//    fun getBrowseTaskFilterTpVehicleType(): String
//    fun setBrowseTaskFilterToVehicleType(ToVehicleType: String)
//
//    fun getBrowseTaskFilterToVehicleCapacity(): String
//    fun setBrowseTaskFilterToVehicleCapacity(ToVehicleCapacity: String)
//
//    fun getBrowseTaskFilterToVehicleSize(): String
//    fun setBrowseTaskFilterToVehicleSize(ToVehicleSize: String)
//
//    fun setBrowseTaskFilterToAddress(Address: String?)
//    fun getBrowseTaskFilterToAddress(): String
//
//    fun getBrowseTaskFilterToDivisionID(): Int
//    fun setBrowseTaskFilterToDivisionID(DivisionID: Int)
//
//    fun getBrowseTaskFilterToDistrictID(): Int
//    fun setBrowseTaskFilterToDistrictID(DistrictID: Int)
//
//    fun getBrowseTaskFilterToThanaID(): Int
//    fun setBrowseTaskFilterToThanaID(ThanaID: Int)
//
//    fun getBrowseTaskFilterToUnionID(): Int
//    fun setBrowseTaskFilterToUnionID(UnionID: Int)
//
//    fun getLatitude(): String
//    fun setLatitude(Latitude: String?)
//    fun setLongitude(Longitude: String?)
//    fun getLongitude(): String
//
//    fun setTag(Tag: String?)
//    fun getTag(): String
//
//    fun setUnreadNotificationCount(UnreadNotificationCount: Int?)
//    fun getUnreadNotificationCount(): Int
//
//
//    fun getIsFirstInstall(): Boolean
//    fun setIsFirstInstall(IsFirstInstall: Boolean)
//
//    fun getIsShowTutorial() : Boolean
//    fun setIsShowTutorial(IsShowTutorial: Boolean)
//    fun setUserDeviceDateForTaskCategory(userDeviceDate: String?)
//    fun getUserDeviceDateForTaskCategory() : String
//
//
//    fun setUserDeviceDateForBrowseTask(userDeviceDate: String?)
//    fun getUserDeviceDateForBrowseTask() : String
//
//
//
//    fun setBikashAccount(IsbikashAccount: Boolean)
//    fun getBikashAccount(): Boolean
//
//    fun setRocketAccount(IsbikashAccount: Boolean)
//    fun getRocketAccount(): Boolean
//
//    fun setBackAccount(IsbikashAccount: Boolean)
//    fun getBackAccount(): Boolean


}