package oop_abstract;

public class Flog extends Animals{

    public Flog() {
    }

    public Flog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫");
    }
}
