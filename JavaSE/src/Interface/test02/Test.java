package Interface.test02;

public class Test {
    public static void main(String[] args) {
        InterImp ii = new InterImp();
        ii.method3();
        System.out.println(InterImp.a);
        InterImp.a = 20;
        System.out.println(InterImp.a);
    }
}
