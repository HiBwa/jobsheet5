package com.fikrisapplication.app.modules.addresep.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.base.BaseActivity
import com.fikrisapplication.app.databinding.ActivityAddResepBinding
import com.fikrisapplication.app.modules.addresep.`data`.viewmodel.AddResepVM
import com.fikrisapplication.app.modules.homepage.ui.HomepageActivity
import com.fikrisapplication.app.modules.profil.ui.ProfilActivity
import com.fikrisapplication.app.modules.search.ui.SearchActivity
import kotlin.String
import kotlin.Unit

class AddResepActivity : BaseActivity<ActivityAddResepBinding>(R.layout.activity_add_resep) {
  private val viewModel: AddResepVM by viewModels<AddResepVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addResepVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDraft.setOnClickListener {
      val destIntent = ProfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSave.setOnClickListener {
      val destIntent = ProfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageVectorOne.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageVector.setOnClickListener {
      val destIntent = HomepageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADD_RESEP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddResepActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
