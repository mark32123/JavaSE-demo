package Interface.test04;

public class Test {
    public static void main(String[] args) {
        PingPongAlthlete pa = new PingPongAlthlete(22,"马龙");
        System.out.println(pa.getName() + "," + pa.getAge());
        pa.learn();
        pa.speak();
    }
}
