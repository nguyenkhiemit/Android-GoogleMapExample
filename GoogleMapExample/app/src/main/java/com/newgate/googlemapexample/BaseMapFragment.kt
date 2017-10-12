package com.newgate.googlemapexample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng

/**
 * Created by khiemnd on 10/12/17.
 */
abstract class BaseMapFragment: Fragment(), OnMapReadyCallback, GoogleMap.OnCameraIdleListener {

    private var googleMap: GoogleMap? = null

    private var zoom: Float? = 0.0f

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val mapFragment = childFragmentManager
                .findFragmentById(R.id.map) as? SupportMapFragment
        mapFragment?.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap?) {
        googleMap = map
        googleMap?.setOnCameraIdleListener(this)
    }

    fun setZoom(zoom: Float) {
        this.zoom = zoom
    }

    fun moveCameraToLocation(location: LatLng, animate: Boolean, zoomEnable: Boolean) {
        var builder = CameraPosition.Builder()
                .target(location)
                .bearing(0.0f)
                .tilt(0.0f)
        if(zoomEnable) {
            builder.zoom(this.zoom!!)
        }
        var cameraPosition = builder.build()
        if(animate) {
            googleMap?.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))
        } else {
            googleMap?.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))
        }
    }
}