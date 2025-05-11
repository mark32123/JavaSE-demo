package Polymorphism.test01;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("mark");
        s.setAge(19);

        Teacher t = new Teacher();
        t.setName("Jimmy");
        t.setAge(36);

        Admin a = new Admin();
        a.setName("gogo");
        a.setAge(34);

        register(s);
        register(t);
        register(a);
    }
    //传递参数为一个类，可以传递该类所有子类对象
    public static void register(Person p){
        p.show();
    }
}
