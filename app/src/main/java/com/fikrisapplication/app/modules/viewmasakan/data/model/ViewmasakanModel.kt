package com.fikrisapplication.app.modules.viewmasakan.`data`.model

import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ViewmasakanModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSixtyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_simpan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFotoResep: String? = MyApp.getInstance().resources.getString(R.string.lbl_foto_resep)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCeritadibalik: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cerita_dibalik2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLangkahLangkah: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_langkah_langkah)

)
