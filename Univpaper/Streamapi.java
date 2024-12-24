package Univpaper;

import java.util.*;
import java.util.stream.Stream;

public class Streamapi {
    public static void main(String[] args) {

//
//        int[] arr1 = {2, 4, 5, 6, 7, 11};
////        int sum = Arrays.stream(arr1).filter(n -> n % 2 == 0).sum();
////        System.out.println(sum);
////        Stream<Integer> st=arr1.stream();
//        List<Integer> l1=Arrays.asList(1,23,4,52,11);
//        Stream<Integer> s1=l1.stream().filter();
////        filter
//        int sum=s1.filter(n->System.out.println(n%2==0));
//        System.out.println(sum);
////        l1.forEach(n-> System.out.println(n));
//        l1.mao()
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(23);
        Stream<Integer> s=list.stream();
//        Stream<Integer> filterdata=s.filter(n->n%2==0);
//        filterdata.forEach(n-> System.out.println(n));
//        Stream<Integer> mapdata=s.map(n->n*2);
//        mapdata.forEach(n-> System.out.println(n));
        Stream<Integer> sortdata=s.sorted();
        sortdata.forEach(n-> System.out.println(n));



    }
}
