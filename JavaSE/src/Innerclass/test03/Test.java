package Innerclass.test03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();

        oi.show();

        Scanner cin = new Scanner(System.in);
        cin.next();
    }
}
