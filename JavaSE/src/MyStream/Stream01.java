package MyStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Stream01 {
    public static void main(String[] args) {

        /*
        *       1,原来的Stream流只能使用一次
        *       2，修改流里面的数据，原始数据不会改变
        *
        *
        */
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张三","张无极","李四","张小强","王五");

        ArrayList<String> list2 = new ArrayList<>();
        list1.stream().filter(name -> name.startsWith("张")).filter(name ->name.length() == 3).forEach(name -> System.out.println(name));
        System.out.println("======================================================");
        /*  limit:获取前几个
        *   skip:跳过前几个
        *   distinct:去重
        *   concat:连接两个流
        *   map:转换流中数据类型
        */
        list1.stream().limit(2).forEach(name -> System.out.println(name));
        System.out.println("======================================================");
        list1.stream().skip(2).forEach(name -> System.out.println(name));
        System.out.println("======================================================");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"a-1","b-2","c-3","d-4","e-5");
//        list3.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String []str = s.split("-");
//                return Integer.parseInt(str[1]);
//            }
//        }).forEach(s -> System.out.println(s));

        list3.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.println(s));
    }
}
