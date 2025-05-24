package Vessel.demo03;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo03 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String s = it.next();
            if (s.equals("bbb")){
                it.remove();
            }
        }
        System.out.println(coll);
    }
}
