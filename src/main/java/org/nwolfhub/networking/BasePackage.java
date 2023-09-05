package org.nwolfhub.networking;

import java.io.Serializable;

public class BasePackage implements Serializable {
    public Object content;

    public String meta;

    public Object getContent() {
        return content;
    }

    public BasePackage setContent(Object content) {
        this.content = content;
        return this;
    }

    public String getMeta() {
        return meta;
    }

    public BasePackage setMeta(String meta) {
        this.meta = meta;
        return this;
    }

    public BasePackage() {}
}
