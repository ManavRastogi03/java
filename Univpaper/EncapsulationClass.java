package Univpaper;
 class Student{
    private int age;
    private int no;
    public void setAge(int age){
        this.age=age;
    }

     public int getAge() {
         return age;
     }
     public void setNo(int no){
        this.no=no;

     }
     public int getNo(){
        return no;
     }
 }
public class EncapsulationClass {
    public static void main(Stringbasics[] args) {
        Student s1=new Student();
        s1.setAge(12);
        System.out.println(s1.getAge());

    }
}
