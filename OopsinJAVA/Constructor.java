package Java.OopsinJAVA;
class MymainEmployee{
    String name;
    int id;
    MymainEmployee(){
        name="MANAV";
        id=37;
    }
    MymainEmployee(String name){
        this.name=name;
        id=12;
    }
}

//constructor can be overloaded

public class Constructor {
    public static void main(String[] args) {
        MymainEmployee e1 = new MymainEmployee();
        e1.name = "raghav";
        e1.id = 12;
        System.out.println(e1.name);

    }

}
