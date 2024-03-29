package com.company;

//Interface
public class AnimalSchool {
    public static void main(String[] args) {
        Hare hare = new Hare();
        hare.run();

        Duck duck = new Duck();
        duck.swim();

        Bear bear = new Bear();
        bear.type = TypeBears.Panda;

    }

}
interface Runnable{
        void run();
}

interface Swimable{
    void swim();
}

interface Climable{
    void climb();
}

abstract class Animal{
    int color;
    double size;

}
abstract class Insect extends Animal{

}
enum TypeBears{Brown, White, Koala, Panda};

class Bear extends Animal{
    public TypeBears type;
}


class Hare extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("Hare: I can run");

    }
}
class Duck extends Animal implements Runnable, Swimable{

    @Override
    public void run() {
        System.out.println("Duck: I can run");

    }

    @Override
    public void swim() {
        System.out.println("Duck: I can swim");

    }
}


