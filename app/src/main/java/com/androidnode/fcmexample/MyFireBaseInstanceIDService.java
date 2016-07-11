package com.androidnode.fcmexample;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by konnectez on 11-07-2016.
 */
public class MyFireBaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = "FireBaseInstanceService";

    @Override
    public void onTokenRefresh() {
        Log.i(TAG,"Token Refreshed : "+ FirebaseInstanceId.getInstance().getToken());
    }
}
