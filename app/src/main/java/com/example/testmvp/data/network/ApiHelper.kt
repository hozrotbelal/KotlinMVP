package com.example.testmvp.data.network

import com.androidnetworking.interfaces.OkHttpResponseListener
import io.reactivex.Observable
import java.io.File

interface ApiHelper {

 //   fun setAccessToken(token: String)

    //Start Area Authentication
//    fun performServerLogin(request: LoginRequest.ServerLoginRequest): Observable<LoginResponse>
//
//    fun performServerLoginCookie(request: LoginRequest.ServerLoginRequest, okHttpResponseListener: OkHttpResponseListener)
//
//    fun performFBLogin(request: LoginRequest.FacebookLoginRequest): Observable<LoginResponse>
//
//    fun performGoogleLogin(request: LoginRequest.GoogleLoginRequest): Observable<LoginResponse>
//
//
//    fun performServerSignUp(request: SignUpRequest.ServerSignUpRequest): Observable<SignUpResponse>
//    fun performChangePasswordApiCall(request: ChangePasswordRequest.PasswordChangeRequest): Observable<ChangePasswordResponse>
//
//
//    fun performServerFacebookMobileSignUp(request: SignUpRequest.ServerFacebookMobileSignUpRequest): Observable<LoginResponse>
//    fun performServerMobileLoginCookie(request: SignUpRequest.ServerFacebookMobileSignUpRequest, okHttpResponseListener: OkHttpResponseListener)
//
//    fun performServerSocialLoginRegistration(request: LoginRequest.FacebookLoginRegistrationRequest): Observable<LoginResponse>
//
//    fun performServerSocialLoginCookie(request: LoginRequest.FacebookLoginRegistrationRequest, okHttpResponseListener: OkHttpResponseListener)
//    ///End Area Authentication
//
//
//    fun performLogoutApiCall(): Observable<LogoutResponse>
//
//    //Start Task Area
//    fun getMyTaskDetailsApiCall(request: TaskRequest.ServerTaskRequest): Observable<TaskResponse>
//
//    fun getBrowseTaskListApiCall(request: TaskRequest.ServerTaskRequest): Observable<TaskResponse>
//
//    fun performPostTask(request: TaskRequest.ServerTaskPostRequest): Observable<TaskResponse>
//    fun performUpdateTask(request: TaskRequest.ServerTaskPostRequest): Observable<TaskResponse>
//
//    fun performPostTaskResponseTesting(request: TaskRequest.ServerTaskPostRequest, okHttpResponseListener: OkHttpResponseListener)
//
//    fun updateTask(request: TaskRequest.ServerTaskPostRequest): Observable<TaskResponse>
//
//
//    fun performPostTaskDelete(taskId: Long): Observable<TaskResponse>
//    fun saveTaskPictures(request: EntityPropertyRequest.ServerEntityPropertyPostRequest): Observable<MediaResponse>
//    fun getTaskPictures(taskId: Long): Observable<MediaResponse>
//    fun deleteTaskPictures(mediaId: Long): Observable<MediaResponse>
//    fun performPostMediaDelete(mediaId: Long): Observable<MediaResponse>
//
//    fun getTaskByTaskIdApiCall(taskId: Long): Observable<TaskResponse>
//    fun sendEmailAndNotificationTaskAlertsByTaskIdApiCall(taskId: Long): Observable<TaskResponse>
//
//
//    //End Task Area
//
//
//    //Start Task Bidding Area
//
//    fun getTaskBiddingListApiCall(request: TaskBiddingRequest.ServerTaskBiddingRequest): Observable<TaskBiddingResponse>
//    fun performPostTaskBidding(request: TaskBiddingRequest.ServerTaskBiddingPostRequest): Observable<TaskBiddingResponse>
//    fun performPutTaskBidding(request: TaskBiddingRequest.ServerTaskBiddingPostRequest): Observable<TaskBiddingResponse>
//    fun performWithdrawPutTaskBidding(taskBiddingId: Long): Observable<TaskBiddingResponse>
//
//    fun performPutAcceptPaymentConfirmationTaskBidding(request: TaskBiddingRequest.ServerTaskBiddingPostRequest): Observable<TaskBiddingResponse>
//    fun sendEmailAndNotificationTaskBiddingAlertsByTaskBiddingIdApiCall(taskbiddingId: Long): Observable<TaskBiddingResponse>
//    fun getTaskBiddingByTaskBiddingIdApiCall(taskBiddingId: Long): Observable<TaskBiddingResponse>
//    //End Task Bidding Area
//
//    //Start Corporate Task Accepted or Reject Area
//    fun performCorporateApprovedQuotePostTaskBidding(request: TaskRequest.ServerTaskBiddingCorporateApprovedQuotePostRequest): Observable<TaskResponse>
//    fun performCorporateRejectQuotePostTaskBidding(request: TaskBiddingRequest.ServerTaskBiddingCorporateRejectQuotePostRequest): Observable<TaskBiddingResponse>
//
//    //Start Task Payment Area
//
//    fun getTaskPaymentsInfo(request: TaskPaymentsRequest.GetTaskPayments): Observable<TaskPaymentsResponse>
//    fun performPostTaskPayment(request: TaskPaymentsRequest.ServerTaskPaymentPostRequest): Observable<TaskPaymentsResponse>
//    fun performPutTaskPayment(request: TaskPaymentsRequest.ServerTaskPaymentPutRequest): Observable<TaskPaymentsResponse>
//    fun performUpdateTaskPaymentStatus(taskPaymentId: TaskPaymentsRequest.UpdateTaskPaymentStatus): Observable<TaskPaymentsResponse>
//    fun performWithdrawPutTaskPayment(taskPaymentId: Long): Observable<TaskPaymentsResponse>
//
//    fun performPostSSLvalidationTaskPayment(request: TaskPaymentsRequest.ServerTaskSSLPaymentPostRequest): Observable<TaskPaymentsResponse>
//    fun getTaskPaymentsByTaskIDAndTaskBiddingID(request: TaskPaymentsRequest.GetTaskPaymentsByTaskIDAndTaskBiddingId): Observable<TaskPaymentsResponse>
//    fun sendEmailAndNotificationTaskPaymentAlertsByTaskPaymentIdApiCall(taskPaymentId: Long): Observable<TaskPaymentsResponse>
//
//    fun getSSLInfoApiCall(): Observable<CommonResponse>
//
//    //End Task Payment Area
//
//    fun getAllTaskAlert(request: TaskAlertRequest.GetAllTaskAlert): Observable<TaskAlertResponse>
//    fun addNewTaskAlert(request: TaskAlertRequest.AddNewTaskAlert): Observable<TaskAlertResponse>
//    fun updateTaskAlert(request: TaskAlertRequest.UpdateTaskAlert): Observable<TaskAlertResponse>
//    fun deleteTaskAlert(Id: Long): Observable<TaskAlertResponse>
//
//    fun updateUserProfile(request: ProfileInfoRequest.UpdateProfileInfoSkill): Observable<ProfileInfoResponse>
//
//
//    //Start Area Notification Setting
//
//    fun createNotificationSettings(request: NotificationSettingsRequest.CreateNotificationSettings): Observable<NotificationSettingsResponse>
//
//    fun updateNotificationSettings(request: NotificationSettingsRequest.UpdateNotificationSettings): Observable<NotificationSettingsResponse>
//
//    fun getNotificationSettings(request: NotificationSettingsRequest.GetNotificationSettings): Observable<NotificationSettingsResponse>
//
//    fun sendTestPushNotificationToUser(userId: Long): Observable<NotificationListResponse>
//
//    // End Area Notification Setting
//
//
//    fun getUserReviewListApiCall(request: UserReviewListRequest.GetUserReviewList): Observable<UserReviewListResponse>
//
//    fun addPaymentMethodInfo(request: PaymentMethodRequest.AddPaymentMethod): Observable<PaymentMethodResponse>
//
//    fun updatePaymentMethodInfo(request: PaymentMethodRequest.UpdatePaymentMethod): Observable<PaymentMethodResponse>
//
//    fun getPaymentMethodInfo(request: PaymentMethodRequest.GetPaymentMethod): Observable<PaymentMethodResponse>
//
//    fun addBillingAddressInfo(request: BillingAddressRequest.AddBillingAddress): Observable<BillingAddressResponse>
//
//    fun updateBillingAddressInfo(request: BillingAddressRequest.UpdateBillingAddress): Observable<BillingAddressResponse>
//
//    fun getBillingAddressInfo(request: BillingAddressRequest.GetBillingAddress): Observable<BillingAddressResponse>
//
//
//    /// Time Line
//    fun getTimeLinePostsListApiCall(request: TimeLinePostsRequest.ServerTimeLineRequest): Observable<TimeLinePostsResponse>
//
//    fun performPostTimeLinePost(request: TimeLinePostsRequest.ServerTimeLinePostRequest): Observable<TimeLinePostsResponse>
//    fun performTimeLineCommentPost(request: TimeLinePostsRequest.ServerTimeLineCommentPostRequest): Observable<TimeLinePostsResponse>
//    fun getCommentssListApiCall(request: UserCommentRequest.ServerUserCommentRequest): Observable<UserCommentResponse>
//    fun getSendEmailAndNotificationTimeLineApiCall(timelinePostId : Long): Observable<TimeLinePostsResponse>
//
//    fun getSendEmailAndNotificationCommentApiCall(CommentId : Long): Observable<UserCommentResponse>
//
//    //Uplaoding Images
//    fun uplaodPicturesApiCall(request: MediaRequest.ServerMediaPostRequest, file: File): Observable<MediaResponse>
//
//    fun uplaodFileApiCall(request: MediaRequest.ServerMediaPostRequest, file: File): Observable<MediaResponse>
//
//
//    fun getNotificationListApiCall(request: NotificationListRequest.GetNotificationListRequest): Observable<NotificationListResponse>
//
//    //Start User Profile Area
//    fun saveUserProfileInfoGeneralApiCall(request: ProfileInfoRequest.UpdateProfileInfoGeneral): Observable<ProfileInfoResponse>
//
//    fun updateUserProfileInfoGeneralApiCall(request: ProfileInfoRequest.UpdateProfileInfoGeneral): Observable<ProfileInfoResponse>
//    fun getUserPublicProfileInfoApiCall(UserId: Long): Observable<UserResponse>
//
//    //End User Profile Area
//
//    //Start User Info
//    fun getUserInfoApiCall(): Observable<UserResponse>
//
//    fun updateUserProfileSkillApiCall(request: ProfileInfoRequest.UpdateProfileInfoSkill): Observable<ProfileInfoResponse>
//
//    fun performTaskAttachmentApiCall(request: TaskAttachmentRequest.PasswordChangeRequest): Observable<TaskAttachmentResponse>
//
//    fun getDashboardSummaryInfoApiCall(request: DashboardSummaryRequest.GetDashboardSummaryRequest): Observable<DashboardSummaryResponse>
//    fun getDashboardTaskSummaryInfoApiCall(request: DashboardSummaryRequest.GetDashboardSummaryRequest): Observable<DashboardTaskSummaryResponse>
//
//    fun getUserSkillListApiCall(request: UserSkillListRequest.GetUserSkillListRequest): Observable<AboutResponse>
//    fun addUserProfileSkill(request: UserSkillListRequest.AddUsersSkillListRequest): Observable<AboutResponse>
//
//    // Start User Rating Area
//
//    fun performPostUserRating(request: UserRatingRequest.ServerUserRatingPostRequest): Observable<UserRatingResponse>
//    fun sendEmailAndNotificationUserRatingByUserRatingIdApiCall(userRatingId: Long): Observable<UserRatingResponse>
//
//    //End User Rating Area
//
//
//    // Start Badges Area
//
//    fun getUserBadgeListApiCall(request: UserBadgeListRequest.GetUserBadgeListRequest): Observable<UserBadgeListResponse>
//    fun performPostUserBadgeApiCall(request: UserBadgeListRequest.GetUserBadgeRequest): Observable<UserBadgeResponse>
//    fun performPostUserNIDApiCall(request: UserBadgeListRequest.PostUserBadgeRequest): Observable<UserBadgeResponse>
//
//    //End Badges Area
//
//    //Start Area User Portfulio
//    fun getUserPortfulioListApiCall(request: UserPortfulioListRequest.GetUserPortfulioListRequest): Observable<UserPortfulioListResponse>
//
//    fun performUserPortfulioListApiCall(request: UserPortfulioListRequest.ServerUserPortfulioPostRequest): Observable<UserPortfulioListResponse>
//    //End Area
//
//    fun performUserEmailVerificationApiCall(request: UserBadgeListRequest.GetUserBadgeRequest): Observable<UserBadgeResponse>
//
//    fun performForgotPasswordApiCall(request: ForgotPasswordRequest.ServerForgotPasswordRequest): Observable<ForgotPasswordResponse>
//
//    fun performPostFCMDeviceInfoApiCall(request: FCMDeviceInfoRequest.ServerFCMDeviceInfoRequest): Observable<FCMDeviceInfoResponse>
//
//    fun postUserPromotionCodeApiCall(request: UserPromotionRequest.PostUserPromotionRequest): Observable<UserPromotionResponse>
//
//    fun getUserPromotionCodeApiCall(request: UserPromotionRequest.GetUserPromotionRequest): Observable<UserPromotionResponse>
//
//    fun performReportTaskApiCall(request: ReportTaskRequest.ReportTaskRequestCall): Observable<ReportTaskResponse>
//
//    fun saveProfilePictureApiCall(request: EntityPropertyRequest.ServerEntityPropertyPostRequest): Observable<EntityPropertyResponse>
//
//    fun getPublicProfileInfoApiCall(UserId: Long): Observable<ProfileInfoResponse>
//
//    fun performPutMarkReadNotificationApiCall1(Ids: List<Long>): Observable<NotificationListResponse>
//
//    fun getTaskReviewById(TaskId: Long): Observable<UserReviewListResponse>
//
//    fun performPostUserDeviceApiCall(request: UserDeviceRequest.ServerUserDevicePostRequest): Observable<UserDeviceResponse>
//
//    // Service Charge
//    fun getDefaultServiceChargeApiCall(): Observable<ServiceChargeResponse>
//
//
//
//    // Manage My User
//    fun sendOTPApiCall(sms:SMS): Observable<SMSResponse>
//    fun verifyOTPApiCall(sms:SMS): Observable<SMSResponse>
//    fun verifyMobileNumberApiCall(sms:SMS): Observable<SMSResponse>
//    fun createUserByMobileApiCall(user: SignUpRequest.ServerFacebookMobileSignUpRequest): Observable<UserResponse>
//    fun updateUserByMobileApiCall(user:User): Observable<UserResponse>
//    fun getMyUserListApiCall(userId:Long): Observable<UserResponse>
//    fun getUserByIdApiCall(userId:Long): Observable<UserResponse>
//
//    fun getAllAddressApiCall(): Observable<Address.AddressResponse>
//    fun getAllAddressAsStringApiCall(): Observable<Address.AddressResponse>
//
    fun getAllDivisionApiCall(): Observable<Address.AddressResponse>
//    fun getAllDistrictApiCall(): Observable<Address.AddressResponse>
//    fun getAllThanaApiCall(): Observable<Address.AddressResponse>
//    fun getAllUnionApiCall(): Observable<Address.AddressResponse>
//    fun getAllUnionByThanaApiCall(thanaId: Int): Observable<Address.AddressResponse>
//    fun searchAddressApiCall(keyword: String): Observable<Address.AddressResponse>
//
//    fun getServerAppVersion(): Observable<CommonResponse>
//
//    // Lookup Data
//    fun getAllVehicleLookupApiCall(): Observable<Lookup.LookupResponse>
//    fun getAllVehicleCategoryLookupApiCall(): Observable<Lookup.LookupResponse>
//
//    // Share Account Others
//    fun getShareAccountOthersApiCall(): Observable<ShareAccountOthersResponse>
//    fun shareAccountOtherApiCall(shareAccountOthers:ShareAccountOthers): Observable<ShareAccountOthersResponse>
//
//    // Challan User
//    fun challanUsersApiCall(taskId: String): Observable<ChallanUsersResponse>
//    fun generateChallanApiCall(taskId: String, taskBiddingId: String): Observable<ChallanUsersResponse>
//
//    fun addChallanUsersApiCall(challanUser: ChallanUsersRequest.ServerChallanUserspRequest): Observable<ChallanUsersResponse>
//
//    fun updateCheckinoutTimeCApiCall(updateCheckinoutTime: ChallanUsersRequest.ServerUpdateCheckinoutTimeRequest): Observable<ChallanUsersResponse>
//
//    fun doVerifyMobileNumberUsersCall(mobileNumber: String): Observable<CommonResponse>
//
//    // Payment Process
//    fun addTransactionApiCall(paymentProcess: PaymentTransactionRequest.ServerPaymentTransactionRequest): Observable<CommonResponse>
//
//    fun getPaymentProcessListApiCall(taskId: String): Observable<CommonResponse>
//
//    // Change status
//    fun performChangeTaskOwnerCall(changeTaskOwnerRequest: ChangeStatusRequest.ServerRequestChangeTaskOwner): Observable<CommonResponse>
//
//    fun performAssignKAMCall(assignKAMRequest: ChangeStatusRequest.ServerRequestAssignKAM): Observable<CommonResponse>
//
//    fun performPostToPublicMarketCall(postToPublicMarketRequest: ChangeStatusRequest.ServerRequestChangeTask): Observable<CommonResponse>
//
//    fun performChangeStatusCropCall(changeStatusCropRequest: ChangeStatusRequest.ServerRequestChangeTask): Observable<CommonResponse>
//
//    fun performQuotesJobsCall(quotesJobsRequest: ChangeStatusRequest.ServerRequestQuotesJobs): Observable<CommonResponse>
//
//    //Start Task Area
//    fun getBrowseTaskInfoByAdminSearchApiCall(request: TaskRequest.ServerAdminTaskSearchRequest): Observable<TaskResponse>
//
//    fun getVerifyUserApiCall(request: ChangeStatusRequest.ServerRequestVerifyUser): Observable<CommonResponse>
//
//    // My Balance
//    fun getMyBalanceSubmissionListApiCall(): Observable<CommonResponse>
//
//    fun addMyBalanceSubmissionCall(myBalanceSubmission: MyBalanceRequest.ServerMyBalanceSubmissionRequest): Observable<CommonResponse>
//
//    //Assign Tasks To Driver As Owner
//    fun performAssignTasksToDriverAsOwnerCall(assignTaksToDriverAsOwnerRequest: ChangeStatusRequest.ServerRequestAssignTasksToDriverAsOwnerOwner): Observable<CommonResponse>
//
//    // Preferred Location
//    fun addPreferredLocationApiCall(preferredLocationRequest: PreferredLocationRequest.ServerPreferredLocationRequest): Observable<CommonResponse>
//
//    fun getPreferredLocationApiCall(userId: String): Observable<CommonResponse>
//
//    fun deletePreferredLocationApiCall(deletePreferredLocationRequest: PreferredLocationRequest.DeletePreferredLocationRequest): Observable<CommonResponse>
//
//    fun downloadTaskReportApiCall(taskReportRequest : TaskReportRequest.ServerTaskReportPostRequest): Observable<CommonResponse>
//
//    fun downloadDynamicReportApiCall(dynamicReportRequest : TaskReportRequest.ServerTaskReportPostRequest): Observable<CommonResponse>
//
//    // Preferred Field
//
//    fun addPreferredFieldApiCall(preferredFieldRequest: PreferredLocationRequest.ServerPreferredFieldRequest): Observable<CommonResponse>
//
//    fun getPreferredFieldApiCall(userId: String): Observable<CommonResponse>
//
//    fun deletePreferredFieldApiCall(deletePreferredFieldRequest: PreferredLocationRequest.DeletePreferredFieldRequest): Observable<CommonResponse>
//
//    // Task Payment By Customer
//    fun addTaskPaymentByCustomerApiCall(paymentByCustomerRequest: TaskPaymentByCustomerRequest.ServerTaskPaymentByCustomerRequest): Observable<CommonResponse>
//
//    fun getTaskPaymentByCustomerApiCall(taskId: String): Observable<CommonResponse>
//
//    fun deleteTaskPaymentByCustomerApiCall(taskPaymentId: String): Observable<CommonResponse>
}