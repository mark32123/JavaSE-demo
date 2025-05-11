package inheritance.test03;

public class Tutor extends Teacher{
    public Tutor(String id,String name,String work){
        super(id,name,work);
    }

    @Override
    public void work() {
        System.out.println(getWork() + getName() + "在帮助讲师辅导");
    }
}
