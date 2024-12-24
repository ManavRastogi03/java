package Univpaper;
class myclass{
    final int a=10;
    final void display() {
        System.out.println("Hello");
    }
}
//class subclass extends myclass{
//    a=12;//Error
//}
public class FinalMember {
    public static void main(Stringbasics[] args) {
        myclass a1=new myclass();
        System.out.println(a1.a);
//        a1.a=12;//final canot be asssign

    }
}
