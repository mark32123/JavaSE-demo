package oop_abstract;

public class Dog extends Animals{

    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }
}
