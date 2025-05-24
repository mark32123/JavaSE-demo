package Vessel.demo05;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Dog1> list1 = new ArrayList<>();
        ArrayList<Dog2> list2 = new ArrayList<>();
        ArrayList<Cat1> list3 = new ArrayList<>();
        ArrayList<Cat2> list4 = new ArrayList<>();

        keepPeg(list1);
        keepPeg(list2);
        keepPeg(list3);
        keepPeg(list4);
    }

    public static void keepPeg(ArrayList<? extends Animals> list){
        for (Animals animals : list) {
            animals.eat();
        }
    }
}
