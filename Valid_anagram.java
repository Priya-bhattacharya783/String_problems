import java.io.*;
import java.util.*;

public class Valid_anagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] s1=s.toCharArray();
        
        String t=sc.nextLine();
        char[] t1=t.toCharArray();
        
        if(s1.length != t1.length)
        {
            System.out.print("false");
            return;
        }
        
        Arrays.sort(s1);
        Arrays.sort(t1);
        
        if(Arrays.equals(s1,t1))
        {
           System.out.print("true"); 
        }
        else{
            System.out.print("false");
        }
        
    }
}
