package com.example.myservice;

import android.Manifest;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

public class MyService extends Service {

    private  DownloadBinder mBinder=new DownloadBinder();
    class DownloadBinder extends Binder{
        public void startDownload(){
            Log.d("Myservice", "startDownload: executed");
        }

        public int getProgress(){
            Log.d("Myservice", "getProgress: executed");
            return 0;
        }
    }




    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return mBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Myservice", "onCreate: executed");
        Intent intent =new Intent(this, MainActivity.class);
        PendingIntent pi =PendingIntent.getActivity(this,0,intent,0);
        Notification notification=new NotificationCompat.Builder(this)
                .setContentTitle("This is content title")
                .setContentText("This is content text")
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.mipmap.ic_launcher)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
                .setContentIntent(pi)
                .build();
        startForeground(1,notification);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("Myservice", "onStartCommand: executed ");
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Myservice", "onDestroy: executed ");
    }


}
