package Univpaper;
class hii{
    public void greet(){
        System.out.println("Hello Good Morning");
    }
    public void greet(String name){
        System.out.println(name+" Good Night");
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        hii a1 = new hii();
        a1.greet();
        a1.greet("manav");
    }
}
