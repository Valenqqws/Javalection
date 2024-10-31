package Homework19;


class Car {
    private String model;
    private int year;
    private Engine engine;
    private Wheel wheel;


    public Car(String model, int year, int wheelSize) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(); // создаем объект двигателя
        this.wheel = new Wheel(wheelSize); // создаем объект колеса
    }


    public void showInfo() {
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
    }


    public void engineStart() {
        engine.start();
    }

    public void engineStop() {
        engine.stop();
    }


    public int getWheelSize() {
        return wheel.getSize();
    }


    class Engine {
        private boolean isRunning;


        public void start() {
            if (!isRunning) {
                isRunning = true;
                System.out.println("Двигатель запущен.");
            } else {
                System.out.println("Двигатель уже работает.");
            }
        }


        public void stop() {
            if (isRunning) {
                isRunning = false;
                System.out.println("Двигатель остановлен.");
            } else {
                System.out.println("Двигатель уже остановлен.");
            }
        }
    }

    static class Wheel {
        private int size;


        public Wheel(int size) {
            this.size = size;
            System.out.println("Колеса установлены размером " + size + " дюймов.");
        }


        public int getSize() {
            return size;
        }
    }
}

