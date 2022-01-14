package com.company;

import com.company.animals.Crow;
import com.company.animals.Penguin;
import com.company.animals.Shark;
import com.company.animals.Tiger;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal tiger = new Tiger();
        tiger.setSize(5);

        Animal penguin = new Penguin();
        penguin.setSize(3);

        Animal shark = new Shark();
        shark.setSize(5);

        Animal crow = new Crow();
        crow.setSize(3);

        /**
        *   Habitat
        */
//        Habitat habitat = new Habitat(20);

//        habitat.add(tiger);
//        habitat.add(tiger);
//        habitat.add(tiger);
//        habitat.add(tiger);
//        System.out.println(habitat.getAnimalList());

//        habitat.add(tiger); // throws exception because size is out of space of habitat
//        System.out.println(habitat.getAnimalList());

        /**
         *  Aquarium
         */
//        Aquarium aquarium = new Aquarium(10);

//        aquarium.add(shark);
//        aquarium.add(penguin); // throws exception because penguin can't be accepted

        /**
         *  Cage
         */
//        Cage cage = new Cage(15);

//        cage.add(tiger);
//        cage.add(shark);
//        cage.add(penguin);
//        cage.add(crow);
    }
}
