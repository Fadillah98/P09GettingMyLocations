package com.myapplicationdev.android.p09gettingmylocations;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

    boolean started;

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        Toast.makeText(MyService.this, "Service created", Toast.LENGTH_SHORT).show();
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (started == false){
            started = true;
            Toast.makeText(MyService.this, "Service started", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MyService.this, "Service is still running", Toast.LENGTH_SHORT).show();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(MyService.this, "Service exited", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

}
