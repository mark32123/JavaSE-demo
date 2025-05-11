package Polymorphism.test03;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("mark",33);
        Dog d = new Dog(2,"黄色");
        Cat c = new Cat(1,"花色");
        p.keepPet(d,"骨头");
        p.keepPet(c,"三文鱼");

    }
}
