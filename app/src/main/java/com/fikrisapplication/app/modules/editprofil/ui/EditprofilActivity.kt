package com.fikrisapplication.app.modules.editprofil.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.base.BaseActivity
import com.fikrisapplication.app.databinding.ActivityEditprofilBinding
import com.fikrisapplication.app.modules.editprofil.`data`.viewmodel.EditprofilVM
import com.fikrisapplication.app.modules.profil.ui.ProfilActivity
import kotlin.String
import kotlin.Unit

class EditprofilActivity : BaseActivity<ActivityEditprofilBinding>(R.layout.activity_editprofil) {
  private val viewModel: EditprofilVM by viewModels<EditprofilVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editprofilVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {
      val destIntent = ProfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBack.setOnClickListener {
      val destIntent = ProfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDITPROFIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditprofilActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
