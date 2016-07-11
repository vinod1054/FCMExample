package com.androidnode.fcmexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseMessaging.getInstance().subscribeToTopic("news");
        Log.d(TAG, "Subscribed to news topic");
        Log.d(TAG, "InstanceID token: " + FirebaseInstanceId.getInstance().getToken());
        Button mReceiveFcm =(Button)findViewById(R.id.receive_fcm);
        mReceiveFcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestFcm("Hello World!","Hello FCM!");
            }
        });
    }

    private void requestFcm(String title, String message){

    }
}
