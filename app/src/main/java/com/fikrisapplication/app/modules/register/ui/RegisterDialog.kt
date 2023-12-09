package com.fikrisapplication.app.modules.register.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.base.BaseDialogFragment
import com.fikrisapplication.app.databinding.DialogRegisterBinding
import com.fikrisapplication.app.modules.homepage.ui.HomepageActivity
import com.fikrisapplication.app.modules.login.ui.LoginDialog
import com.fikrisapplication.app.modules.register.`data`.viewmodel.RegisterVM
import kotlin.String
import kotlin.Unit

class RegisterDialog : BaseDialogFragment<DialogRegisterBinding>(R.layout.dialog_register) {
  private val viewModel: RegisterVM by viewModels<RegisterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.registerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDaftarOne.setOnClickListener {
      val destIntent = HomepageActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
    binding.txtSudahPunyaAku.setOnClickListener {
      val destFragment = LoginDialog.getInstance(null)
      destFragment.show(requireActivity().supportFragmentManager, LoginDialog.TAG)
    }
  }

  companion object {
    const val TAG: String = "REGISTER_DIALOG"


    fun getInstance(bundle: Bundle?): RegisterDialog {
      val fragment = RegisterDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
