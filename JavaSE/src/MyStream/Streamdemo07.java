package MyStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamdemo07 {
    public static void main(String[] args) {
        ArrayList<String> manlist = new ArrayList<>();
        Collections.addAll(manlist,"aaa,1","b,2","ccc,3","dddd,4","e,5");
        ArrayList<String> womanlist = new ArrayList<>();
        Collections.addAll(womanlist,"f,1","g,2","h,3","i,4","g,5");

        Stream<String> stream1 = manlist.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);
        Stream<String> stream2 = womanlist.stream().filter(s -> "g".equals(s.split(",")[0])).skip(1);

        List<Actor> collect = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
