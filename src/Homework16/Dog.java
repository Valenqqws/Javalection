package Homework16;

public class Dog extends Animal {


   public Dog(String name){
       super(name);

    }

    @Override
    public void makeSounds() {
        System.out.println( name + "Гав гав гав");
    }

}
