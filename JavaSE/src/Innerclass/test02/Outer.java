package Innerclass.test02;

public class Outer {
    String name = "jjj";

    private class Inner{
        String name = "ooo";
    }
    public Inner getInstance(){
        return new Inner();
    }
}
