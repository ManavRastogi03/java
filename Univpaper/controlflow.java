package Univpaper;
import java.util.*;
public class controlflow {
    public static void main(Stringbasics[] args) {
//        int a = 10;
//        if (a>0){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }
        int a = 2002;
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else {
                System.out.println("true");
            }

        } else {
            System.out.println("flase");
        }
    }

    int[] arr = new int[5];

    Scanner sc = new Scanner(System.in);
    //    int arr[]={1,2,334,12};
//    for(int i=0;i<5;i++){
//        arr[i]=sc.nextInt();
//    }
//    for(int i=0;i<5;i++){
//        System.out.println(arr[i]+" ");
//    }
//    for(int ele:arr[]){
//        System.out.println(ele);
//
    int[][] a = new int[2][5];
    //    string
//    String str = "manav";

}