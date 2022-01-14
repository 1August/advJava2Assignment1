package com.company.genericTypes;

import com.company.interfaces.IMovable;

public class Habitat<T> implements IMovable {
    private int size;

    @Override
    public int getComfortableSpace() {
        return 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
