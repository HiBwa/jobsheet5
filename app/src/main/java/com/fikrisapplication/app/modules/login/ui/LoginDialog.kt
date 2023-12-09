package com.fikrisapplication.app.modules.login.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.base.BaseDialogFragment
import com.fikrisapplication.app.databinding.DialogLoginBinding
import com.fikrisapplication.app.modules.homepage.ui.HomepageActivity
import com.fikrisapplication.app.modules.login.`data`.viewmodel.LoginVM
import com.fikrisapplication.app.modules.register.ui.RegisterDialog
import kotlin.String
import kotlin.Unit

class LoginDialog : BaseDialogFragment<DialogLoginBinding>(R.layout.dialog_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBelumPunyaAku.setOnClickListener {
      val destFragment = RegisterDialog.getInstance(null)
      destFragment.show(requireActivity().supportFragmentManager, RegisterDialog.TAG)
    }
    binding.btnLoginOne.setOnClickListener {
      val destIntent = HomepageActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "LOGIN_DIALOG"


    fun getInstance(bundle: Bundle?): LoginDialog {
      val fragment = LoginDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
