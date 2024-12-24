package Univpaper;
interface Hello{
    public void show();
}
//class Hi implements Hello{
//    public void show(){
//        System.out.println("HIii There Is manav");
//    }
//}
public class Functionalinterface {
    public static void main(String[] args) {
        Hello obj=()->{
              System.out.println("Hiii");

        };
        obj.show();
    }
}
