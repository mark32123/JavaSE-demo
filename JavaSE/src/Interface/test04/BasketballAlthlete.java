package Interface.test04;

public class BasketballAlthlete extends Althlete{
    public BasketballAlthlete() {
    }

    public BasketballAlthlete(int age, String name) {
        super(age, name);
    }

    @Override
    public void learn() {
        System.out.println("学打篮球");
    }
}
