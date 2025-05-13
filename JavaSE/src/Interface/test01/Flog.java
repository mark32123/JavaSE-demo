package Interface.test01;

public class Flog extends Animals implements Swim{
    public Flog() {
    }

    public Flog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙游泳");
    }
}
