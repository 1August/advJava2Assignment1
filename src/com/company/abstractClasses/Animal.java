package com.company.abstractClasses;

import com.company.interfaces.IWalkable;

public abstract class Animal implements IWalkable {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                '}';
    }
}
