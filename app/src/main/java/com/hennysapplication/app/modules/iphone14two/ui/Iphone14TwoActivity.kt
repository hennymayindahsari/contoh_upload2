package com.hennysapplication.app.modules.iphone14two.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.hennysapplication.app.R
import com.hennysapplication.app.appcomponents.base.BaseActivity
import com.hennysapplication.app.databinding.ActivityIphone14TwoBinding
import com.hennysapplication.app.modules.iphone14three.ui.Iphone14ThreeActivity
import com.hennysapplication.app.modules.iphone14two.`data`.viewmodel.Iphone14TwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone14TwoActivity :
    BaseActivity<ActivityIphone14TwoBinding>(R.layout.activity_iphone_14_two) {
  private val viewModel: Iphone14TwoVM by viewModels<Iphone14TwoVM>()

  private val REQUEST_CODE_IPHONE14THREE_ACTIVITY: Int = 545

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14TwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAyoBuat.setOnClickListener {
      val destIntent = Iphone14ThreeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_IPHONE14THREE_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14TwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
