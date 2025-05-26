package MyStream;

import java.util.HashMap;

public class Streamdemo03 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("王五",25);
        map.put("赵六",26);

        map.keySet().stream().forEach(key -> System.out.println(key));
        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
    }
}
