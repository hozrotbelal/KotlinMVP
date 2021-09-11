package com.example.testmvp.util




object AppConstants {

    internal val APP_DB_NAME = "trux24_mvp.db"
    internal val PREF_NAME = "trux24_pref"
    internal val SEED_DATABASE_QUESTIONS = "seed/questions.json"
    internal val SEED_DATABASE_OPTIONS = "seed/options.json"
    internal val DEVICE_TYPE = "Android"
    internal val BROSWER_NAME = "AndroidApp"
    internal val VERSION_NO = "1.1"

    internal val LOG_TAG_EXCEPTION = "Exception_Log"
    internal val LOG_TAG_ERROR = "Error_Log"

    internal val LANGUGAE_BANGLA = "bn"
    internal val LANGUGAE_ENGLISH = "en"

    internal val MEDIA_STATUS = "MediaStatus"
    internal val GOODS_TYPE_ID = "GoodsTypeId"
    internal val GOODS_ID = "GoodsId"
    internal val GOODS_NAME = "GoodsName"

    internal val TASK_PAYMENT_METHOD_CASH = "Cash"
    internal val TASK_PAYMENT_METHOD_CARD = "Bank"

    internal val TASK_PAYMENT_METHOD_BANK = "Bank"
    internal val TASK_PAYMENT_METHOD_CREDIT_CARD = "Card"

    internal val TASK_PAYMENT_METHOD_BIKASH = "Bikash"
    internal val TASK_PAYMENT_METHOD_ROCKET = "Rocket"

    internal val BIKASH_NUMBER_LENGTH = 11
    internal val ROCKET_NUMBER_LENGTH = 12
    //ImageCompressSize
    internal val IMAGE_SIZE_1024 = 1024
    internal val IMAGE_SIZE_HIGHT = 1080
    internal val IMAGE_SIZE_WIDTH = 1080

    // Message Type
    internal var SUCCESS_MESSAGE = "Success"
    internal var WARNING_MESSAGE = "Warning"
    internal var VALIDATION_MESSAGE = "Validation"
    internal var ERROR_MESSAGE = "Error"
    internal var UNAUTHORIZED_MESSAGE = "UnAuthorize"

    internal var STATUS_VERIFIED = "VERIFIED"
    internal var STATUS_UNVERIFIED = "UNVERIFIED"
    // Error Code
    internal val EMPTY_EMAIL_ERROR = 1001
    internal val INVALID_EMAIL_ERROR = 1002
    internal val EMPTY_PASSWORD_ERROR = 1003
    internal val LOGIN_FAILURE = 1004
    internal val SIGNUP_FAILURE_ALREADYACCOUNT = 1005
    internal val UNABLE_TO_FAILURE = 1055

    internal val NULL_INDEX = -1L

    internal val EMPTY_FIRST_NAME_ERROR = 5001
    internal val EMPTY_LAST_NAME_ERROR = 5002
    internal val EMPTY_USER_TAG_ERROR = 50002
    internal val EMPTY_MOBILE_NUMBER_ERROR = 5004
    internal val EMPTY_ADDRESS_ERROR = 5003
    internal val EMPTY_DATE_OF_BIRTH_ERROR = 5005
    internal val INVALID_VERIFICATION_CODE= 5006
    internal val EMPTY_OTP_ERROR = 5007
    internal val EMPTY_PREFERRED_NAME_ERROR = 50007
    internal val EMPTY_PREFERRED_FIELD_NAME_ERROR = 50008
    internal val EMPTY_PREFERRED_FIELD_NAME_BN_ERROR = 50009

    // Challan Users
    internal val EMPTY_NAME_ERROR = 5501
    internal val EMPTY_REG_NO_ERROR = 5502
    internal val EMPTY_CAPACITY_ERROR = 5503


    internal val TASK_TITLE_EMPTY = 1005
    internal val TASK_DESCRIPTION_EMPTY = 1006
    internal val TASK_LOCATION_EMPTY = 1007
    internal val TASK_PICK_UP_THANA_LOCATION_EMPTY = 1107
    internal val TASK_DROPOFF_LOCATION_EMPTY = 2007
    internal val TASK_DROPOFF_THANA_LOCATION_EMPTY = 2207

    internal val TASK_GOODS_TYPE_EMPTY = 2002
    internal val TASK_GOODS_QUANTITY_EMPTY = 2003
    internal val TASK_GOODS_UNITS_EMPTY = 2004
    internal val TASK_DUE_DATE_EMPTY = 1008
    internal val TASK_DUE_END_DATE_EMPTY = 1808
    internal val TASK_DUE_END_DATE_CHECK_TO_CURRENT_DATE = 1809
    internal val TASK_DUE_DATE_COMAPRE_TO_END_DATE = 1810
    internal val TASK_TIME_VALID_CHECK = 1811
    internal val TASK_REPORT_FROM_DATE_EMPTY = 1812
    internal val TASK_REPORT_TO_DATE_EMPTY = 1813

    internal val TASK_DUE_CORPORATE_RECURING_EMPTY = 1888
    internal val TASK_DATE_TIME_EMPTY = 1088
    internal val TASK_PRICE_EMPTY = 1009
    internal val TASK_INVALID_HOUR_EMPTY = 1009
    internal val TASK_INVALID_HOUR_RATE_EMPTY = 1010
    internal val TASK_SHOHOKARI_EMPTY = 1011
    internal val TASK_INVALID_TRUCK_COUNT_EMPTY = 2022

    internal val VEHICLE_TYPE_EMPTY = 7001
    internal val VEHICLE_CAPACITY_EMPTY = 7002
    internal val VEHICLE_SIZE_EMPTY = 7003


    internal val REGISTRATION_FAILURE = 1014

    //Make Offer
    internal val TASK_MAKE_OFFER_SUCCESS = 1012
    internal val TASK_MAKE_OFFER_EROR = 1013

    internal val EMPTY_MOBILENUMBER_ERROR = 1014
    internal val EMPTY_REFERENCEID_ERROR = 1015

    // Payment Process
    internal val PAYMENT_TRANSACTION_AMOUNT_ERROR = 1110
    internal val PAYMENT_TRANSACTION_NOTE_ERROR = 1111
    internal val PAYMENT_TRANSACTION_REFERANCE_ERROR = 1112

    //Task Payment By Customer
    internal val TASK_PAYMENT_BY_CUSTOMER_AMOUNT_ERROR = 1113
    //Task Alert
    internal val EMPTY_TASK_ALERT_KEYWORD_ERROR = 1016
    internal val EMPTY_TASK_ALERT_LOCATION_ERROR = 1017
    internal val ERROR_SUBMITTED_UNSUCCESSFULLY = 1018
    internal val SUCCESS_SUBMITTED_SUCCESSFULLY = 1019

    internal val SUCCESS = 1020
    internal val FAILED = 1021
    internal val SEND_QUOTATION_TASK_BIDDING_ID_EMPTY = 1022

    // Task Status
    internal val TASK_STATUS_DRAFT = 903

    internal val TASK_STATUS_ACTIVE = 101
    internal val TASK_STATUS_ACCEPTED = 102
    internal val TASK_STATUS_PAYMENTED = 103
    internal val TASK_STATUS_CANCELLED = 104
    internal val TASK_STATUS_DELETED = 105
    internal val TASK_STATUS_ADVANCED = 108
    internal val TASK_STATUS_RECEIVED_PAYMENT = 202


    internal val TASK_STATUS_ALL = 901
    internal val TASK_STATUS_PENDINGTASK = 902
    internal val STATUS_ALL_PRIVATEMESSAGE = 904

    // Question and reply
    internal const val QUESTION_EMPTY = 2000
    internal const val QUESTION_REPLY_EMPTY = 2001


    internal val STATUS_PAYMENT_METHOD_CASH: String = "CASH"
    internal val STATUS_PAYMENT_METHOD_FUNDED: String = "FUNDED"
    internal val STATUS_PAYMENT_METHOD_ADVANCED: String = "ADVANCED"
    internal val STATUS_PAYMENT_METHOD_FUNDED_REQUESTPAYMENT: String = "FUNDED_REQUESTPAYMENT"
    internal val STATUS_PAYMENT_METHOD_FUNDED_RELEASEPAYMENT: String = "FUNDED_RELEASEPAYMENT"

    internal val STATUS_TASK_BIDDING_REQUEST_PAYMENT: String = "REQUESTPAYMENT"
    internal val STATUS_TASK_BIDDING_RECEIVED_PAYMENT: String = "RECEIVEDPAYMENT"

    internal val RESOULUTION_TYPE_TASK: String = "Task"
    internal val RESOULUTION_TYPE_USER: String = "User"
    internal val RESOULUTION_TYPE_COMMENT: String = "Comment"
    internal val RESOULUTION_TYPE_OTHER: String = "Other"

    internal val PROMO_ROLE: String = "Promo"
    internal val RECEIVED_PAYMENT: String = "RECEIVED PAYMENT"
    internal val SUPPLYER_PAYMENT: String = "SUPPLYER PAYMENT"
    internal val PREFERRED_LOCATION: String = "Preferred location"


    internal val RESOULUTION_TYPE_TASK_SPAMREPORT: String = "Task Spam Report"
    internal val RESOULUTION_TYPE_TASK_OFFERCOMMENT_SPAMREPORT: String = "Offer Comment Spam Report"
    internal val RESOULUTION_TYPE_TASK_COMMENT_SPAMREPORT: String = "Comment Spam Report"
    internal val RESOULUTION_TYPE_DEMURRAGE_CLAIM: String = "Demurrage Claim"
    internal val RESOULUTION_TYPE_REFUND_CLAIM: String = "Refund Claim"

    internal val USERDEVICE_EVENTTYPE_INSTALL: String = "Install"
    internal val USERDEVICE_EVENTTYPE_LOGIN: String = "Login"
    internal val USERDEVICE_EVENTTYPE_LOGOUT: String = "Logout"
    internal val USERDEVICE_EVENTTYPE_UnInstall: String = "UnInstall"

    internal val USERDEVICE_EVENTTYPE_VISIT_TASK_CATEGORY: String = "Task Category"
    internal val USERDEVICE_EVENTTYPE_VISIT_BROWSE_TASK: String = "Browse Task"

    internal val USER_TAG_CUSTOMER: String = "Customer"
    internal val USER_TAG_AGENT: String = "Agent"
    internal val USER_TAG_OWNER: String = "Owner"
    internal val USER_TAG_DRIVER: String = "Driver"
    internal val USER_TAG_CORPORATE: String = "Corporate"
    internal val USER_COMMUNITY_ID_UNVERIFIED_SUPPLIER: String = "1"
    internal val USER_COMMUNITY_ID_UNVERIFIED_CUSTOMER: String = "4"

    internal val USER_COMMUNITY_ID_CORPORATE_UNVERIFIED: String = "5"
    internal val USER_COMMUNITY_ID_CORPORATE_VERIFIED: String = "6"
    internal val USER_TRIP_SCHEDULE_CORPORATE_ONCE: String = "1"
    internal val USER_TRIP_SCHEDULE_CORPORATE_RECURRING: String = "2"
    internal val USER_TYPE_SERVICE_CHARGE_ONLY: Int  = 2

    internal val USER_PROFILE_NATIONAL_ID_CARD: String = "NationalIDCard"
    internal val USER_PROFILE_DRIVING_LICENCE_NO: String = "DrivingLicenseNo"
    internal val USER_PROFILE_REGISTRATION_NUMBER: String = "RegistrationNumber"
    internal val USER_PROFILE_TRADE_LICENCE_NO: String = "TradeLicenseNo"
    internal val USER_PROFILE_CORPORATE_COMPANY_DOCUMENT: String = "CompanyDocuments"
    internal val USER_PROFILE_TRUCK_IMAGES: String = "TruckImages"

    internal val GALLERY = 1
    internal val CAMERA = 2
    internal val PERMISSION_REQUEST_CODE = 200

    internal const val CORPORATE_TRIP = 10

    internal const val CORPORATE_PENDING = 601
    internal const val CORPORATE_POSTED = 602
    internal const val CORPORATE_QUUTES = 603
    internal const val CORPORATE_APPROVED = 604
    internal const val CORPORATE_REJECTED = 605
    internal const val CORPORATE_COMPLETED = 606
    internal const val CORPORATE_CASHPAID = 607
    internal const val CORPORATE_CREDITPAID = 608


    internal fun getSatus(status: Int): String {
        when (status) {
            1 -> return "Receipt"

            2 -> return "Payment"

            3 -> return "POST"

            4 -> return "PURCHASE ORDER"

            101 -> return "ACTIVE"

            102 -> return "ASSIGNED"

            103 -> return "PAID"

            104 -> return "CANCELLED"
            105 -> return "DELETED"

            108 -> return "ADVANCED"

            901 -> return "ALLTASK"
            902 -> return "PENDINGTASK"
            903 -> return "DRAFT"
            904 -> return "PRIVATEMESSAGE"


            201 -> return "REQUESTPAYMENT"
            202 -> return "RECEIVEDPAYMENT"
            203 -> return "FUNDED"
            204 -> return "CASH"
            205 -> return "FUNDED_REQUESTPAYMENT"
            206 -> return "FUNDED_RELEASEPAYMENT"


            905 -> return "VERIFIED"
            906 -> return "UNVERIFIED"

            else ->

                return ""
        }
    }



    internal fun getSatus(status: String): Int {
        when (status) {
            "Receipt" -> return 1

            "Payment" -> return 2

            "POST" -> return 3

            "PURCHASE ORDER" -> return 4

            "ACTIVE" -> return 101

            "ASSIGNED" -> return 102

            "PAID" -> return 103

            "CANCELLED" -> return 104
            "DELETED" -> return 105
            "ADVANCED" -> return 108

            "ALLTASK" -> return 901
            "PENDINGTASK" -> return 902
            "DRAFT" -> return 903
            "PRIVATEMESSAGE" -> return 904


            "REQUESTPAYMENT" -> return 201
            "RECEIVEDPAYMENT" -> return 202
            "FUNDED" -> return 203
            "CASH" -> return 204
            "FUNDED_REQUESTPAYMENT" -> return 205
            "FUNDED_RELEASEPAYMENT" -> return 206


            "VERIFIED" -> return 905
            "UNVERIFIED" -> return 906


            else ->
                return 1
        }
    }

    enum class LoggedInMode constructor(val type: Int) {
        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_GOOGLE(1),
        LOGGED_IN_MODE_FB(2),
        LOGGED_IN_MODE_SERVER(3)
    }


    //Notification Entity

    internal val NOTIFICATION_NAME_SEED_DATABASE_QUESTIONS = "seed/questions.json"
    internal val NOTIFICATION_NAME_SEED_TIMELINEPOST = "TimelinePost"
    internal val NOTIFICATION_NAME_TIMELINEPOSTCOMMENT = "Comment"
    internal val NOTIFICATION_NAME_MATCHFORACTIONPOST = "MatchForActionPost"
    internal val NOTIFICATION_NAME_MatchForActionPostJoin = "MatchForActionPostJoin"
    internal val NOTIFICATION_NAME_MatchForActionComment = "MatchForActionComment"
    internal val NOTIFICATION_NAME_Meetup = "Meetup"
    internal val NOTIFICATION_NAME_MeetupJoin = "MeetupJoin"
    internal val NOTIFICATION_NAME_MeetupComment = "MeetupComment"
    internal val NOTIFICATION_NAME_EventCalendar = "EventCalendar"
    internal val NOTIFICATION_NAME_EventCalendarJoin = "EventCalendarJoin"
    internal val NOTIFICATION_NAME_EventCalenderComment = "EventCalenderComment"
    internal val NOTIFICATION_NAME_Venture = "Venture"
    internal val NOTIFICATION_NAME_VentureJoin = "VentureJoin"
    internal val NOTIFICATION_NAME_VentureComment = "VentureComment"
    internal val NOTIFICATION_NAME_Comment = "Comment"
    internal val NOTIFICATION_NAME_UserLocationChange = "UserLocationChange"
    internal val NOTIFICATION_NAME_Task = "Task"
    internal val NOTIFICATION_NAME_TaskCompleted = "TaskCompleted"
    internal val NOTIFICATION_NAME_TaskBidding = "TaskBidding"
    internal val NOTIFICATION_NAME_TaskBiddingAccepted = "TaskBiddingAccepted"
    internal val NOTIFICATION_NAME_TaskBiddingRequestPayment = "TaskBiddingRequestPayment"
    internal val NOTIFICATION_NAME_TaskBiddingReceivedPayment = "TaskBiddingReceivedPayment"
    internal val NOTIFICATION_NAME_TaskBiddingComment = "TaskBiddingComment"
    internal val NOTIFICATION_NAME_TaskBiddingAdminComment = "TaskBiddingAdminComment"
    internal val NOTIFICATION_NAME_TaskPayment = "TaskPayment"
    internal val NOTIFICATION_NAME_TaskPaymentConfirmation = "TaskPaymentConfirmation"
    internal val NOTIFICATION_NAME_UserRating = "UserRating"
    internal val NOTIFICATION_NAME_User = "User"
    internal val NOTIFICATION_NAME_IpProperties = "IpProperties"
    internal val NOTIFICATION_NAME_TimeLinePostsDeleted = "TimeLinePostsDeleted"
    internal val NOTIFICATION_NAME_UserPromotion = "UserPromotion"

    internal val NOTIFICATION_NAME_TaskQuotes = "TaskQuotes"


    internal val TestPushNotitification = "TestPushNotitification"
    internal val NOTIFICATION_NAME_BROADCAST = "Broadcast"
    internal val NOTIFICATION_NAME_BROADCAST_TASK_ADMIN = "Broadcast_Task_Admin"


    //Running Activity Name for Private chats

    internal var APPLICATION_RUNNING_ACTIVITY_NAME = ""

    // Common arraylist for vehicle type,capacity and size
    internal var list_vehicle_type = arrayOf("All","Open Truck","Covered Van")
    internal var list_vehicle_capacity = arrayOf("All","1 Ton","2 Ton","3.5 Ton","5 Ton","7.5 Ton","10 Ton","15 Ton","25 Ton", "25+ Ton")
    internal var list_vehicle_size = arrayOf("All","7 Feet","10 Feet","12 Feet","16 Feet","18 Feet","22 Feet","22+ Feet")

    internal var list_vehicle_type_bn = arrayOf("যেকোনো","খোলা ট্রাক","কাভার্ড ভ্যান")
    internal var list_vehicle_capacity_bn = arrayOf("যেকোনো","১ টন","২ টন","৩.৫ টন","৫ টন","৭.৫ টন","১০ টন","১৫ টন","২৫ টন", "২৫+ টন")
    internal var list_vehicle_size_bn = arrayOf("যেকোনো","৭ ফুট","১০ ফুট","১২ ফুট","১৬ ফুট","১৮ ফুট","২২ ফুট","২২+ ফুট")

    internal var list_recurring_type_name = arrayOf("Every day","One day in a row","Two days in a row","Three days in a row","Seven days in a row")
    internal var list_recurring_type_name_bn = arrayOf("প্রতিদিন","এক দিন পরপর","দুই দিন পরপর","তিন দিন পরপর","সাত দিন পরপর ")
    internal var list_recurring_type_id = arrayOf(1,2,3,4,7)

    internal var list_status_name = arrayOf("--Select Status--","ACTIVE","ASSIGNED","CREDITED (Corporate)","DRAFT","CANCELLED","ADVANCED","PAID","PENDING (Corporate)","POSTED (Corporate)","QUOTES (Corporate)","APPROVED (Corporate)","REJECTED (Corporate)","COMPLETED (Corporate)","CASH PAID (Corporate)")
    //internal var list_status_bn = arrayOf("প্রতিদিন","এক দিন পরপর","দুই দিন পরপর","তিন দিন পরপর","সাত দিন পরপর ")
    internal var list_status_id = arrayOf(0,101,102,608,903,104,108,103,601,602,603,604,605,606,607)

    internal var list_tags_name = arrayOf("--Select Tags--","Corporate","Customer","Driver","Owner","Agent")
    internal var list_tags_bn = arrayOf("--ট্যাগ নির্বাচন করুন--","কর্পোরেট","কাস্টমার","ড্রাইভার","মালিক","এজেন্ট")

    internal var list_user_type_name = arrayOf("Customer","Driver","Owner","Agent","Corporate")
    internal var list_user_type_name_bn = arrayOf("কাস্টমার","ড্রাইভার","মালিক","এজেন্ট","কর্পোরেট")


}
