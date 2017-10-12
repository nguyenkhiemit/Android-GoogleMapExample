package com.newgate.googlemapexample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.model.LatLng

/**
 * Created by khiemnd on 10/12/17.
 */
class MapFragment: BaseMapFragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater?.inflate(R.layout.fragment_map, container, false)
        return view
    }

    override fun onCameraIdle() {
        setZoom(17.0f)
        moveCameraToLocation(LatLng(21.029468, 105.834818), true, true)
    }
}