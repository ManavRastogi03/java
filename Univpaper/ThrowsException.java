package Univpaper;
class Negativeradius extends Exception{
    public String toString(){
        return "Area cannot Negative";
    }
}
public class ThrowsException {

        public static  double area(int r) throws Negativeradius {
            if (r < 0) {
                throw new Negativeradius();
            } else {
                return 3.14 * r * r;
            }
        }

    public static void main(String[] args) {
        try{
            area(-2);
        }catch (Negativeradius e){
            System.out.println(e.toString());
        }
    }


}
