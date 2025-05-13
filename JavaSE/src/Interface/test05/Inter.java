package Interface.test05;

public interface Inter {
    public abstract void method();
    public default void show(){
        System.out.println("show私有方法");
    }

}
