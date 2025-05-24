package Vessel.demo05;

public class Dog1 extends Dog{

    @Override
    public void eat() {
        System.out.println("养了一只" + getAge()  + "岁的" + "的叫" + getName() + "的狗");
    }
}
