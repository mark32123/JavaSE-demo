package Polymorphism.test03;

public class Animals {
    private int age;
    private String color;

    public Animals() {
    }

    public Animals(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String somthing){
        System.out.println("动物在吃" + somthing);
    }

}
