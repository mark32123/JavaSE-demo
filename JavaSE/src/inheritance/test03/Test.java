package inheritance.test03;

public class Test {
    public static void main(String[] args) {
        Lecture l = new Lecture("001","mark","讲师");
        l.work();

        Tutor t = new Tutor("002","jimmy","助教");
        t.work();

        Maintainer m = new Maintainer("003","gogo","维修工");
        m.work();

        Buyer b = new Buyer("004","jenny","采购");
        b.work();
    }
}
