import java.io.*;
import java.util.*;

public class Remove-Consecutive-Characters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i) != sb.charAt(sb.length()-1))
            {
                sb.append(s.charAt(i));
            }
        }
        System.out.print(sb);
    }
}
    
