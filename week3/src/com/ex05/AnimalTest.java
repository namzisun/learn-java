package com.ex05;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);
        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);
    }

    private void testDownCasting(ArrayList<Animal> animalList) {
        for (Animal a : animalList)
        {
            if (a instanceof Human) {
                Human human = (Human) a;
                human.readBooks();
            } else if (a instanceof Tiger) {
                Tiger tiger = (Tiger) a;
                tiger.hunting();
            } else if (a instanceof Eagle) {
                Eagle eagle = (Eagle) a;
                eagle.fly();
            }
        }
    }

}
