# Android-GoogleMapExample
<b>
SETUP
</b>

1) Create a project on Google APIs Console. Use your packet project and SHA-1 to get API_KEY
2) Register API_KEY in file mainfest

<meta-data
  android:name="com.google.android.geo.API_KEY"
  android:value="@string/google_maps_key" />
 
and add some permission to connect :

<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
  
 3) In file Gradle you will neel Google-Play-Services for map : 
 
 compile 'com.google.android.gms:play-services-maps:9.8.0'

