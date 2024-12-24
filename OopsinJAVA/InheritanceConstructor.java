package Java.OopsinJAVA;
class Base1{
    Base1() {
        System.out.println("The base Constructor");
    }
    Base1(int x){
        System.out.println("The base class is ovloded Of a is"+x);
    }

}
class Derived1 extends Base1{
    Derived1(){
//        super(9);
        System.out.println("This is the Derived constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("The derived constuctor of y is "+y);
    }

}
public class InheritanceConstructor {
    public static void main(String[] args) {
//        Base1 b=new Base1();
        Derived1 d=new Derived1(14,9);


    }
}
