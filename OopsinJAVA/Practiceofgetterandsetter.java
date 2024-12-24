package Java.OopsinJAVA;
class Cylinder{
    private int radius;
    private int height;
    Cylinder(int radius,int height){
        this.radius=radius;
        this.height=height;
    }
    Cylinder(){

    }
    public void setRadius(int r){
        radius=r;
    }
    public void setHeight(int h){
        height=h;
    }
    public int getHeight(){
        return height;
    }
    public int getRadius(){
        return radius;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }

}

public class Practiceofgetterandsetter {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        c1.setHeight(12);
        c1.setRadius(4);
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
    }
}
