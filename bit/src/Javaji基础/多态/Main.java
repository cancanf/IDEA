package Javaji基础.多态;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat("sds");
        animal = new Cat();
        animal.eat("baba");

        Cat cat = new Cat();

    }
}
