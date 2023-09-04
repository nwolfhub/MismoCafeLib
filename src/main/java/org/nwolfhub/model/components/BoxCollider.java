package org.nwolfhub.model.components;

import org.nwolfhub.util.Vector3;

import java.io.Serializable;

public class BoxCollider extends Component implements Serializable {
    public Vector3 size;
    public Vector3 center;
    public boolean isTrigger;
    public BoxCollider() {
        super();
        this.type = "boxcollider";
    }

    public Vector3 getSize() {
        return size;
    }

    public BoxCollider setSize(Vector3 size) {
        this.size = size;
        return this;
    }

    public Vector3 getCenter() {
        return center;
    }

    public BoxCollider setCenter(Vector3 center) {
        this.center = center;
        return this;
    }

    public boolean isTrigger() {
        return isTrigger;
    }

    public BoxCollider setTrigger(boolean trigger) {
        isTrigger = trigger;
        return this;
    }

    @Override
    public String buildComponent() {
        addToMeta("x", size.getX().toString());
        addToMeta("y", size.getY().toString());
        addToMeta("z", size.getZ().toString());
        addToMeta("centerX", center.getX().toString());
        addToMeta("centerY", center.getY().toString());
        addToMeta("centerZ", center.getZ().toString());
        addToMeta("isTrigger", String.valueOf(isTrigger));
        return super.buildComponent();
    }
}
