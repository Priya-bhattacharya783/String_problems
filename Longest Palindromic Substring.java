import java.io.*;
import java.util.*;

public class Solution {
    static boolean palin(String s){
        String s1=s;
        String ch="";
        for(int i=s.length()-1;i>=0;i--)
        {
            ch+= s.charAt(i);
        }
        if(ch.equals(s1))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String longest = "";

        for(int i=0;i<s.length();i++) {
            for(int j=i;j<s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if(palin(sub) && sub.length()>longest.length()) {
                    longest = sub;
                }
            }
        }

        System.out.println(longest);
        
    }
}
