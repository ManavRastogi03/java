package Java.OopsinJAVA;
class A{
    public void meth1(){
        System.out.println("THe method 1 of class A");
    }
    public void meth2(){
        System.out.println("The method 2 of class A");
    }
}
class B{
    public void meth2(){
        System.out.println("The method 2 of class B");
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();
    }
}
