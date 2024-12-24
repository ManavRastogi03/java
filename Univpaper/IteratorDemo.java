package Univpaper;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(12);
        a1.add(23);
        a1.add(34);
        a1.add(45);
        a1.add(67);
        System.out.println(a1.size());
        System.out.println(a1.iterator());
//        System.out.println(a1.remove());
//        System.out.println(a1.clear());
//        System.out.println(a1.addAll());

        Iterator<Integer> i=a1.iterator();
        System.out.println(i.hasNext());
        i.remove();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
