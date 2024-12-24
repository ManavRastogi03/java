package Univpaper;
interface vehicle{
    void clean();
    default void speed(){
        System.out.println("20Mpd");
    }
}
 class Car1 implements vehicle{
    public void clean(){
        System.out.println("Cleaned");
    }
}
class Car2 implements vehicle{
    public void clean(){
        System.out.println("Not Cleaned");
    }
    public void speed(){
        System.out.println("30");
    }
}

public class Defaultmethod {
    public static void main(String[] args) {


        Car1 c1 = new Car1();
        c1.speed();
    }
}
