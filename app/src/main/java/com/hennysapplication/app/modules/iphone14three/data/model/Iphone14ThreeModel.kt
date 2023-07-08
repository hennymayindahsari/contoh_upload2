package com.hennysapplication.app.modules.iphone14three.`data`.model

import com.hennysapplication.app.R
import com.hennysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14ThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBuatJusmuDisi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_buat_jusmu_disi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_pilih_buah_atau)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupNineteen: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTambahkanPeman: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tambahkan_peman)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUkuransendokt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ukuran_sendok_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTambahkanCatat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tambahkan_catat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0100: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_100)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJumlahKalori: String? = MyApp.getInstance().resources.getString(R.string.lbl_jumlah_kalori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKcalCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_165_kcal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHargaTotalR: String? = MyApp.getInstance().resources.getString(R.string.msg_harga_total_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyTwoValue: String? = null
)
