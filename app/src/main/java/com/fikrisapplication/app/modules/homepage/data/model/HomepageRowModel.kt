package com.fikrisapplication.app.modules.homepage.`data`.model

import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAndikaBudi: String? = MyApp.getInstance().resources.getString(R.string.lbl_andika_budi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAsinanJakarta: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_asinan_jakarta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenitCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_40_menit)

)
