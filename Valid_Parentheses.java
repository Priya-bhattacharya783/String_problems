import java.io.*;
import java.util.*;

public class Valid_Parentheses {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        int count=0;
        for(int i=0;i<c.length-1;i++)
        {
            if(c[i]=='(' && c[i+1]==')')
            {
                count=1;
            }
            if(c[i]=='{' && c[i+1]=='}')
            {
                count=1;
            }
            if(c[i]=='[' && c[i+1]==']')
            {
                count=1;
            }
        }
        if(count==0)
        {
            System.out.print("false");
        }
        else{
             System.out.print("true");
        }
    }
}
