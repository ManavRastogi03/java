package Java.OopsinJAVA;
class Ekclass{
    int a;
    public int getA(){
        return a;
    }
    Ekclass(int a){
        this.a=a;
    }
}
class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("Mai ek Inheritance constructor hu"+c);
    }

}
public class This_super {
    public static void main(String[] args) {
        Ekclass a=new Ekclass(12);
        Doclass d=new Doclass(23);
        System.out.println(a.getA());

    }


}
