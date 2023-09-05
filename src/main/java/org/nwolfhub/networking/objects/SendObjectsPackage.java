package org.nwolfhub.networking.objects;

import org.nwolfhub.model.objects.BaseObject;
import org.nwolfhub.networking.BasePackage;

import java.io.Serializable;
import java.util.List;

public class SendObjectsPackage extends BasePackage implements Serializable {
    public List<BaseObject> objects;

    public SendObjectsPackage(List<BaseObject> objects) {
        super();
        this.meta = "sendObjects";
        this.objects = objects;
    }
}
