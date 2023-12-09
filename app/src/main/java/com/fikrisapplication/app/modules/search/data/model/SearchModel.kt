package com.fikrisapplication.app.modules.search.`data`.model

import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCariMenuhari: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cari_menu_hari)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPencarianPopul: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pencarian_popul)

)
