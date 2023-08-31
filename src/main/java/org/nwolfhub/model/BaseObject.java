package org.nwolfhub.model;

import org.nwolfhub.util.Quaternion;
import org.nwolfhub.util.Vector3;

public class BaseObject {
    public String name;
    public Vector3 position;
    public Quaternion rotation;
    public Player owner;
    public BaseObject() {}

    public String getName() {
        return name;
    }

    public BaseObject setName(String name) {
        this.name = name;
        return this;
    }

    public Vector3 getPosition() {
        return position;
    }

    public BaseObject setPosition(Vector3 position) {
        this.position = position;
        return this;
    }

    public Quaternion getRotation() {
        return rotation;
    }

    public BaseObject setRotation(Quaternion rotation) {
        this.rotation = rotation;
        return this;
    }

    public Player getOwner() {
        return owner;
    }

    public BaseObject setOwner(Player owner) {
        this.owner = owner;
        return this;
    }
}
