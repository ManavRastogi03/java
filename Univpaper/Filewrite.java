package Univpaper;

import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
    public static void main(String[] args) {
        try{
            FileWriter f1=new FileWriter("C:\\Users\\91983\\Desktop\\manav.txt");
            try{
                f1.write("Hello World My name is Manav Rastogi");
            }finally {
                f1.close();
            }
            System.out.println("Data Wrote Sucesfully");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
