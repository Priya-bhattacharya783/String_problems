import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        StringBuffer br = new StringBuffer("");
        if(s.length() == 0){
            System.out.println("0");
            System.exit(0);
        }
        
        for(int i = 0 ; i < s.length(); i++){
            if(br.indexOf(Character.toString(s.charAt(i))) == -1){
                br.append(s.charAt(i));
            }
            else{
                br.setLength(0);
                br.append(s.charAt(i));
            }
            max = Math.max(max, br.length());
        }
        System.out.println(max);
    }
}
