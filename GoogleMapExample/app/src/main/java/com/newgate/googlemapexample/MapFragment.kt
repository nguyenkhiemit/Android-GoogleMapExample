package com.newgate.googlemapexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.model.LatLng

/**
 * Created by khiemnd on 10/12/17.
 */
class MapFragment: BaseMapFragment() {

    val defaultLat = 21.029468
    val defaultLng = 105.834818

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater?.inflate(R.layout.fragment_map, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onMapReady() {
        setZoom(17.0f)
        addDefaultMarker(defaultLat, defaultLng)
        moveCameraToLocation(LatLng(defaultLat, defaultLng), true, true)
    }

    override fun onCameraIdle() {

    }
}