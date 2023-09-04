package org.nwolfhub.model.components;

import java.io.Serializable;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Component implements Serializable {
    public String name;
    public String type;
    HashMap<String, String> meta;

    public Component(String name, String type) {
        this.name = name;
        this.type = type;
        meta = new HashMap<>();
    }

    public Component() {
        meta = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Component setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public Component setType(String type) {
        this.type = type;
        return this;
    }

    public HashMap<String, String> getMeta() {
        return meta;
    }
    void addToMeta(String key, String value) {
        meta.put(key, value);
    }
    private String buildMeta() {
        return "\"meta\": { " + meta.entrySet().stream().map(entry -> "\"" + entry.getKey() + "\": \"" + entry.getValue() + "\"").collect(Collectors.joining(", ")) + "}";
    }

    public String toString() {
        return "{\"component\": {\"name\":\"" + name + "\",\"type\":\"" + type + "\", " + buildMeta() + "}}";
    }

    public String buildComponent() {
        return toString();
    }
}
