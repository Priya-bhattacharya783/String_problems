import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        char [] c= s.toCharArray();
        String ch="";
        for(int i=0;i<c.length;i++)
        {
            if(Character.isLetterOrDigit(c[i]))
            {
                ch=ch+Character.toLowerCase(c[i]);
                
            }
        }
        String pa="";
        for(int i=ch.length()-1; i>=0;i--)
        {
           pa=pa+ch.charAt(i); 
        }
        if(pa.equals(ch))
        {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
        
        
    }
}
