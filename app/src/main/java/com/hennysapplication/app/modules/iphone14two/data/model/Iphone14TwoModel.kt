package com.hennysapplication.app.modules.iphone14two.`data`.model

import com.hennysapplication.app.R
import com.hennysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14TwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHiAyoBuatJu: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_ayo_buat_ju)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJusJeruk: String? = MyApp.getInstance().resources.getString(R.string.lbl_jus_jeruk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jus_jeruk_denga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJusAnggur: String? = MyApp.getInstance().resources.getString(R.string.lbl_jus_anggur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kandungan_polif)

)
