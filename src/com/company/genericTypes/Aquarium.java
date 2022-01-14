package com.company.genericTypes;

import com.company.interfaces.ISwimable;

public class Aquarium<T extends Habitat> implements ISwimable {
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
