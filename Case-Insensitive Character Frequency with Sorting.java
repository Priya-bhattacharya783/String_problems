Examples: 

Input: s = "geeksforgeeks"
Output: g2 e4 k2 s2 f1 o1 r1

Input: str = "elephant"
Output: e2 l1 p1 h1 a1 n1 t1
=======================================
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
