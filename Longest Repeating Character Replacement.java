import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt(), maxFreq=0, currWindow=0, maxWindow=0, right, left=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(right=0; right<s.length(); right++){
            
            if(map.containsKey(s.charAt(right))){
                map.put(s.charAt(right), map.get(s.charAt(right)) + 1);
            } else{
                map.put(s.charAt(right), 1);
            }
            
            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));
            currWindow = right - left + 1;
            
            int changes = currWindow - maxFreq;
            if(changes>k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
                
            currWindow = right - left + 1;    
                
                
            maxWindow = Math.max(maxWindow, currWindow);
        }
        System.out.println(maxWindow);
    }
}
