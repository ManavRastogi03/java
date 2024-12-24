package Univpaper;

import java.util.Stack;

public class Reversestack {
    public static void main(String[] args) {
        String s="Manav";
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            st.push(s.charAt(i));
        }
        while(!st.empty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
