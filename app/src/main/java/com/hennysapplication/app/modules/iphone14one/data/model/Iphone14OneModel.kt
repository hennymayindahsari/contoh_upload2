package com.hennysapplication.app.modules.iphone14one.`data`.model

import com.hennysapplication.app.R
import com.hennysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14OneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMembuatJus: String? = MyApp.getInstance().resources.getString(R.string.lbl_membuat_jus)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_jadikan_hari)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHiImMyXa: String? = MyApp.getInstance().resources.getString(R.string.lbl_hi_i_m_myxa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt08222990310: String? = MyApp.getInstance().resources.getString(R.string.lbl_08222990310)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMarimulaimemb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mari_mulai_memb)

)
