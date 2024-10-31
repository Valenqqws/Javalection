package Homework16;

public abstract class Animal {


    String name;


    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(" Тварина щось їсть... ");
    }


    public abstract void makeSounds();




}
