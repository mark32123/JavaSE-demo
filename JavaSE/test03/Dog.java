package Polymorphism.test03;

import java.time.Year;

public class Dog extends Animals{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public void lookHome(){
        System.out.println("狗看家");
    }

    @Override
    public void eat(String somthing) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗抱住" + somthing + "吃");
    }
}
