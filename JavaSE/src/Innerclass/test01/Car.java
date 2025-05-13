package Innerclass.test01;

public class Car {
    private int carAge;
    private String carName;
    private String carColor;

    public Car() {
    }

    public Car(int carAge, String carName, String carColor) {
        this.carAge = carAge;
        this.carName = carName;
        this.carColor = carColor;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    //外部类不能直接访问内部类方法，但是可以new一个对象来访问
    Engine e = new Engine();
    public void show(){
        System.out.println(e.engineAge);
        System.out.println(e.engineName);
    }

    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(carColor);
            System.out.println();
        }
    }
}
