package Univpaper;
class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Bye");
        }
    }
}
public class Byusingthread {
    public static void main(String[] args) {
        A t1=new A();
        B t2=new B();
        t2.start();
//        t2.join();
        t1.start();


    }
}
