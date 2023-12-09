package com.fikrisapplication.app.modules.homepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.base.BaseActivity
import com.fikrisapplication.app.databinding.ActivityHomepageBinding
import com.fikrisapplication.app.modules.addresep.ui.AddResepActivity
import com.fikrisapplication.app.modules.homepage.`data`.model.HomepageRowModel
import com.fikrisapplication.app.modules.homepage.`data`.viewmodel.HomepageVM
import com.fikrisapplication.app.modules.search.ui.SearchActivity
import com.fikrisapplication.app.modules.viewmasakan.ui.ViewmasakanActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomepageActivity : BaseActivity<ActivityHomepageBinding>(R.layout.activity_homepage) {
  private val viewModel: HomepageVM by viewModels<HomepageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val homepageAdapter = HomepageAdapter(viewModel.homepageList.value?:mutableListOf())
    binding.recyclerHomepage.adapter = homepageAdapter
    homepageAdapter.setOnItemClickListener(
    object : HomepageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomepageRowModel) {
        onClickRecyclerHomepage(view, position, item)
      }
    }
    )
    viewModel.homepageList.observe(this) {
      homepageAdapter.updateData(it)
    }
    binding.homepageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSendPlusFill.setOnClickListener {
      val destIntent = AddResepActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageVectorFive.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etGroupFortyTwo.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerHomepage(
    view: View,
    position: Int,
    item: HomepageRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowasinanjakarta -> {
        onClickRecyclerHomepageLinearRowasinanjakarta(view, position, item)
      }
    }
  }

  fun onClickRecyclerHomepageLinearRowasinanjakarta(
    view: View,
    position: Int,
    item: HomepageRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = ViewmasakanActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = ViewmasakanActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "HOMEPAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomepageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
