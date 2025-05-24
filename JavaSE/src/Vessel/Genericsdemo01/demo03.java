package Vessel.Genericsdemo01;

import java.util.ArrayList;

public class demo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list, "bbb", "aaa", "ccc", "ddd");
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll(list2, 1, 2, 3, 4);
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        ListUtil.addAll2(list3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list3);
    }
}
