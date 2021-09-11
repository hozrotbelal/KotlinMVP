package com.example.testmvp.data.network

import com.androidnetworking.common.Priority
import com.androidnetworking.interfaces.OkHttpResponseListener
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Observable
import java.io.File
import javax.inject.Inject

class AppApiHelper @Inject constructor(private var apiHeader: ApiHeader) : ApiHelper {



//    override fun setAccessToken(token: String) {
//        if(!token.isNullOrEmpty()) {
//            ApiHeader.PrivateApiHeader(cookieKey = token)
//            this.apiHeader.privateApiHeader = ApiHeader.PrivateApiHeader(cookieKey = token)
//        }
//    }

//    //Start Area Authentication
//
//    override fun performServerLogin(request: LoginRequest.ServerLoginRequest): Observable<LoginResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_LOGIN)
//                    .addHeaders(apiHeader.publicApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(LoginResponse::class.java)
//
//    override fun performFBLogin(request: LoginRequest.FacebookLoginRequest): Observable<LoginResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_FACEBOOK_LOGIN)
//                    .addHeaders(apiHeader.publicApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(LoginResponse::class.java)
//
//    override fun performGoogleLogin(request: LoginRequest.GoogleLoginRequest): Observable<LoginResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_GOOGLE_LOGIN)
//                    .addHeaders(apiHeader.publicApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(LoginResponse::class.java)
//
//    override fun performLogoutApiCall(): Observable<LogoutResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_LOGOUT)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(LogoutResponse::class.java)
//
//    override fun performServerSignUp(request: SignUpRequest.ServerSignUpRequest): Observable<SignUpResponse> {
//
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_SIGN_UP)
//                .addHeaders(apiHeader.publicApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(SignUpResponse::class.java)
//    }
//
//    override fun performServerSocialLoginRegistration(request: LoginRequest.FacebookLoginRegistrationRequest): Observable<LoginResponse> {
//
//
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_FACEBOOK_LINKEDIN_REGISTRATION_LOGIN)
//                .addHeaders(apiHeader.publicApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(LoginResponse::class.java)
//    }
//
//    override fun performServerLoginCookie(request: LoginRequest.ServerLoginRequest, okHttpResponseListener: OkHttpResponseListener) {
//
//        Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_FACEBOOK_LOGIN)
//                .addHeaders(apiHeader.publicApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getAsOkHttpResponse(okHttpResponseListener)
//    }
//
//    override fun performServerFacebookMobileSignUp(request: SignUpRequest.ServerFacebookMobileSignUpRequest): Observable<LoginResponse> {
//
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_MOBILELOGINREGISTRATION)
//                .addHeaders(apiHeader.publicApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(LoginResponse::class.java)
//    }
//
//    override fun performServerMobileLoginCookie(request: SignUpRequest.ServerFacebookMobileSignUpRequest, okHttpResponseListener: OkHttpResponseListener) {
//
//        Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_MOBILELOGINREGISTRATION)
//                .addHeaders(apiHeader.publicApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getAsOkHttpResponse(okHttpResponseListener)
//    }
//
//    override fun performServerSocialLoginCookie(request: LoginRequest.FacebookLoginRegistrationRequest, okHttpResponseListener: OkHttpResponseListener) {
//
//        Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_FACEBOOK_LINKEDIN_REGISTRATION_LOGIN)
//                .addHeaders(apiHeader.publicApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getAsOkHttpResponse(okHttpResponseListener)
//    }
//
//    ///End Area Authentication
//
//    //Start Task Area
//    override fun getMyTaskDetailsApiCall(request: TaskRequest.ServerTaskRequest): Observable<TaskResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_MYTASKLIST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addQueryParameter(request)
//                .build()
//                .getObjectObservable(TaskResponse::class.java)
//    }
//
//    override fun getBrowseTaskListApiCall(request: TaskRequest.ServerTaskRequest): Observable<TaskResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_MYTASKLIST)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(TaskResponse::class.java)
//
//    override fun performPostTask(request: TaskRequest.ServerTaskPostRequest): Observable<TaskResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(TaskResponse::class.java)
//    }
//
//    override fun performUpdateTask(request: TaskRequest.ServerTaskPostRequest): Observable<TaskResponse> {
//        return Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_UPDATE)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(TaskResponse::class.java)
//    }
//
//    override fun performPostTaskResponseTesting(request: TaskRequest.ServerTaskPostRequest, okHttpResponseListener: OkHttpResponseListener) {
//
//        Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_MOBILELOGINREGISTRATION)
//                .addHeaders(apiHeader.publicApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getAsOkHttpResponse(okHttpResponseListener)
//    }
//
//    override fun updateTask(request: TaskRequest.ServerTaskPostRequest): Observable<TaskResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_UPDATE)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(TaskResponse::class.java)
//
//    override fun performPostTaskDelete(taskId: Long): Observable<TaskResponse> =
//            Rx2AndroidNetworking.delete(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_DELETE + "/" + taskId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(TaskResponse::class.java)
//
//
//    override fun saveTaskPictures(request: EntityPropertyRequest.ServerEntityPropertyPostRequest): Observable<MediaResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_IMAGE_POST)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(MediaResponse::class.java)
//
//    override fun getTaskPictures(taskId: Long): Observable<MediaResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_IMAGE_GET + "/" + taskId)
//                    .addHeaders(apiHeader.publicApiHeader)
//                    .build()
//                    .getObjectObservable(MediaResponse::class.java)
//
//    override fun deleteTaskPictures(mediaId: Long): Observable<MediaResponse> =
//            Rx2AndroidNetworking.delete(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_IMAGE_DELETE + "/" + mediaId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(MediaResponse::class.java)
//
//    override fun performPostMediaDelete(mediaId: Long): Observable<MediaResponse> =
//            Rx2AndroidNetworking.delete(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_MEDIA_DELETE + "/" + mediaId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(MediaResponse::class.java)
//
//    override fun getTaskByTaskIdApiCall(taskId: Long): Observable<TaskResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_GET + "/" + taskId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(TaskResponse::class.java)
//
//    override fun sendEmailAndNotificationTaskAlertsByTaskIdApiCall(taskId: Long): Observable<TaskResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_SEND_EMAIL_NOTIFICATION_TASK_ALERTS + "/" + taskId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(TaskResponse::class.java)
//    //End Area Task
//
//
//    //Start Task Bidding Area
//
//    override fun getTaskBiddingListApiCall(request: TaskBiddingRequest.ServerTaskBiddingRequest): Observable<TaskBiddingResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKBIDDINGLIST_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(TaskBiddingResponse::class.java)
//
//    override fun performPostTaskBidding(request: TaskBiddingRequest.ServerTaskBiddingPostRequest): Observable<TaskBiddingResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(TaskBiddingResponse::class.java)
//    }
//
//    override fun performPutTaskBidding(request: TaskBiddingRequest.ServerTaskBiddingPostRequest): Observable<TaskBiddingResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_PUT)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(TaskBiddingResponse::class.java)
//
//    override fun performWithdrawPutTaskBidding(taskBiddingId: Long): Observable<TaskBiddingResponse> =
//            Rx2AndroidNetworking.delete(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_DELETE + "/" + taskBiddingId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(TaskBiddingResponse::class.java)
//
//    override fun performPutAcceptPaymentConfirmationTaskBidding(request: TaskBiddingRequest.ServerTaskBiddingPostRequest): Observable<TaskBiddingResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_PUT_PAYMENT_CONFIRMATION)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(TaskBiddingResponse::class.java)
//
//    override fun sendEmailAndNotificationTaskBiddingAlertsByTaskBiddingIdApiCall(taskBiddingId: Long): Observable<TaskBiddingResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKBIDDING_SEND_EMAIL_NOTIFICATION_TASKBIDDING_ALERTS + "/" + taskBiddingId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(TaskBiddingResponse::class.java)
//
//    override fun getTaskBiddingByTaskBiddingIdApiCall(taskBiddingId: Long): Observable<TaskBiddingResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKBIDDINGLIST_GET + "/" + taskBiddingId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(TaskBiddingResponse::class.java)
//
//    //End Task Bidding Area
//
//    //Start TaskPayment Area
//
//    override fun getTaskPaymentsInfo(request: TaskPaymentsRequest.GetTaskPayments): Observable<TaskPaymentsResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_PAYMENTS_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(TaskPaymentsResponse::class.java)
//
//    override fun performPostTaskPayment(request: TaskPaymentsRequest.ServerTaskPaymentPostRequest): Observable<TaskPaymentsResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKPAYMENT_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(TaskPaymentsResponse::class.java)
//    }
//
//    override fun performPutTaskPayment(request: TaskPaymentsRequest.ServerTaskPaymentPutRequest): Observable<TaskPaymentsResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKPAYMENT_PUT)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(TaskPaymentsResponse::class.java)
//
//    override fun performUpdateTaskPaymentStatus(taskPaymentId : TaskPaymentsRequest.UpdateTaskPaymentStatus): Observable<TaskPaymentsResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKPAYMENT_UPDATE_PAYMENT_STATUS)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(taskPaymentId)
//                    .build()
//                    .getObjectObservable(TaskPaymentsResponse::class.java)
//
//    override fun performWithdrawPutTaskPayment(taskPaymentId: Long): Observable<TaskPaymentsResponse> =
//            Rx2AndroidNetworking.delete(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKPAYMENT_DELETE + "/" + taskPaymentId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(TaskPaymentsResponse::class.java)
//
//    override fun performPostSSLvalidationTaskPayment(request: TaskPaymentsRequest.ServerTaskSSLPaymentPostRequest): Observable<TaskPaymentsResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASKPAYMENT_POSTSSLVALIDATION)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(TaskPaymentsResponse::class.java)
//    }
//
//    override fun getTaskPaymentsByTaskIDAndTaskBiddingID(request: TaskPaymentsRequest.GetTaskPaymentsByTaskIDAndTaskBiddingId): Observable<TaskPaymentsResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_PAYMENTS_GET_TASK_PAYMENT_TASKID_TASKBIDDINGID)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(TaskPaymentsResponse::class.java)
//
//    override fun sendEmailAndNotificationTaskPaymentAlertsByTaskPaymentIdApiCall(taskPaymentId: Long): Observable<TaskPaymentsResponse> =
//            Rx2AndroidNetworking.delete(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_PAYMENTS_SEND_EMAIL_NOTIFICATION_TASKPAYMENT_ALERTS + "/" + taskPaymentId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(TaskPaymentsResponse::class.java)
//
//    //End TaskPayment Area
//
//
//
//    override fun getAllTaskAlert(request: TaskAlertRequest.GetAllTaskAlert): Observable<TaskAlertResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_ALERT_KEYWORD_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(TaskAlertResponse::class.java)
//
//    override fun addNewTaskAlert(request: TaskAlertRequest.AddNewTaskAlert): Observable<TaskAlertResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_ALERT_KEYWORD_POST)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(TaskAlertResponse::class.java)
//
//    override fun updateTaskAlert(request: TaskAlertRequest.UpdateTaskAlert): Observable<TaskAlertResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_ALERT_KEYWORD_PUT)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(TaskAlertResponse::class.java)
//
//    override fun deleteTaskAlert(Id: Long): Observable<TaskAlertResponse> =
//            Rx2AndroidNetworking.delete(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_ALERT_KEYWORD_DELETE + "/" + Id)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(TaskAlertResponse::class.java)
//
//    override fun updateUserProfile(request: ProfileInfoRequest.UpdateProfileInfoSkill): Observable<ProfileInfoResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_SKILLS_PUT)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(ProfileInfoResponse::class.java)
//
//    //Start Area Notification Setting
//    override fun createNotificationSettings(request: NotificationSettingsRequest.CreateNotificationSettings): Observable<NotificationSettingsResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_SETTINGS_POST)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(NotificationSettingsResponse::class.java)
//
//    override fun updateNotificationSettings(request: NotificationSettingsRequest.UpdateNotificationSettings): Observable<NotificationSettingsResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_SETTINGS_PUT)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(NotificationSettingsResponse::class.java)
//
//    override fun getNotificationSettings(request: NotificationSettingsRequest.GetNotificationSettings): Observable<NotificationSettingsResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_SETTINGS_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(NotificationSettingsResponse::class.java)
//
//    override fun sendTestPushNotificationToUser(userId: Long): Observable<NotificationListResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_SEND_TEST_NOTIFICATION_GET + "/" + userId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(NotificationListResponse::class.java)
//
//    //send test push notification to user
//
//    // End Area Notification Setting
//
//    override fun getUserReviewListApiCall(request: UserReviewListRequest.GetUserReviewList): Observable<UserReviewListResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_REVIEW_LIST_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(UserReviewListResponse::class.java)
//
//    override fun addPaymentMethodInfo(request: PaymentMethodRequest.AddPaymentMethod): Observable<PaymentMethodResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_PAYMENT_METHOD_POST)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(PaymentMethodResponse::class.java)
//
//    override fun updatePaymentMethodInfo(request: PaymentMethodRequest.UpdatePaymentMethod): Observable<PaymentMethodResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_PAYMENT_METHOD_PUT)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(PaymentMethodResponse::class.java)
//
//    override fun getPaymentMethodInfo(request: PaymentMethodRequest.GetPaymentMethod): Observable<PaymentMethodResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_PAYMENT_METHOD_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(PaymentMethodResponse::class.java)
//
//    override fun addBillingAddressInfo(request: BillingAddressRequest.AddBillingAddress): Observable<BillingAddressResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_BILLING_ADDRESS_POST)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(BillingAddressResponse::class.java)
//
//    override fun updateBillingAddressInfo(request: BillingAddressRequest.UpdateBillingAddress): Observable<BillingAddressResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_BILLING_ADDRESS_PUT)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(BillingAddressResponse::class.java)
//
//    override fun getBillingAddressInfo(request: BillingAddressRequest.GetBillingAddress): Observable<BillingAddressResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_BILLING_ADDRESS_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(BillingAddressResponse::class.java)
//
//    // Start Time Line Area
//    override fun getTimeLinePostsListApiCall(request: TimeLinePostsRequest.ServerTimeLineRequest): Observable<TimeLinePostsResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(TimeLinePostsResponse::class.java)
//
//    override fun performPostTimeLinePost(request: TimeLinePostsRequest.ServerTimeLinePostRequest): Observable<TimeLinePostsResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_POST)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(TimeLinePostsResponse::class.java)
//
//    override fun performTimeLineCommentPost(request: TimeLinePostsRequest.ServerTimeLineCommentPostRequest): Observable<TimeLinePostsResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_COMMENTS_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(TimeLinePostsResponse::class.java)
//    }
//
//    override fun getCommentssListApiCall(request: UserCommentRequest.ServerUserCommentRequest): Observable<UserCommentResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_COMMENTS_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(UserCommentResponse::class.java)
//
//    override fun getSendEmailAndNotificationTimeLineApiCall(timelinePostId: Long): Observable<TimeLinePostsResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_SENDEMAIL_NOTIFICATION_GET + "/" + timelinePostId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(TimeLinePostsResponse::class.java)
//
//    override fun getSendEmailAndNotificationCommentApiCall(CommentId: Long): Observable<UserCommentResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TIMELINEPOSTS_COMMENTS_SENDEMAIL_NOTIFICATION_GET + "/" + CommentId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(UserCommentResponse::class.java)
//
//    //End Time Line Area
//
//    override fun uplaodPicturesApiCall(request: MediaRequest.ServerMediaPostRequest, file: File): Observable<MediaResponse> =
//            Rx2AndroidNetworking.upload(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_MEDIA_UPLOADPICTURES)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addMultipartFile("CoverFile", file)
//                    .setPriority(Priority.HIGH)
//                    .build()
//                    .getObjectObservable(MediaResponse::class.java)
//
//    override fun uplaodFileApiCall(request: MediaRequest.ServerMediaPostRequest, file: File): Observable<MediaResponse> = Rx2AndroidNetworking.upload(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_MEDIA_UPLOADFILES)
//            .addHeaders(apiHeader.privateApiHeader)
//            .addMultipartFile("CoverFile", file)
//            .setPriority(Priority.HIGH)
//            .build()
//            .getObjectObservable(MediaResponse::class.java)
//
//    override fun performChangePasswordApiCall(request: ChangePasswordRequest.PasswordChangeRequest): Observable<ChangePasswordResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_CHANGE_PASSWORD_PUT)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(ChangePasswordResponse::class.java)
//
//    override fun getNotificationListApiCall(request: NotificationListRequest.GetNotificationListRequest): Observable<NotificationListResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_LIST_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(NotificationListResponse::class.java)
//
//    override fun saveUserProfileInfoGeneralApiCall(request: ProfileInfoRequest.UpdateProfileInfoGeneral): Observable<ProfileInfoResponse> {
//
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PROFILE_SAVE)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .setPriority(Priority.HIGH)
//                .build()
//                .getObjectObservable(ProfileInfoResponse::class.java)
//    }
//
//    override fun updateUserProfileInfoGeneralApiCall(request: ProfileInfoRequest.UpdateProfileInfoGeneral): Observable<ProfileInfoResponse> {
//
//        return Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PROFILE_UPDATE)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .setPriority(Priority.HIGH)
//                .build()
//                .getObjectObservable(ProfileInfoResponse::class.java)
//    }
//
//    override fun updateUserProfileSkillApiCall(request: ProfileInfoRequest.UpdateProfileInfoSkill): Observable<ProfileInfoResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PROFILE_UPDATE)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(ProfileInfoResponse::class.java)
//
//    override fun performTaskAttachmentApiCall(request: TaskAttachmentRequest.PasswordChangeRequest): Observable<TaskAttachmentResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_CHANGE_PASSWORD_PUT)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(TaskAttachmentResponse::class.java)
//
//    override fun getDashboardSummaryInfoApiCall(request: DashboardSummaryRequest.GetDashboardSummaryRequest): Observable<DashboardSummaryResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_DASHBOARD_SUMMARY_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(DashboardSummaryResponse::class.java)
//
//    override fun getDashboardTaskSummaryInfoApiCall(request: DashboardSummaryRequest.GetDashboardSummaryRequest): Observable<DashboardTaskSummaryResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_DASHBOARD_TASK_SUMMARY_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(DashboardTaskSummaryResponse::class.java)
//
//    override fun getUserSkillListApiCall(request: UserSkillListRequest.GetUserSkillListRequest): Observable<AboutResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_SKILLS_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(AboutResponse::class.java)
//
//    override fun addUserProfileSkill(request: UserSkillListRequest.AddUsersSkillListRequest): Observable<AboutResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_SKILLS_POST)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(AboutResponse::class.java)
//
//    // Start User Rating Area
//
//    override fun performPostUserRating(request: UserRatingRequest.ServerUserRatingPostRequest): Observable<UserRatingResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_RATING_POST)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(UserRatingResponse::class.java)
//
//    override fun sendEmailAndNotificationUserRatingByUserRatingIdApiCall(userRatingId: Long): Observable<UserRatingResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_RATING_SEND_EMAIL_NOTIFICATION_GET + "/" + userRatingId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(UserRatingResponse::class.java)
//    //End User Rating Area
//
//    // Start Area User Badges
//    override fun getUserBadgeListApiCall(request: UserBadgeListRequest.GetUserBadgeListRequest): Observable<UserBadgeListResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_BADGES_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(UserBadgeListResponse::class.java)
//
//    override fun performPostUserBadgeApiCall(request: UserBadgeListRequest.GetUserBadgeRequest): Observable<UserBadgeResponse> {
//
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_BADGES_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(UserBadgeResponse::class.java)
//    }
//
//    override fun performPostUserNIDApiCall(request: UserBadgeListRequest.PostUserBadgeRequest): Observable<UserBadgeResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_BADGES_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(UserBadgeResponse::class.java)
//    }
//
//    // End Area User Badges
//
//    //Start Area User Portfullio
//
//    override fun getUserPortfulioListApiCall(request: UserPortfulioListRequest.GetUserPortfulioListRequest): Observable<UserPortfulioListResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PORTFULIO_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(UserPortfulioListResponse::class.java)
//
//    override fun getUserPublicProfileInfoApiCall(UserId: Long): Observable<UserResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PROFILE_INFO +"/" + UserId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(UserResponse::class.java)
//
//    override fun performUserPortfulioListApiCall(request: UserPortfulioListRequest.ServerUserPortfulioPostRequest): Observable<UserPortfulioListResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PORTFULIO_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(UserPortfulioListResponse::class.java)
//    }
//
//    //End Area User Portfulio
//
//    override fun performUserEmailVerificationApiCall(request: UserBadgeListRequest.GetUserBadgeRequest): Observable<UserBadgeResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_EMAIL_VERIFICATION_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(UserBadgeResponse::class.java)
//    }
//
//    override fun performForgotPasswordApiCall(request: ForgotPasswordRequest.ServerForgotPasswordRequest): Observable<ForgotPasswordResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_FORGOT_PASSWORD_POST)
//                    .addHeaders(apiHeader.publicApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(ForgotPasswordResponse::class.java)
//
//    override fun performPostFCMDeviceInfoApiCall(request: FCMDeviceInfoRequest.ServerFCMDeviceInfoRequest): Observable<FCMDeviceInfoResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_REFRESHED_TOKEN_POST)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(FCMDeviceInfoResponse::class.java)
//
//    override fun getUserPromotionCodeApiCall(request: UserPromotionRequest.GetUserPromotionRequest): Observable<UserPromotionResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PROMOTION_CODE_GET)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addQueryParameter(request)
//                    .build()
//                    .getObjectObservable(UserPromotionResponse::class.java)
//
//    override fun postUserPromotionCodeApiCall(request: UserPromotionRequest.PostUserPromotionRequest): Observable<UserPromotionResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USER_PROMOTION_CODE_POST)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(UserPromotionResponse::class.java)
//
//    override fun performReportTaskApiCall(request: ReportTaskRequest.ReportTaskRequestCall): Observable<ReportTaskResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_REPORT_TASK_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(ReportTaskResponse::class.java)
//    }
//
//    override fun saveProfilePictureApiCall(request: EntityPropertyRequest.ServerEntityPropertyPostRequest): Observable<EntityPropertyResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_PROFILE_PICTURE_POST)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(request)
//                    .build()
//                    .getObjectObservable(EntityPropertyResponse::class.java)
//
//    override fun getPublicProfileInfoApiCall(UserId: Long): Observable<ProfileInfoResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_PUBLIC_PROFILE_INFO_GET + UserId + "/basic")
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(ProfileInfoResponse::class.java)
//
//    override fun performPutMarkReadNotificationApiCall1(Ids: List<Long>): Observable<NotificationListResponse> =
//            Rx2AndroidNetworking.put(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_NOTIFICATION_MARKED_READ_PUT)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(Ids)
//                    .build()
//                    .getObjectObservable(NotificationListResponse::class.java)
//
//    override fun getTaskReviewById(TaskId: Long): Observable<UserReviewListResponse> =
//            Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_TASK_REVIEW_GET + "/" + TaskId)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .build()
//                    .getObjectObservable(UserReviewListResponse::class.java)
//
//    override fun performPostUserDeviceApiCall(request: UserDeviceRequest.ServerUserDevicePostRequest): Observable<UserDeviceResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_USERDEVICE_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(UserDeviceResponse::class.java)
//    }
//
//    override fun getDefaultServiceChargeApiCall(): Observable<ServiceChargeResponse> =
//         Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SHOHOKARI_SERVICECHARGE_GET_DEFAULT)
//        .addHeaders(apiHeader.privateApiHeader)
//        .build()
//        .getObjectObservable(ServiceChargeResponse::class.java)
//
//
//
//    override fun sendOTPApiCall(sms: SMS): Observable<SMSResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SEND_OTP_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(sms)
//                .build()
//                .getObjectObservable(SMSResponse::class.java)
//    }
//
//    override fun verifyOTPApiCall(sms: SMS): Observable<SMSResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_VERIFY_OTP_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(sms)
//                .build()
//                .getObjectObservable(SMSResponse::class.java)
//    }
//
//    override fun verifyMobileNumberApiCall(sms: SMS): Observable<SMSResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_VERIFY_MOBILE_NUMBER_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(sms)
//                .build()
//                .getObjectObservable(SMSResponse::class.java)
//    }
//
//    override fun createUserByMobileApiCall(user: SignUpRequest.ServerFacebookMobileSignUpRequest): Observable<UserResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_CREATE_USER_BY_MOBILE_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(user)
//                .build()
//                .getObjectObservable(UserResponse::class.java)
//    }
//
//    override fun updateUserByMobileApiCall(user: User): Observable<UserResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_UPDATE_USER_BY_MOBILE_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(user)
//                .build()
//                .getObjectObservable(UserResponse::class.java)
//    }
//
//    override fun getMyUserListApiCall(userId: Long): Observable<UserResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_MY_USER_LIST_GET + "?createdBy=" + userId)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(UserResponse::class.java)
//    }
//
//    override fun getUserByIdApiCall(userId: Long): Observable<UserResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_USER_BY_ID_GET + "?id=" + userId)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(UserResponse::class.java)
//    }
//
//    override fun getUserInfoApiCall(): Observable<UserResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_USER_INFO)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(UserResponse::class.java)
//    }
//
//    override fun getAllAddressApiCall(): Observable<Address.AddressResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_ALL_LOCATION_GET)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(Address.AddressResponse::class.java)
//    }
//
//    override fun getAllAddressAsStringApiCall(): Observable<Address.AddressResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_ALL_LOCATION_STRING_GET)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(Address.AddressResponse::class.java)
//    }
//
    override fun getAllDivisionApiCall(): Observable<Address.AddressResponse> {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_ALL_DIVISION_GET)
                .addHeaders(apiHeader.privateApiHeader)
                .build()
                .getObjectObservable(Address.AddressResponse::class.java)
    }
//
//    override fun getAllDistrictApiCall(): Observable<Address.AddressResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_ALL_DISTRICT_GET)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(Address.AddressResponse::class.java)
//    }
//
//    override fun getAllThanaApiCall(): Observable<Address.AddressResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_ALL_THANA_GET)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(Address.AddressResponse::class.java)
//    }
//    override fun getAllUnionApiCall(): Observable<Address.AddressResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_ALL_UNION_GET)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(Address.AddressResponse::class.java)
//    }
//
//    override fun getAllUnionByThanaApiCall(thanaId: Int): Observable<Address.AddressResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_ALL_UNION_BY_THANA_GET + "?id="+thanaId)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(Address.AddressResponse::class.java)
//    }
//
//    override fun searchAddressApiCall(keyword: String): Observable<Address.AddressResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_SEARCH_ADDRESS_GET + "/"+keyword)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(Address.AddressResponse::class.java)
//    }
//
//
//    override fun getServerAppVersion(): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_SERVER_APP_VERSION)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//
//    override fun getAllVehicleLookupApiCall(): Observable<Lookup.LookupResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_VEHICLE_LOOKUP_DATA)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(Lookup.LookupResponse::class.java)
//    }
//
//    override fun getAllVehicleCategoryLookupApiCall(): Observable<Lookup.LookupResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_VEHICLE_CATEGORY_LOOKUP_DATA)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(Lookup.LookupResponse::class.java)
//    }
//
//    // Get SSLInfo
//    override fun getSSLInfoApiCall() : Observable<CommonResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_SSL_INFO_LOOKUP_DATA)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//    override fun performCorporateApprovedQuotePostTaskBidding(request: TaskRequest.ServerTaskBiddingCorporateApprovedQuotePostRequest): Observable<TaskResponse> {
//        return  Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_CORPORATE_APPROVED_QUOTES_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(TaskResponse::class.java)
//    }
//
//    override fun performCorporateRejectQuotePostTaskBidding(request: TaskBiddingRequest.ServerTaskBiddingCorporateRejectQuotePostRequest): Observable<TaskBiddingResponse> {
//        return  Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_CORPORATE_REJECTS_QUOTES_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(TaskBiddingResponse::class.java)
//    }
//
//    override fun getShareAccountOthersApiCall(): Observable<ShareAccountOthersResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_SHARE_ACCOUNT_OTHERS)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(ShareAccountOthersResponse::class.java)
//    }
//
//    override fun shareAccountOtherApiCall(shareAccountOthers: ShareAccountOthers): Observable<ShareAccountOthersResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_SHARE_ACCOUNT_WITH_OTHERS_POST)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(shareAccountOthers)
//                .build()
//                .getObjectObservable(ShareAccountOthersResponse::class.java)
//    }
//
//
//    override fun challanUsersApiCall(taskId: String): Observable<ChallanUsersResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_ALL_CHALLAN_USER + "/" + taskId)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(ChallanUsersResponse::class.java)
//    }
//
//    override fun generateChallanApiCall(taskId: String, taskBiddingId: String): Observable<ChallanUsersResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GENERATE_CHALLAN + "/" + taskId+"/"+taskBiddingId)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(ChallanUsersResponse::class.java)
//    }
//
//    override fun doVerifyMobileNumberUsersCall(mobileNumber: String): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_VERIFY_MOBILE_FROM_SEARCH_USER + "/" + mobileNumber)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//
//
//    override fun addChallanUsersApiCall(challanUser: ChallanUsersRequest.ServerChallanUserspRequest): Observable<ChallanUsersResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_POST_ADD_CHALLAN_USER)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(challanUser)
//                .build()
//                .getObjectObservable(ChallanUsersResponse::class.java)
//    }
//
//    override fun updateCheckinoutTimeCApiCall(updateCheckinoutTime: ChallanUsersRequest.ServerUpdateCheckinoutTimeRequest): Observable<ChallanUsersResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_POST_UPDATE_CHECK_IN_OUT_TIME)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(updateCheckinoutTime)
//                .build()
//                .getObjectObservable(ChallanUsersResponse::class.java)
//    }
//
//
//    override fun addTransactionApiCall(paymentProcess: PaymentTransactionRequest.ServerPaymentTransactionRequest): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_POST_ADD_TRANSACTION)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(paymentProcess)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//    override fun getPaymentProcessListApiCall(taskId: String): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_SERACH_TRANSACTION + "?TaskId=" + taskId )
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//
//    override fun performChangeTaskOwnerCall(changeTaskOwnerRequest: ChangeStatusRequest.ServerRequestChangeTaskOwner): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_POST_CHANGE_TASK_OWNER)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(changeTaskOwnerRequest)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//    override fun performAssignKAMCall(assignKAMRequest: ChangeStatusRequest.ServerRequestAssignKAM): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_POST_ASSIGN_KAM)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(assignKAMRequest)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//    override fun performPostToPublicMarketCall(postToPublicMarketRequest: ChangeStatusRequest.ServerRequestChangeTask): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_POST_TO_PUBLIC_MARKET)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(postToPublicMarketRequest)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//    override fun performChangeStatusCropCall(changeStatusCropRequest: ChangeStatusRequest.ServerRequestChangeTask): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_POST_CHANGE_TASK_STATUS_CROP)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(changeStatusCropRequest)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//    override fun performQuotesJobsCall(quotesJobsRequest: ChangeStatusRequest.ServerRequestQuotesJobs): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_POST_QUOTES_JOBS)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(quotesJobsRequest)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//    //Admin Task Search
//    override fun getBrowseTaskInfoByAdminSearchApiCall(request: TaskRequest.ServerAdminTaskSearchRequest): Observable<TaskResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_TASK_INFORMATION_BY_ADMIN_SEARCH)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addQueryParameter(request)
//                .build()
//                .getObjectObservable(TaskResponse::class.java)
//    }
//
//    override fun getVerifyUserApiCall(request: ChangeStatusRequest.ServerRequestVerifyUser): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_GET_VERIFY_USER)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(request)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//
//    override fun getMyBalanceSubmissionListApiCall(): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_TRANSACTION_MYBALANCE_SUBMISSION_INFO )
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//    override fun addMyBalanceSubmissionCall(myBalanceSubmission: MyBalanceRequest.ServerMyBalanceSubmissionRequest): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_GET_TRANSACTION_MYBALANCE_SUBMISSION)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(myBalanceSubmission)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//    override fun performAssignTasksToDriverAsOwnerCall(assignTaksToDriverAsOwnerRequest: ChangeStatusRequest.ServerRequestAssignTasksToDriverAsOwnerOwner): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_POST_ASSIGN_TASK_TO_DRIVER_AS_OWNER)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(assignTaksToDriverAsOwnerRequest)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//
//    override fun addPreferredLocationApiCall(preferredLocationRequest: PreferredLocationRequest.ServerPreferredLocationRequest): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_POST_PREFERRED_LOCATION)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(preferredLocationRequest)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//
//    override fun getPreferredLocationApiCall(userId: String): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_PREFERRED_LOCATION + "/" + userId )
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//
//    override fun deletePreferredLocationApiCall(deletePreferredLocationRequest :PreferredLocationRequest.DeletePreferredLocationRequest): Observable<CommonResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_POST_DELETE_PREFERRED_LOCATION)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(deletePreferredLocationRequest)
//                    .build()
//                    .getObjectObservable(CommonResponse::class.java)
//
//    override fun downloadTaskReportApiCall(taskReportRequest : TaskReportRequest.ServerTaskReportPostRequest): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_DOWNLOAD_TASK_REPORT)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(taskReportRequest)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//    override fun downloadDynamicReportApiCall(dynamicReportRequest : TaskReportRequest.ServerTaskReportPostRequest): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_DOWNLOAD_DYNAMIC_REPORT)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(dynamicReportRequest)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//    override fun addPreferredFieldApiCall(preferredFieldRequest: PreferredLocationRequest.ServerPreferredFieldRequest): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_POST_PREFERRED_FIELD)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(preferredFieldRequest)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//
//    override fun getPreferredFieldApiCall(userId: String): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_PREFERRED_FIELD + "/" + userId )
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//
//    override fun deletePreferredFieldApiCall(deletePreferredFieldRequest: PreferredLocationRequest.DeletePreferredFieldRequest): Observable<CommonResponse> =
//            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_POST_DELETE_PREFERRED_FIELD)
//                    .addHeaders(apiHeader.privateApiHeader)
//                    .addBodyParameter(deletePreferredFieldRequest)
//                    .build()
//                    .getObjectObservable(CommonResponse::class.java)
//
//
//    override fun addTaskPaymentByCustomerApiCall(paymentByCustomerRequest: TaskPaymentByCustomerRequest.ServerTaskPaymentByCustomerRequest): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_POST_TASK_PAYMENT_BY_CUSTOMER)
//                .addHeaders(apiHeader.privateApiHeader)
//                .addBodyParameter(paymentByCustomerRequest)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//
//    override fun getTaskPaymentByCustomerApiCall(taskId: String): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_SERVER_GET_TASK_PAYMENT_BY_CUSTOMER + "/" + taskId )
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }
//
//    override fun deleteTaskPaymentByCustomerApiCall(taskPaymentId: String): Observable<CommonResponse> {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_GET_DELETE_TASK_PAYMENT_BY_CUSTOMER + "/" + taskPaymentId)
//                .addHeaders(apiHeader.privateApiHeader)
//                .build()
//                .getObjectObservable(CommonResponse::class.java)
//    }

}



