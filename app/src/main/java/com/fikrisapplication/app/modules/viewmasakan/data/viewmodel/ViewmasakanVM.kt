package com.fikrisapplication.app.modules.viewmasakan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fikrisapplication.app.modules.viewmasakan.`data`.model.ViewmasakanModel
import org.koin.core.KoinComponent

class ViewmasakanVM : ViewModel(), KoinComponent {
  val viewmasakanModel: MutableLiveData<ViewmasakanModel> = MutableLiveData(ViewmasakanModel())

  var navArguments: Bundle? = null
}
