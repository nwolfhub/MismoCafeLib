package org.nwolfhub.networking.objects;

import org.nwolfhub.model.Player;
import org.nwolfhub.model.objects.BaseObject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;

public class RemotePool {
    final HashMap<String, BaseObject> objects = new HashMap<>();
    private final Socket socket;
    private final ObjectOutputStream outputStream;
    private final ObjectInputStream inputStream;
    private final String token;
    public final Player me;
    public RemotePool(Socket socket, String token) throws IOException, ClassNotFoundException {
        this.token = token;
        this.socket = socket;
        this.outputStream = new ObjectOutputStream(this.socket.getOutputStream());
        this.inputStream = new ObjectInputStream(this.socket.getInputStream());
        outputStream.writeObject(new LoginPackage(token));
        outputStream.flush();
        LoginPackage loginPackage = (LoginPackage) inputStream.readObject();
        if(loginPackage.player == null) {
            throw new IOException("Invalid token");
        } else {
            me = loginPackage.player;
        }
    }

    void pushLocalPool(List<BaseObject> updatedObjects) throws IOException {
        outputStream.writeObject(new SendObjectsPackage(updatedObjects));
        outputStream.flush();
    }

}
