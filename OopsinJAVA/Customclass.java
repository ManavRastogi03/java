package Java.OopsinJAVA;
class Employees{
    int id;
    String name;
    public void printdetail(){
        System.out.println("THE ID IS"+id);
        System.out.println("THe name is "+name);
    }
}
public class Customclass {
    public static void main(String[] args) {
        Employees e1=new Employees();//Instanting a new employee Object
//        Setting attribute
        e1.name="Manav";
        e1.id=12;
//        real world=Properties + Behaviour
//        Oops in java =Attribute+Method
//        System.out.println(e1.name);
        e1.printdetail();

    }
}