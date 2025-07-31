import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        for (int i=0;i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if(map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch,1);
        }
        TreeMap<Character, Integer> sorted = new TreeMap<>(map);

    
        for (Map.Entry<Character, Integer> entry : sorted.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ", count = " + entry.getValue());
            }
        }

    }
}
