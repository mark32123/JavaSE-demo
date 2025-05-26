package MyStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Streamdemo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","d","e","f");

        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.println(s));
    }
}
