package com.fikrisapplication.app.modules.addresep.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fikrisapplication.app.modules.addresep.`data`.model.AddResepModel
import org.koin.core.KoinComponent

class AddResepVM : ViewModel(), KoinComponent {
  val addResepModel: MutableLiveData<AddResepModel> = MutableLiveData(AddResepModel())

  var navArguments: Bundle? = null
}
