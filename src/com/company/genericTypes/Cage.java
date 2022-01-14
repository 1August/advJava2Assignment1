package com.company.genericTypes;

import com.company.Animal;
import com.company.abstractClasses.Bird;
import com.company.interfaces.IWalkable;

import java.util.List;

public class Cage<T extends Habitat> implements IWalkable {
    private int size;
    private List<Animal> animalsInCage;

    public Cage(int size, List<Animal> animalsInCage) {
        this.size = size;
        this.animalsInCage = animalsInCage;
    }

    boolean addToCage(Animal animal) throws Exception {
        if (animal.getSize() > size) throw new Exception("Size out of space.");
        if (animal instanceof Bird) throw new Exception("Bird can not be placed.");
        animalsInCage.add(animal);
        return true;
    }

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

    public List getAnimalsInCage() {
        return animalsInCage;
    }

    public void setAnimalsInCage(List animalsInCage) {
        this.animalsInCage = animalsInCage;
    }
}
