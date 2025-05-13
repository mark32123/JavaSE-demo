package oop_abstract;

public class Test {
    public static void main(String[] args) {
        Flog f = new Flog(1,"flog");
        System.out.println(f.getName() + "," + f.getAge());
        f.eat();

        Dog d = new Dog(5,"dog");
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
    }
}
