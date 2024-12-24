package Univpaper;
class Threads implements Runnable{
    public void run(){
        for(int i=0;i<50;i++) {
            System.out.println("Hello");
        }
    }
}
class Mythreads implements Runnable{
    public void run(){
        for(int i=0;i<50;i++) {
            System.out.println("Hiii");
        }
    }
}
public class Implementrunnable {
    public static void main(String[] args) {
        Threads obj = new Threads();
        Thread t1 = new Thread(obj);
        Mythreads obj1=new Mythreads();
        Thread t2=new Thread(obj1);
        t1.start();

        t2.start();


    }

}
