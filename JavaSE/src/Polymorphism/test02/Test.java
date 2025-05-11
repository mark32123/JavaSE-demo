package Polymorphism.test02;

public class Test {
    public static void main(String[] args) {
        Animals a = new Dog();
        System.out.println(a.name); //成员变量：编译看左边，运行看左边
        a.show(); //成员方法：编译看左边，运行看右边
    }
}

class Animals {
    String name = "Animals";
    public void show(){
        System.out.println("Animals");
    }
}

class Dog extends Animals {
    String name = "Dog";

    @Override
    public void show() {
        System.out.println("Dog");
    }
}

class Cat extends Animals{
    String name = "Cat";

    @Override
    public void show() {
        System.out.println("Cat");
    }
}

//弊端：多态不能继承子类中的特有方法，需要强制转换类才行
//自动类型转换/instanceof判断