package Homework16;

public class Main {


    public static void main(String[] args) {
        Dog dog = new Dog(" Шарік ");
        Cat cat = new Cat(" Марсік ");
        Cow cow = new Cow(" Мушка ");

        System.out.println("============");
        dog.makeSounds();
        dog.eat();

        System.out.println("============");
        cat.makeSounds();
        cat.eat();
        System.out.println("============");

        cow.makeSounds();
        cow.eat();
        System.out.println("============");
    }


    }









