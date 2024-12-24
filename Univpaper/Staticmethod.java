package Univpaper;
interface vehicle1{
    void clean();
    static  void speed(){
        System.out.println("20Mpd");
    }
}
class Cars1 implements vehicle1{
    public void clean(){
        System.out.println("Cleaned");
    }
}
class Cars2 implements vehicle1{
    public void clean(){
        System.out.println("Not Cleaned");
    }
//    public void speed(){
//        System.out.println("30");
//    }
}

public class Staticmethod {
    public static void main(String[] args) {


        Cars1 c1 = new Cars1();
        vehicle1.speed();
        c1.clean();
    }
}
