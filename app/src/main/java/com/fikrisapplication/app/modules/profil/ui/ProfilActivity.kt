package com.fikrisapplication.app.modules.profil.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.base.BaseActivity
import com.fikrisapplication.app.databinding.ActivityProfilBinding
import com.fikrisapplication.app.modules.addresep.ui.AddResepActivity
import com.fikrisapplication.app.modules.editprofil.ui.EditprofilActivity
import com.fikrisapplication.app.modules.homepage.ui.HomepageActivity
import com.fikrisapplication.app.modules.profil.`data`.viewmodel.ProfilVM
import com.fikrisapplication.app.modules.search.ui.SearchActivity
import com.fikrisapplication.app.modules.viewmasakan.ui.ViewmasakanActivity
import kotlin.String
import kotlin.Unit

class ProfilActivity : BaseActivity<ActivityProfilBinding>(R.layout.activity_profil) {
  private val viewModel: ProfilVM by viewModels<ProfilVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profilVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageVector.setOnClickListener {
      val destIntent = HomepageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnEditProfill.setOnClickListener {
      val destIntent = EditprofilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleFortyEight.setOnClickListener {
      val destIntent = ViewmasakanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSendPlusFill.setOnClickListener {
      val destIntent = AddResepActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageVectorOne.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleFiftyOne.setOnClickListener {
      val destIntent = ViewmasakanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleFortyNine.setOnClickListener {
      val destIntent = ViewmasakanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleFifty.setOnClickListener {
      val destIntent = ViewmasakanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfilActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
