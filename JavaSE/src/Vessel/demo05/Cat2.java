package Vessel.demo05;

public class Cat2 extends Cat{
    @Override
    public void eat() {
        System.out.println("养了一只" + getAge()  + "岁的" + "的叫" + getName() + "的猫");
    }
}
