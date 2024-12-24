package Univpaper;
class myClass{
    public void greet(){
        System.out.println("Hello Good ");
    }

}
class D extends myClass{
    @Override
    public void greet(){
        System.out.println("Hello Bye");
    }
}

public class OverridingMethod {
    public static void main(String[] args) {
        D b1=new D();
        b1.greet();
    }
}
