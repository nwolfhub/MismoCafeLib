package org.nwolfhub.model.objects;

import org.nwolfhub.model.Player;
import org.nwolfhub.model.components.Component;
import org.nwolfhub.util.Quaternion;
import org.nwolfhub.util.Vector3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class BaseObject implements Serializable {
    public String name;
    public String type;
    public Vector3 position;
    public Quaternion rotation;
    public Player owner;
    public List<Component> components;
    HashMap<String, String> meta;

    public BaseObject() {
        components = new ArrayList<>();
        meta = new HashMap<>();
    }

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

    public List<Component> getComponents() {
        return components;
    }

    public BaseObject setComponents(List<Component> components) {
        this.components = components;
        return this;
    }

    public String getType() {
        return type;
    }

    public BaseObject setType(String type) {
        this.type = type;
        return this;
    }

    public HashMap<String, String> getMeta() {
        return meta;
    }

    public String buildObject() {
        return toString();
    }

    public String toString() {
        return "{\"object\": {\"name\": \"" + name + "\", \"type\": " + type + ", \"position\": " + position.toString() + ", \"rotation\": " + rotation.toString() + ", \"owner\": " + owner.toString() + ", \"components\": [" + getComponents().stream().map(Component::toString).collect(Collectors.joining(", ")) + "], " + buildMeta() + "}}";
    }

    private String buildMeta() {
        return "\"meta\": { " + meta.entrySet().stream().map(entry -> "\"" + entry.getKey() + "\": \"" + entry.getValue() + "\"").collect(Collectors.joining(", ")) + "}";
    }

    void addToMeta(String key, String value) {
        meta.put(key, value);
    }
}
