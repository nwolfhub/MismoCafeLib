package org.nwolfhub.util;

import java.io.Serializable;

public class Vector3 implements Serializable {
    public Float x;
    public Float y;
    public Float z;

    public Vector3() {}

    public Vector3(Float x, Float y, Float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3(Vector3 vector) {
        this.x = vector.getX();
        this.y = vector.getY();
        this.z = vector.getZ();
    }

    public Float getX() {
        return x;
    }

    public Vector3 setX(Float x) {
        this.x = x;
        return this;
    }

    public Float getY() {
        return y;
    }

    public Vector3 setY(Float y) {
        this.y = y;
        return this;
    }

    public Float getZ() {
        return z;
    }

    public Vector3 setZ(Float z) {
        this.z = z;
        return this;
    }

    public Vector3 add(Vector3 vector) {
        this.x = x + vector.getX();
        this.y = y + vector.getY();
        this.z = z + vector.getZ();
        return this;
    }
    public Vector3 add(Float x, Float y, Float z) {
        this.x = this.x + x;
        this.y = this.y + y;
        this.z = this.z + z;
        return this;
    }

    public Vector3 subtract(Vector3 vector) {
        this.x = x - vector.getX();
        this.y = y - vector.getY();
        this.z = z - vector.getZ();
        return this;
    }

    public Vector3 subtract(Float x, Float y, Float z) {
        this.x = this.x - x;
        this.y = this.y - y;
        this.z = this.z - z;
        return this;
    }

    public Vector3 multiply(Vector3 vector) {
        this.x = x * vector.getX();
        this.y = y * vector.getY();
        this.z = z * vector.getZ();
        return this;
    }

    public Vector3 multiply(Float x, Float y, Float z) {
        this.x = this.x * x;
        this.y = this.y * y;
        this.z = this.z * z;
        return this;
    }

    public Vector3 divide(Vector3 vector) {
        this.x = x / vector.getX();
        this.y = y / vector.getY();
        this.z = z / vector.getZ();
        return this;
    }

    public Vector3 divide(Float x, Float y, Float z) {
        this.x = this.x / x;
        this.y = this.y / y;
        this.z = this.z / z;
        return this;
    }

    public Vector3 findDistance(Vector3 vector) {
        return new Vector3(Math.abs(x - vector.getX()), Math.abs(y - vector.getY()), Math.abs(z - vector.getZ()));
    }

    public Vector3 findDistance(Float x, Float y, Float z) {
        return new Vector3(Math.abs(this.x - x), Math.abs(this.y - y), Math.abs(this.z - z));
    }

    public Float findFlatDistance(Vector3 vector) {
        return Float.valueOf(String.valueOf(Math.pow((vector.getX() - x),2) + Math.pow((vector.getY() - y), 2) + Math.pow((vector.getZ() - z), 2)));
    }
    
    public Float findFlatDistance(Float x, Float y, Float z) {
        return Float.valueOf(String.valueOf((Math.pow((this.x - x),2) + Math.pow((this.y - y), 2) + Math.pow((this.z - z), 2))));
    }
    
    public String toString() {
        return "{\"vec3\": {\"x\": " + getX() + ", \"y\": " + getY() + ", \"z\": " + getZ() + "}}";
    }
}
