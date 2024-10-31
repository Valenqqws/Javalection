package Homework16;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSounds() {
        System.out.println( name + "Мяу мяу");
    }


}
