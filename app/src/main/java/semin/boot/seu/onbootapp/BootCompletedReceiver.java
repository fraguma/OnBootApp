package semin.boot.seu.onbootapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompletedReceiver extends BroadcastReceiver {

    /*
     * Escucha el broadcast BOOT_COMPLETED. Su llegada dispara el método onReceive().
* Este método lanza el servicio StarterService y termina.
     */
    @Override
    public void onReceive(Context context, Intent arg1) {
        Intent intent = new Intent(context, StarterService.class);
        context.startService(intent);
    }
}