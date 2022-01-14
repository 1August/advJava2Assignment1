package com.company;

import com.company.interfaces.IMovable;
import com.company.interfaces.IWalkable;

public abstract class Animal implements IMovable, IWalkable {
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
