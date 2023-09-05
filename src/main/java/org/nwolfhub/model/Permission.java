package org.nwolfhub.model;

import java.io.Serializable;

public class Permission implements Serializable {
    public String name;
    public String meta;

    public String getName() {
        return name;
    }

    public Permission setName(String name) {
        this.name = name;
        return this;
    }

    public String getMeta() {
        return meta;
    }

    public Permission setMeta(String meta) {
        this.meta = meta;
        return this;
    }

    public Permission() {
    }
}
