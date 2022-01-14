package com.company.genericTypes;

import com.company.abstractClasses.Animal;
import com.company.interfaces.IFlyable;

import java.util.ArrayList;
import java.util.List;

public class Cell<T extends Habitat> implements IFlyable {
    private int size;
    private List<Animal> animalList; // we can make it [] for that reason, this var shouldn't be dynamic (it should be static)


    public Cell(int size) {
        this.size = size;
        animalList = new ArrayList<>(size);
    }

    public Animal add(Animal animal) throws Exception {
        if (animal.getSize() > size) throw new Exception("Size out of available space");
        animalList.add(animal);
        size -= animal.getSize();
        return animal;
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

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }
}
