package Interface.test01;

public class Rabbit extends Animals{

    public Rabbit() {
    }

    public Rabbit(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃萝卜");
    }
}
