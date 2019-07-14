package com.stevandoh

import android.content.Context
import android.net.ConnectivityManager


fun Context.isOnline(): Boolean {
    val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
    val netInfo = cm!!.activeNetworkInfo
    return netInfo != null && netInfo.isConnectedOrConnecting
}