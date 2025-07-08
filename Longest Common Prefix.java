import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String []s=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextLine();
        }
        Arrays.sort(s); // Sort the strings lexicographically

        String first = s[0];
        String last = s[s.length - 1];

        int minLength = Math.min(first.length(), last.length());
        int i = 0;

        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }
       
        System.out.print(first.substring(0,i));
        
        
    }
}
