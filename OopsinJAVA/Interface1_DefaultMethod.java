package Java.OopsinJAVA;
interface  Mywifi{
    String[] getNetwork();
    void acessNetwork();
}
interface MyCamera{
    void takesnap();
    void getsnap();
}

class  CellPhone{
    void CallPickup(){
        System.out.println("Callling..!");
    }
    void CallNumber(int no){
        System.out.println("The call to"+no);
    }
}
class MySmartPhone extends CellPhone implements MyCamera,Mywifi{
    public void takesnap(){
        System.out.println("Taking a snap");
    }
    public void getsnap(){
        System.out.println("Getting the snap");
    }
    public void acessNetwork(){
        System.out.println("Acess The networks");
    }
    public String[] getNetwork(){
        System.out.println("They can get the  network");
        String[] n={"MANAV","Hello","Abhi"};
        return n;
    }
}

public class Interface1_DefaultMethod {
    public static void main(String[] args) {
        MySmartPhone sm=new MySmartPhone();
        sm.acessNetwork();;


    }
}
