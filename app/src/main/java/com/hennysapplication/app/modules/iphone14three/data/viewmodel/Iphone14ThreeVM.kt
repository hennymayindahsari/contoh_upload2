package com.hennysapplication.app.modules.iphone14three.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hennysapplication.app.modules.iphone14three.`data`.model.Iphone14ThreeModel
import org.koin.core.KoinComponent

class Iphone14ThreeVM : ViewModel(), KoinComponent {
  val iphone14ThreeModel: MutableLiveData<Iphone14ThreeModel> =
      MutableLiveData(Iphone14ThreeModel())

  var navArguments: Bundle? = null
}
