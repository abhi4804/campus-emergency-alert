package com.example.mini;

import static android.Manifest.permission.CALL_PHONE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class equipmentdamage extends AppCompatActivity {
    Button btnsubmite,btncalle;
    EditText unamee,numbere,reasone;
    String txt="9986175978";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipmentdamage);
        btnsubmite=(Button)findViewById(R.id.be1);
        unamee=(EditText)findViewById(R.id.equname);
        numbere=(EditText)findViewById(R.id.equno);
        reasone=(EditText)findViewById(R.id.equreason);
        btncalle=(Button)findViewById(R.id.btncalle);
        btnsubmite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = unamee.getText().toString();
                String phoneno = numbere.getText().toString();
                String reasons = reasone.getText().toString();
                if(username.length() <= 0 && phoneno.length() <= 0 ) {
                    Toast.makeText(equipmentdamage.this, "No field can be empty", Toast.LENGTH_SHORT).show();
                }
                else if(reasons.length()<=0){
                    Toast.makeText(equipmentdamage.this, "No field can be left empty", Toast.LENGTH_SHORT).show();
                }
                else if(phoneno.length() < 10){
                    Toast.makeText(equipmentdamage.this, "Enter number of 10 digits only", Toast.LENGTH_SHORT).show();
                }
                else {
                    String msg = "EMERGENCY:\n Name:" + username + "\nNumber:" + phoneno +"\nEquipment name:"+reasons;
                    try {

                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        PendingIntent pi = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);

                        //Get the SmsManager instance and call the sendTextMessage method to send message
                        SmsManager sms = SmsManager.getDefault();
                        sms.sendTextMessage("9986175978", null, "hey", pi, null);
                        Toast.makeText(getApplicationContext(), "Message Sent successfully!",
                                Toast.LENGTH_LONG).show();
                    }
                    catch(Exception ex){}
                    Uri uri = Uri.parse("smsto:" + "9986175978");

                    Intent smsSIntent = new Intent(Intent.ACTION_SENDTO, uri);
                    // add the message at the sms_body extra field
                    smsSIntent.putExtra("sms_body", msg);
                    try{
                        startActivity(smsSIntent);
                    } catch (Exception ex) {}
                    Intent smsVIntent = new Intent(Intent.ACTION_VIEW);
                    // prompts only sms-mms clients
                    smsVIntent.setType("vnd.android-dir/mms-sms");

                    // extra fields for number and message respectively
                    smsVIntent.putExtra("address", "9986175978");
                    smsVIntent.putExtra("sms_body", msg);
                    try{
                        startActivity(smsVIntent);
                    } catch (Exception ex) {}
                }
            }
        });
        btncalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MakeCall();
            }
        });
    }
    private void MakeCall(){
        try{
            if(txt.length()>0){
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+txt));
                if(ContextCompat.checkSelfPermission(getApplicationContext(),CALL_PHONE)== PackageManager.PERMISSION_GRANTED){
                    startActivity(intent);
                }
                else {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        requestPermissions(new String[]{CALL_PHONE}, 1);
                    }
                }
            }
        }
        catch(Exception e){
            Toast.makeText(this, "exception"+e, Toast.LENGTH_SHORT).show();
        }
    }
    }
