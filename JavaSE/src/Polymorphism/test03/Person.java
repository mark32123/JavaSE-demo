package Polymorphism.test03;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public void keepPet(Dog d,String somthing){
//        System.out.println("年龄为" + age + "的" + name + "养了一只" + d.getColor() + "的" + d.getAge() + "岁的" + "狗");
//        d.eat(somthing);
//    }
//
//    public void keepPet(Cat c,String somthing){
//        System.out.println("年龄为" + age + "的" + name + "养了一只" + c.getColor() + "的" + c.getAge() + "岁的" + "猫");
//        c.eat(somthing);
//    }

    public void keepPet(Animals a,String somthing){
        if(a instanceof Dog d){
            System.out.println("年龄为" + age + "的" + name + "养了一只" + d.getColor() + "的" + d.getAge() + "岁的" + "狗");
            d.eat(somthing);
        }
        else if(a instanceof Cat c){
            System.out.println("年龄为" + age + "的" + name + "养了一只" + c.getColor() + "的" + c.getAge() + "岁的" + "猫");
            c.eat(somthing);
        }
        else{
            System.out.println("没有这种动物");
        }
    }
}
