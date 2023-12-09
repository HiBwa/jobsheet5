package com.fikrisapplication.app.modules.homepage.`data`.model

import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFIkriRamadhani: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_fikri_ramadhani)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_mau_masak_apa_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_menu_hari_ini)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKategori: String? = MyApp.getInstance().resources.getString(R.string.lbl_kategori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRekomendasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_rekomendasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFortyTwoValue: String? = null
)
