package MyStream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streamdemo06 {
    public static void main(String[] args) {
     /*
     *  collect:收集流中的数据，放到集合中（list,set,map）
     *  ps: map集合的key不能重复，否则会报错
     * */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a-v-1","b-v-2","d-v-3","e-v-4","f-v-5","g-o-6");
        List<String> list1 = list.stream()
                                 .filter(s -> "v".equals(s.split("-")[1]))
                                 .collect(Collectors.toList());
        System.out.println(list1);
        System.out.println("=====");
        Set<String> list2 = list.stream()
                .filter(s -> "v".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(list2);
        System.out.println("=====");
//        Map<String, Integer> map = list.stream()
//                .filter(s -> "v".equals(s.split("-")[1]))
//                .collect(Collectors.toMap(new Function<String, String>() {
//                    @Override
//                    public String apply(String s) {
//                        return s.split("-")[0];
//                    }
//                }, new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        return Integer.parseInt(s.split("-")[2]);
//                    }
//                }));
        Map<String,Integer> map =list.stream()
                .filter(s -> "v".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(map);

    }
}
