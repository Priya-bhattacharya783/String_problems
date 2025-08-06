import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character, Integer> map = new TreeMap<>();
        for (char c: s.toCharArray()) {
        
            c = Character.toLowerCase(c);
            if (Character.isLetterOrDigit(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
    }
}
