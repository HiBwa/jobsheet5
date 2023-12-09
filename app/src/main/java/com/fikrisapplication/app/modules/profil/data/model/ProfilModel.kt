package com.fikrisapplication.app.modules.profil.`data`.model

import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfilModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFikriRamadhani: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_fikri_ramadhani2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHobiMasak: String? = MyApp.getInstance().resources.getString(R.string.lbl_hobi_masak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZero: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPost: String? = MyApp.getInstance().resources.getString(R.string.lbl_post)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZeroOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_view)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPostOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_post)

)
