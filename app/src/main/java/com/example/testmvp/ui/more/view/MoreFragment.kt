package com.example.testmvp.ui.more.view

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.*
import android.widget.Toast
import butterknife.ButterKnife
import com.example.testmvp.R
import com.example.testmvp.data.managers.LookupManager
import com.example.testmvp.data.network.UserDevice
import com.example.testmvp.data.preferences.AppPreferenceHelper

import com.example.testmvp.ui.base.view.BaseFragment

import com.example.testmvp.ui.main.view.MainActivity
import com.example.testmvp.ui.more.interactor.MoreMVPInteractor
import com.example.testmvp.ui.more.presenter.MoreMVPPresenter

import com.example.testmvp.util.AppConstants
import com.example.testmvp.util.CommonUtil
import com.example.testmvp.widget.OptionListItem
import kotlinx.android.synthetic.main.fragment_more.*
import javax.inject.Inject


class MoreFragment : BaseFragment(), MoreMVPView, View.OnClickListener {

    companion object {

        internal val TAG = "MoreFragment"

        fun newInstance(): MoreFragment {
            return MoreFragment()
        }
    }

    private var optionListItemOne: OptionListItem? = null
    private var optionListItemTwo: OptionListItem? = null

    lateinit var rootView: View

    lateinit var appPreferenceHelper: AppPreferenceHelper

    //private lateinit var mMediaPlayer: MediaPlayer

    private lateinit var soundMenu: MenuItem
    private lateinit var languageMenu: MenuItem
    public lateinit var optionListItem6: OptionListItem
    @Inject
    internal lateinit var presenter: MoreMVPPresenter<MoreMVPView, MoreMVPInteractor>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        activity?.title = getString(R.string.navigation_bar_more_label)
        rootView = inflater.inflate(R.layout.fragment_more, container, false)
        ButterKnife.bind(this, rootView)

        appPreferenceHelper = AppPreferenceHelper(requireContext()!!, AppConstants.PREF_NAME)
        return rootView
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        presenter.onAttach(this)
        super.onViewCreated(view, savedInstanceState)
    }


    override fun onDestroyView() {
        presenter.onDetach()
        super.onDestroyView()
    }

    override fun setUp() {

        //  loadDataIntoWidgets()
    }

    override fun onResume() {
        super.onResume()


        var mainActivity = activity as MainActivity
        if (mainActivity != null) {
            mainActivity.refreshCountData()
        }

        loadDataIntoWidgets()
    }

    private fun loadDataIntoWidgets() {

        if (layoutOptionsList != null && layoutOptionsList.childCount > 0) {
            layoutOptionsList.removeAllViews()
        }

        // Admin Check

        val optionListItem1 = OptionListItem(requireContext(), getString(R.string.dashboard_screen_title), "", this)
        val optionListItem2 = OptionListItem(requireContext(), getString(R.string.more_options_profile_label), "", this)

        val optionListItem3 = OptionListItem(requireContext(), getString(R.string.more_options_my_balance), "", this)
        val optionListItem4 = OptionListItem(requireContext(), getString(R.string.more_options_payment_history_label), "", this)

        layoutOptionsList?.addView(optionListItem1.view, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        layoutOptionsList?.addView(optionListItem2.view, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        layoutOptionsList?.addView(optionListItem3.view, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        layoutOptionsList?.addView(optionListItem4.view, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT))

    }

    override fun showValidationMessage(errorCode: Int) {
        when (errorCode) {
            AppConstants.EMPTY_EMAIL_ERROR -> Toast.makeText(requireContext(), getString(R.string.empty_email_error_message), Toast.LENGTH_LONG).show()
            AppConstants.INVALID_EMAIL_ERROR -> Toast.makeText(requireContext(), getString(R.string.invalid_email_error_message), Toast.LENGTH_LONG).show()
            AppConstants.EMPTY_PASSWORD_ERROR -> Toast.makeText(requireContext(), getString(R.string.empty_password_error_message), Toast.LENGTH_LONG).show()
            AppConstants.LOGIN_FAILURE -> Toast.makeText(requireContext(), "Log Out Error", Toast.LENGTH_LONG).show()
        }
    }

    override fun onClick(v: View?) {

        var string = v?.tag as String
        when (string) {
            getString(R.string.dashboard_screen_title) -> Toast.makeText(requireContext(), getString(R.string.dashboard_screen_title), Toast.LENGTH_LONG).show()
            getString(R.string.more_options_profile_label) -> Toast.makeText(requireContext(), getString(R.string.more_options_profile_label), Toast.LENGTH_LONG).show()
            getString(R.string.more_options_my_balance) -> Toast.makeText(requireContext(), getString(R.string.more_options_my_balance), Toast.LENGTH_LONG).show()
            getString(R.string.more_options_payment_history_label) -> Toast.makeText(requireContext(), getString(R.string.more_options_payment_history_label), Toast.LENGTH_LONG).show()

        }
    }



//    private fun showAdminActivity() {
//        val intent = Intent(requireContext(), AdminActivity::class.java)
//        startActivity(intent)
//    }

    override fun clearData() {
        try {


//
//            val intent = Intent(getBaseActivity(), IntroductionActivity::class.java)
//            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
//            startActivity(intent)
//            getBaseActivity()?.finish()
        } catch (ex: Exception) {
            var msg = ex.message;
        }
    }


    //Start Audio Area

    override fun onStart() {
        super.onStart()

    }

    override fun onStop() {
        super.onStop()

    }



}