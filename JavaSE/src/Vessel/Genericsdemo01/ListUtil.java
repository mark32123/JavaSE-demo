package Vessel.Genericsdemo01;

import java.util.ArrayList;
import java.util.List;

public class ListUtil<E> {
    public static <E> boolean addAll(ArrayList<E> list , E e1, E e2, E e3, E e4){
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        return true;
    }

    public static <E> boolean addAll2(ArrayList<E> list ,E...e){
        for (E e1 : e) {
            list.add(e1);
        }
        return true;
    }
}
