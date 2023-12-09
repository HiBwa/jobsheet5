package com.fikrisapplication.app.modules.addresep.`data`.model

import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddResepModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBuatResep: String? = MyApp.getInstance().resources.getString(R.string.lbl_buat_resep)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadImage: String? = MyApp.getInstance().resources.getString(R.string.lbl_upload_image)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCeritadibalik: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cerita_dibalik)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBahanBahan: String? = MyApp.getInstance().resources.getString(R.string.lbl_bahan_bahan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLangkahLangkah: String? =
      MyApp.getInstance().resources.getString(R.string.msg_langkah_langkah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageValue: String? = null
)
