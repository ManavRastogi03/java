package Univpaper;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

class Student1{
    private String name;
    public   Student1(String s){
         name=s;
     }
     public String getName(){
         return name;
     }
}
public class constructorMethodref {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("Manav", "Rastogi");
//        List<String> t1=l1.stream().map(x->new Student1(x)).collect(Collectors.toList());
        List<Student1> t1=l1.stream().map(Student1::new).collect(Collectors.toList());
        t1.forEach(x-> System.out.println(x.getName()));

    }
}
