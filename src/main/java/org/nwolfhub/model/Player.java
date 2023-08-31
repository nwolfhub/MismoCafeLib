package org.nwolfhub.model;

import org.nwolfhub.util.Quaternion;
import org.nwolfhub.util.Vector3;

import java.io.Serializable;

public class Player implements Serializable {
    public String username;
    public Vector3 position;
    public Quaternion rotation;

    public Player(String username, Vector3 position, Quaternion rotation) {
        this.username = username;
        this.position = position;
        this.rotation = rotation;
    }

    public Player() {}

    public String getUsername() {
        return username;
    }

    public Player setUsername(String username) {
        this.username = username;
        return this;
    }

    public Vector3 getPosition() {
        return position;
    }

    public Player setPosition(Vector3 position) {
        this.position = position;
        return this;
    }

    public Quaternion getRotation() {
        return rotation;
    }

    public Player setRotation(Quaternion rotation) {
        this.rotation = rotation;
        return this;
    }

    public String toString() {
        return "{\"player\": {\"position\": " + getPosition().toString() + ", \"rotation\": " + getRotation().toString() + ", \"username\": \"" + getUsername() + "\"}}";
    }
}
