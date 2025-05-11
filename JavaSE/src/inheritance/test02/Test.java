package inheritance.test02;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        System.out.println(z);
        z.game = "王者荣耀";
        z.setName();
        z.setAge();
        String s = z.getName();
        int a = z.getAge();
        System.out.println("name:" + s + "age:" + a );
    }
}
