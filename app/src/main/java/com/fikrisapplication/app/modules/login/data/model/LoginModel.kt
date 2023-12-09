package com.fikrisapplication.app.modules.login.`data`.model

import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBelumPunyaAku: String? =
      MyApp.getInstance().resources.getString(R.string.msg_belum_punya_aku)

)
