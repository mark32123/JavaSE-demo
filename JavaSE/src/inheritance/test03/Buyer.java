package inheritance.test03;

public class Buyer extends AdminStaff{
    public Buyer(String id,String name,String work){
        super(id,name,work);
    }

    @Override
    public void work() {
        System.out.println(getWork() + getName() + "在采购");
    }
}
