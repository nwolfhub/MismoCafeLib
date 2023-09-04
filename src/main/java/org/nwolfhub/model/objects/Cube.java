package org.nwolfhub.model.objects;

import org.nwolfhub.util.Vector3;

import java.io.Serializable;

public class Cube extends BaseObject implements Serializable {
    public Vector3 size;
    public Cube() {
        super();
        this.type = "cube";
    }

    @Override
    public String buildObject() {
        addToMeta("x", String.valueOf(size.x));
        addToMeta("y", String.valueOf(size.y));
        addToMeta("z", String.valueOf(size.z));
        return super.buildObject();
    }

    public Vector3 getSize() {
        return size;
    }

    public Cube setSize(Vector3 size) {
        this.size = size;
        return this;
    }
}
