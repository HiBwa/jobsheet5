package com.fikrisapplication.app.modules.viewmasakan.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.base.BaseActivity
import com.fikrisapplication.app.databinding.ActivityViewmasakanBinding
import com.fikrisapplication.app.modules.addresep.ui.AddResepActivity
import com.fikrisapplication.app.modules.homepage.ui.HomepageActivity
import com.fikrisapplication.app.modules.search.ui.SearchActivity
import com.fikrisapplication.app.modules.viewmasakan.`data`.viewmodel.ViewmasakanVM
import kotlin.String
import kotlin.Unit

class ViewmasakanActivity : BaseActivity<ActivityViewmasakanBinding>(R.layout.activity_viewmasakan)
    {
  private val viewModel: ViewmasakanVM by viewModels<ViewmasakanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.viewmasakanVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageVector.setOnClickListener {
      val destIntent = HomepageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSendPlusFill.setOnClickListener {
      val destIntent = AddResepActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = HomepageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "VIEWMASAKAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ViewmasakanActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
