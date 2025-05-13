package Interface.test01;

public class Test {
    public static void main(String[] args) {
        Flog f = new Flog(1,"青蛙");
        System.out.println(f.getName() + "," + f.getAge());
        f.eat();
        f.swim();

        Dog d = new Dog(5,"狗");
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.swim();

        Rabbit r = new Rabbit(2,"兔子");
        System.out.println(r.getName() + "," + r.getAge());
        r.eat();
    }
}
