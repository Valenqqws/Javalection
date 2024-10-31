package Homework16;

public class Cow extends Animal{

    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSounds() {
        System.out.println(  name + "Му му му");

    }
}
