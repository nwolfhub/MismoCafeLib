package org.nwolfhub.util;

import java.io.Serializable;

public class Quaternion implements Serializable {
    public float x;
    public float y;
    public float z;

    public Quaternion() {}

    public Quaternion(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public Quaternion setX(float x) {
        this.x = x;
        return this;
    }

    public float getY() {
        return y;
    }

    public Quaternion setY(float y) {
        this.y = y;
        return this;
    }

    public float getZ() {
        return z;
    }

    public Quaternion setZ(float z) {
        this.z = z;
        return this;
    }
    public Quaternion add(Quaternion q) {
        this.x = this.x + q.x;
        this.y = this.y + q.y;
        this.z = this.z + q.z;
        return this;
    }

    public Quaternion add(float x, float y, float z) {
        this.x = this.x + x;
        this.y = this.y + y;
        this.z = this.z + z;
        return this;
    }

    public Quaternion subtract(Quaternion q) {
        this.x = this.x - q.x;
        this.y = this.y - q.y;
        this.z = this.z - q.z;
        return this;
    }

    public Quaternion subtract(float x, float y, float z) {
        this.x = this.x - x;
        this.y = this.y - y;
        this.z = this.z - z;
        return this;
    }

    public Quaternion multiply(Quaternion q) {
        float x = this.x * q.x - this.y * q.y - this.z * q.z;
        float y = this.x * q.y + this.y * q.x + this.z * q.z;
        float z = this.x * q.z - this.y * q.z + this.z * q.x;
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    public Quaternion multiply(float scalar) {
        this.x = this.x * scalar;
        this.y = this.y * scalar;
        this.z = this.z * scalar;
        return this;
    }

    public String toString() {
        return "{\"quat\": {\"x\": " + getX() + ", \"y\": " + getY() + ", \"z\": " + getZ() + "}}";
    }
}
