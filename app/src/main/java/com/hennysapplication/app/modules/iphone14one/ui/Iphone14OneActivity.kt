package com.hennysapplication.app.modules.iphone14one.ui

import androidx.activity.viewModels
import com.hennysapplication.app.R
import com.hennysapplication.app.appcomponents.base.BaseActivity
import com.hennysapplication.app.databinding.ActivityIphone14OneBinding
import com.hennysapplication.app.modules.iphone14one.`data`.viewmodel.Iphone14OneVM
import com.hennysapplication.app.modules.iphone14two.ui.Iphone14TwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone14OneActivity :
    BaseActivity<ActivityIphone14OneBinding>(R.layout.activity_iphone_14_one) {
  private val viewModel: Iphone14OneVM by viewModels<Iphone14OneVM>()

  private val REQUEST_CODE_IPHONE14TWO_ACTIVITY: Int = 226

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14OneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogin.setOnClickListener {
      val destIntent = Iphone14TwoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_IPHONE14TWO_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14ONE_ACTIVITY"

  }
}
