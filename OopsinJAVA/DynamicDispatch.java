package Java.OopsinJAVA;
class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("The name is Phone");
    }
}
class SmartPhone extends Phone{

    public void swagat(){
        System.out.println("Apka swaghat hai");
    }
    public void name(){
        System.out.println("The name is smartphone");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {


//    SmartPhone a=new Phone();
//        Super->sub Allowed
        Phone a = new SmartPhone();
        a.name();
        a.greet();
//        a.swagat();
    }
}
