package com.example.mini;

import static android.Manifest.permission.CALL_PHONE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;


import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class accident extends AppCompatActivity {
    Button btnsubmit1, btncall2;
    EditText uname, number;
    String txt = "9986175978";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
        btnsubmit1 = findViewById(R.id.btnsubmit);
        uname = findViewById(R.id.firename);
        number = findViewById(R.id.fireno);
        btncall2 = findViewById(R.id.btncall);

        btnsubmit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = uname.getText().toString();
                String phoneno = number.getText().toString();

                if (username.length() <= 0 && phoneno.length() <= 0) {
                    Toast.makeText(accident.this, "Username or Number cannot be empty", Toast.LENGTH_SHORT).show();
                } else if (phoneno.length() < 10) {
                    Toast.makeText(accident.this, "Enter number of 10 digits only", Toast.LENGTH_SHORT).show();
                } else {

                    Location location = getCurrentLocation();

                    if (location != null) {
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();

                        String msg = "EMERGENCY:\nName: " + username + "\nNumber: " + phoneno + "\nLocation: Latitude=" + latitude + ", Longitude=" + longitude;



                        Uri uri = Uri.parse("smsto:" + "9986175978");

                        Intent smsSIntent = new Intent(Intent.ACTION_SENDTO, uri);

                        smsSIntent.putExtra("sms_body", msg);
                        try {
                            startActivity(smsSIntent);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }

                        Intent smsVIntent = new Intent(Intent.ACTION_VIEW);

                        smsVIntent.setType("vnd.android-dir/mms-sms");


                        smsVIntent.putExtra("address", "9986175978");
                        smsVIntent.putExtra("sms_body", msg);
                        try {
                            startActivity(smsVIntent);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    } else {
                        Toast.makeText(accident.this, "Unable to retrieve location", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btncall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MakeCall();
            }
        });
    }

    private void MakeCall() {
        try {
            if (txt.length() > 0) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + txt));
                if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(intent);
                } else {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        requestPermissions(new String[]{CALL_PHONE}, 1);
                    }
                }
            }
        } catch (Exception e) {
            Toast.makeText(this, "exception" + e, Toast.LENGTH_SHORT).show();
        }
    }

    // Method to retrieve the current location
    private Location getCurrentLocation() {
        try {
            LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
            LocationListener locationListener = new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {

                }

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {
                }

                @Override
                public void onProviderEnabled(String provider) {
                }

                @Override
                public void onProviderDisabled(String provider) {
                }
            };


            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);


            Location lastKnownLocationGPS = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            Location lastKnownLocationNetwork = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);


            if (lastKnownLocationGPS != null && lastKnownLocationNetwork != null) {
                return lastKnownLocationGPS.getTime() > lastKnownLocationNetwork.getTime()
                        ? lastKnownLocationGPS
                        : lastKnownLocationNetwork;
            } else if (lastKnownLocationGPS != null) {
                return lastKnownLocationGPS;
            } else if (lastKnownLocationNetwork != null) {
                return lastKnownLocationNetwork;
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }

        return null;
    }

}
