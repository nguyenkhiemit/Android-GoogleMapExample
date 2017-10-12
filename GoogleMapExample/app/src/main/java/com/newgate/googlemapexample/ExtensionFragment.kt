package com.newgate.googlemapexample

import android.support.v4.app.Fragment

/**
 * Created by khiemnd on 10/12/17.
 */

fun Fragment.open(activity: MainActivity) {
    var transaction = activity.supportFragmentManager.beginTransaction()
    transaction.replace(R.id.container, this)
    transaction.addToBackStack(null)
    transaction.commit()
}