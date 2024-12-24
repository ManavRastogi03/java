package Univpaper;

import java.util.*;


public class Methodrefrence {
    public static void prints(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("Manav","Ram","Shyam");
//        Methodrefrence t1=new Methodrefrence();
//        l1.forEach(x->System.out.println(x));
        l1.forEach(Methodrefrence::prints);
    }
}