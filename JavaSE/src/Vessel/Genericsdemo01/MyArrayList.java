package Vessel.Genericsdemo01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int index = 0;

    public boolean add(E e) {
        obj[index] = e;
        index++;
        return true;
    }

    public E get(int index) {
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
