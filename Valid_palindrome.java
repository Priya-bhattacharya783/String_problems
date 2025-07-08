import java.io.*;
import java.util.*;

public class Valid_palindrome {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        String s1=s.toLowerCase().replaceAll("[^\\p{Alnum}]","");
        
        String s2="";
        
        for(int i=s1.length()-1;i>=0;i--)
        {
            char ch=s1.charAt(i);
            s2+=ch;
        }
        if(s1.equals(s2))
        {
            System.out.print("true") ;
        }
        else{
            System.out.print("false") ;
        }
    }
}
