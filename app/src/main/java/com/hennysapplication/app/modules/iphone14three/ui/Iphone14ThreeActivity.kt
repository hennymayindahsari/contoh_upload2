package com.hennysapplication.app.modules.iphone14three.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.hennysapplication.app.R
import com.hennysapplication.app.appcomponents.base.BaseActivity
import com.hennysapplication.app.databinding.ActivityIphone14ThreeBinding
import com.hennysapplication.app.modules.iphone14three.`data`.viewmodel.Iphone14ThreeVM
import kotlin.String
import kotlin.Unit

class Iphone14ThreeActivity :
    BaseActivity<ActivityIphone14ThreeBinding>(R.layout.activity_iphone_14_three) {
  private val viewModel: Iphone14ThreeVM by viewModels<Iphone14ThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14ThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
