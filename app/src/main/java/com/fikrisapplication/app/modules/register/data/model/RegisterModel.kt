package com.fikrisapplication.app.modules.register.`data`.model

import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDaftar: String? = MyApp.getInstance().resources.getString(R.string.lbl_daftar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSudahPunyaAku: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sudah_punya_aku)

)
