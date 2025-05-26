package MyStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Streamdemo05 {
    public static void main(String[] args) {

        /*
        *   long count
        *   toArray
        *
        * */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","d","e","f");
        System.out.println(list.stream().count());
        System.out.println("=======");
        String []str = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(str));
        System.out.println("=======");
        String []str1 = list.stream().toArray(value ->new String [value]);
        System.out.println(Arrays.toString(str1));
    }
}
