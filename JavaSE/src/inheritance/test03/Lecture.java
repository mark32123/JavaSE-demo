package inheritance.test03;

public class Lecture extends Teacher{
    public Lecture(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println(getWork() + getName() + "在讲课");
    }
}
