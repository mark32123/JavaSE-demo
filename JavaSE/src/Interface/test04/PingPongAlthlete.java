package Interface.test04;

public class PingPongAlthlete extends Althlete implements SpeakEnglish{
    public PingPongAlthlete() {
    }

    public PingPongAlthlete(int age, String name) {
        super(age, name);
    }

    @Override
    public void learn() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
