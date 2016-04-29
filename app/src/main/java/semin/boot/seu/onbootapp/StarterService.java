package semin.boot.seu.onbootapp;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class StarterService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* Ahora el servicio StarterService abre la actividad principal de la aplicación */

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Intent intents = new Intent(getBaseContext(), MainActivity.class);
        intents.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intents);
        Toast.makeText(this, "Aplicación OnBootApp iniciada", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }
}