# Android-GoogleMapExample
<b>
SETUP
</b>

1) Create a project on Google APIs Console. Use your packet project and SHA-1 to get API_KEY
2) Register API_KEY in file mainfest

<p>< meta-data
  <p>android:name="com.google.android.geo.API_KEY"
  <p>android:value="@string/google_maps_key" />
  
and add some permission to connect :

<p>< uses-permission android:name="android.permission.INTERNET"/>
<p>< uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
<p>< uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
  
 3) In file Gradle you will neel Google-Play-Services for map : 
 
<p>compile 'com.google.android.gms:play-services-maps:9.8.0'

