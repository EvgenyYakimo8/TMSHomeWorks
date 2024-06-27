package by.tms.lesson15.task2;

import java.util.ArrayList;

public class Collection {
    protected ArrayList<String> animals = new ArrayList<>();

    public void addFirstAnimal(String animal){
        animals.addFirst(animal);
    }
    public void removeLastAnimal(){
        animals.removeLast();
    }

}
