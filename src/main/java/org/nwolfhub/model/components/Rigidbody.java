package org.nwolfhub.model.components;

import java.io.Serializable;

public class Rigidbody extends Component implements Serializable {
    public Float mass;
    public Float drag;
    public Boolean isKinematic;
    public Boolean useGravity;
    public Rigidbody() {
        super();
        this.type = "rigidbody";
    }

    public Float getMass() {
        return mass;
    }

    public Rigidbody setMass(Float mass) {
        this.mass = mass;
        return this;
    }

    public Float getDrag() {
        return drag;
    }

    public Rigidbody setDrag(Float drag) {
        this.drag = drag;
        return this;
    }

    public Boolean getKinematic() {
        return isKinematic;
    }

    public Rigidbody setKinematic(Boolean kinematic) {
        isKinematic = kinematic;
        return this;
    }

    public Boolean getUseGravity() {
        return useGravity;
    }

    public Rigidbody setUseGravity(Boolean useGravity) {
        this.useGravity = useGravity;
        return this;
    }

    @Override
    public String buildComponent() {
        addToMeta("mass", mass.toString());
        addToMeta("drag", drag.toString());
        addToMeta("isKinematic", isKinematic.toString());
        addToMeta("useGravity", useGravity.toString());
        return super.buildComponent();
    }
}
