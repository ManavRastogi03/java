package Univpaper;

public class Trycatch {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e){
            System.out.println("Something Went Wrong "+e);
        }finally{
            System.out.println("Well Fone");
        }
    }
}
