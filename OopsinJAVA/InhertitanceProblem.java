package Java.OopsinJAVA;

class Circle{
    public int radius;
    Circle(int r){
        this.radius=r;
    }
    public double Area(){
        return Math.PI*this.radius*this.radius;
    }
}
class  Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r,int h){
        super(r);
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class InhertitanceProblem {
    public static void main(String[] args) {
        Cylinder1 c=new Cylinder1(12,13);
        System.out.println(c.Area());
        System.out.println(c.volume());


    }
}
