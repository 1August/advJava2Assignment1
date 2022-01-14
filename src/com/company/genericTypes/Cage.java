package com.company.genericTypes;

import com.company.Animal;
import com.company.abstractClasses.Bird;
import com.company.animals.Penguin;
import com.company.interfaces.IWalkable;

import java.util.ArrayList;
import java.util.List;

public class Cage<T extends Habitat> implements IWalkable {
    private int size;
    private List<Animal> animalList; // we can make it [] for that reason, this var shouldn't be dynamic (it should be static)
//    private List<Animal> animalsInCage;

    public Cage(int size) {
        this.size = size;
        animalList = new ArrayList<>(size);
    }

//    public Cage(int size, List<Animal> animalsInCage) {
//        this.size = size;
//        this.animalsInCage = animalsInCage;
//    }

    public Animal add(Animal animal) throws Exception {
        if (animal.getSize() > size) throw new Exception("Size out of available space.");
//        Penguin is Bird, but it can't fly
        if (animal instanceof Bird && !(animal instanceof Penguin)) throw new Exception("Bird can not be placed.");
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

//    public List getAnimalsInCage() {
//        return animalsInCage;
//    }
//
//    public void setAnimalsInCage(List animalsInCage) {
//        this.animalsInCage = animalsInCage;
//    }
}
