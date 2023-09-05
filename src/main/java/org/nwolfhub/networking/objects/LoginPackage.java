package org.nwolfhub.networking.objects;

import org.nwolfhub.model.Player;
import org.nwolfhub.networking.BasePackage;

import java.io.Serializable;

public class LoginPackage extends BasePackage implements Serializable {
    public String token;
    public Player player;

    public LoginPackage(String token) {
        super();
        this.token = new String(token);
        this.meta = "login";
    }

    public String getToken() {
        return token;
    }

    public LoginPackage setToken(String token) {
        this.token = token;
        return this;
    }

    public Player getPlayer() {
        return player;
    }

    public LoginPackage setPlayer(Player player) {
        this.player = player;
        return this;
    }
}
