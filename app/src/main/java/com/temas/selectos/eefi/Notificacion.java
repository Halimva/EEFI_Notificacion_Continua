package com.temas.selectos.eefi;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.net.Uri;
import android.os.Build;

public class Notificacion extends Application {
    public static final String CANAL_ID = "canalServicio";

    @Override
    public void onCreate() {
        super.onCreate();

        crearCanalNotificacion();
    }

    private void crearCanalNotificacion(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel canalServicio = new NotificationChannel(CANAL_ID, "Canal de Servicio", NotificationManager.IMPORTANCE_DEFAULT);

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(canalServicio);
        }
    }
}
