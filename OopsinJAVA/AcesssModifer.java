package Java.OopsinJAVA;
class MyEmployee{
    private int id;
    private String name;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void  setId(int i){
        id=i;
    }

}
public class AcesssModifer {
    public static void main(String[] args) {
        MyEmployee e1=new MyEmployee();
        e1.setName("Manav");
        e1.setId(23);
        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }
}
