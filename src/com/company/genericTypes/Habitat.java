package com.company.genericTypes;

import com.company.Animal;
import com.company.interfaces.IMovable;

import java.util.ArrayList;
import java.util.List;

public class Habitat<T> implements IMovable {
    private int size;
    private List<Animal> animalList; // we can make it [] for that reason, this var shouldn't be dynamic (it should be static)

    public Habitat(int size) {
        this.size = size;
        animalList = new ArrayList<>(size);
    }

    public Animal add(Animal animal) throws Exception {
        if (animal.getSize() > size) throw new Exception("Size out of available space.");
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

    @Override
    public String toString() {
        return "Habitat{" +
                "size=" + size +
                ", animalList=" + animalList +
                '}';
    }
}
