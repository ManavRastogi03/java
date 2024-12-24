package Java.OopsinJAVA;
class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void  setname(String n){
        name=n;
    }
}
class Cellphone{
    public void ring(){
        System.out.println("THe phone is ringing");
    }
    public void vibrate(){
        System.out.println("THe phone is Vibrating");
    }
    public void snoze(){
        System.out.println("The phone is Snoozing");
    }
}
public class EmployeesDetail {
    public static void main(String[] args) {
        Employee Manav = new Employee();
        Manav.setname("Wizard");
        System.out.println(Manav.getname());

        Manav.salary=100000;
        System.out.println(Manav.getSalary());
        Cellphone asus=new Cellphone();
        asus.vibrate();
        asus.ring();
        asus.snoze();

    }

}
