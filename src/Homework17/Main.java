package Homework17;

import java.util.Date;

public class Main {
    public static void main(String[] args) {



        Action greetingAction = new Action() {
            @Override
            public void perform() {
                System.out.println("Привіт,ви в системі!");
            }
        };


        Action additionAction = new Action() {
            @Override
            public void perform() {
                int a = 12;
                int b = 5;
                int result = a + b;
                System.out.println("Сумма чисел" + a + "и" + b + "дорівнює" + result);
            }
        };


        Action dateAction = new Action() {
            @Override
            public void perform() {
                Date currentDate = new Date();
                System.out.println("Теперешня дата" + currentDate);
            }
        };
        greetingAction.perform();
        additionAction.perform();
        dateAction.perform();
    }
}
