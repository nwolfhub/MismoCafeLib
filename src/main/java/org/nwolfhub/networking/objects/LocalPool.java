package org.nwolfhub.networking.objects;

import org.nwolfhub.model.objects.BaseObject;

import java.util.HashMap;

public class LocalPool {
    final HashMap<String, BaseObject> objects = new HashMap<>();
    final HashMap<String, BaseObject> evilClone = new HashMap<>();

    public BaseObject get(String key) {
        return objects.get(key);
    }

    public void put(BaseObject value) {
        objects.put(value.getName(), value);
    }

    public void detroy(String key) {
        objects.remove(key);
    }

    public LocalPool() {}
}
