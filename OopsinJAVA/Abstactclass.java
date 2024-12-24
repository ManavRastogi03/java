package Java.OopsinJAVA;
abstract class Parent2{
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    public void greet(){
        System.out.println("good Morning");
    }
    public void greet2(){
        System.out.println("Good Afternoon");
    }


}
abstract class child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class Abstactclass {
    public static void main(String[] args) {
//        Parent2 p=new Parent2();
//        We cannot implement the abstract class object
            Child2 c=new Child2();
            c.greet();
            c.sayHello();
//            Child3 c3=new Child3();
//        we cannot create the object of absract class
    }

}
