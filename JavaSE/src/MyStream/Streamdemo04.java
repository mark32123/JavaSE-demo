package MyStream;

import java.util.stream.Stream;

public class Streamdemo04 {
    public static void main(String[] args) {

        String []arr1 ={"a","b","c","d","e"};

        Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(s -> System.out.println(s));
        Stream.of(arr1).forEach(s -> System.out.println(s));
    }
}
/*
    Stream流中的常用方法
        Stream.of(T... values)
            创建一个流
*/
