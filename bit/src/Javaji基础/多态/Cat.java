package Javaji基础.多态;

public class Cat extends Animal {
    String name = "cat";

    public void eat(String food, int i) {
        System.out.println(name + " ++++" + food + i);
    }
}
