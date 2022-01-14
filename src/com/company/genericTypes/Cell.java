package com.company.genericTypes;

import com.company.interfaces.IFlyable;

public class Cell<T extends Habitat> implements IFlyable {
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
