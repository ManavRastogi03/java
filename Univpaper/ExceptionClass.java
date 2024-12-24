package Univpaper;

import java.util.Scanner;
class MyException extends Exception{
    public String toString(){
        return "Age cannot be less then 18";
    }
    public String getMessage(){
        return "You Age is not Eligble";
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a < 18) {
        try {
           throw new MyException();
        }
        catch(MyException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        }
        else{
            System.out.println("Elgible you are");
        }
    }
}
