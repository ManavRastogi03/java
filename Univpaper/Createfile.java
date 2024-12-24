package Univpaper;

import java.io.File;
import java.io.IOException;

public class Createfile {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\91983\\Desktop\\manav.txt");
        try{
            if(f1.createNewFile()){
                System.out.println("YOU SUCCESSFULLY CREATED");
            }else{
                System.out.println("File Already");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
