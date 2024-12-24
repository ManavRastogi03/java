package Univpaper;

import java.io.File;
import java.io.IOException;

public class Deletefile {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\91983\\Desktop\\manav.txt");
//        try{
            if(f1.delete()){
                System.out.println("Successfully delete");
            }else{
                System.out.println("Already Exist");
            }
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
    }
}
