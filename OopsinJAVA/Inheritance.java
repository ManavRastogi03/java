package Java.OopsinJAVA;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x Now");
        this.x = x;
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //Creating a object of Base class
        Base b1=new Base();
        b1.setX(234);
        System.out.println(b1.getX());
//        Creatinfg a object of Dervied class
        Derived d1=new Derived();
        d1.setX(23);
        System.out.println(d1.getX());

    }
}
