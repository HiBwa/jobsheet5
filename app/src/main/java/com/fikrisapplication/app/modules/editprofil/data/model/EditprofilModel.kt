package com.fikrisapplication.app.modules.editprofil.`data`.model

import com.fikrisapplication.app.R
import com.fikrisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditprofilModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNama: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFikriRamadhani: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_fikri_ramadhani2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_fikri_email_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBio: String? = MyApp.getInstance().resources.getString(R.string.lbl_bio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHobiMasak: String? = MyApp.getInstance().resources.getString(R.string.lbl_hobi_masak2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFikriRamadhaniOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_fikri_ramadhani2)

)
