package Polymorphism.test03;

public class Cat extends Animals{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public void cathMouse(){
        System.out.println("猫抓老鼠");
    }

    @Override
    public void eat(String somthing) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫抱住" + somthing + "吃");
    }
}
