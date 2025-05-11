package inheritance.test03;

public class Maintainer extends AdminStaff{
    public Maintainer(String id,String name,String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println(getWork() + getName() + "在维护物品");
    }
}
