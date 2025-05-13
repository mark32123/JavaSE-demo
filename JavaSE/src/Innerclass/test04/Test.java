package Innerclass.test04;
//匿名内部类
public class Test {
    public static void main(String[] args) {

    //编写内部匿名类
        new Swim(){

            @Override
            public void Swim() {
                System.out.println("重写了游泳方法");
            }
        };
    }
}
