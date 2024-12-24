package Univpaper;
class Calc{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
class AdvCal extends Calc{
    public int multi(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
public class InheritanceClass {
    public static void main(Stringbasics[] args) {
        AdvCal a1=new AdvCal();
        System.out.println( a1.add(12,34));
    }
}
