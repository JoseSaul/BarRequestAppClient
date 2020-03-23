package Connection;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ConnectionServer extends AsyncTask<Package,Void,Void> {

    private String ipServer = "192.168.0.11";   //Cambiar antes de usar
    private Package[] packag;
    private Socket connection;

    @Override
    protected Void doInBackground(Package... packages) {
        try {
            packag = packages;

            connection = new Socket(ipServer,9090);
            ObjectOutputStream oos = new ObjectOutputStream(connection.getOutputStream());
            oos.writeObject(packag[0]);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
