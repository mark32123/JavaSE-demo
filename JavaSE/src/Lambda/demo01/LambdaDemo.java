package Lambda.demo01;

import java.util.Arrays;
//简化匿名内部类写法
//必须是接口匿名内部类，且接口有且只有一个抽象方法

public class LambdaDemo {
    public static void main(String[] args) {
        Girlfriend gf1 = new Girlfriend("小花", 18, 1.68);
        Girlfriend gf2 = new Girlfriend("小美", 19, 1.58);

        Girlfriend []a = {gf1, gf2};
        Arrays.sort(a, (Girlfriend o1, Girlfriend o2) ->{
                double templ = o1.getAge() - o2.getAge();
                templ = templ == 0 ? (int) (o1.getHeight() - o2.getHeight()) : templ;
                templ = templ == 0 ? (int) (o1.getName().compareTo(o2.getName())) : templ;
                if(templ >= 0) return 1;
                else return 0;
        });
        System.out.println(Arrays.toString(a));
    }
}
