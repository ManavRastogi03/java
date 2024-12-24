package Univpaper;
class Students{
    int roll;
    int no;
    Students(){
        roll=110;
        no=0;
        System.out.println("I am Original");
    }
    private Students(int roll){
        this.roll=roll;
        no=0;
    }
    Students(Students ref){
        int a=ref.roll;
        int b=ref.no;
        System.out.println("I am copy ");
    }

}
public class ConstructorClass {
    public static void main(Stringbasics[] args) {
        Students s1=new Students();
        Students obj=new Students(s1);
//        System.out.println(s1.roll);

    }
}
