package Interface.test04;

public class PingPongCoach extends Coach implements SpeakEnglish{
    public PingPongCoach() {
    }

    public PingPongCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
