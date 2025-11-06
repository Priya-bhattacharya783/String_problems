The United Nations Organization released an official document regarding the most important events from the beginning of time (dated 00-00-0000) with a brief  description of the events.
The date of all the events is mentioned in the ‘DD-MM- YYYY’ format.  Find the total number of distinct years referenced in the document.  
Input Format  String containing the content of the document. Constraints  The dates are in the format 'DD-MM-YYYY'.
The input is a single string containing the document text. We need to extract and count unique years from this string. 
Output Format  Return the total number of distinct years referenced in the document. Sample Input 0  UN was established on 24-10-1945. 
India got freedom on 15-08-1947. Sample Output 0  2 Explanation 0  2 distinct years, 1945 and 1947 have been referenced.
Sample Input 1  Soon after the World War 2 ended on 02-09-1945, the UN was established on 24-10-1945.
Sample Output 1  1 Explanation 1  Only 1 distinct year, i,e; 1945 has been referenced.

==================================================================================================================================================================================================

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */           Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        Pattern p = Pattern.compile("\\d{2}-\\d{2}-(\\d{4})");
        Matcher m = p.matcher(text);

        HashSet<String> years = new HashSet<>();

        while (m.find()) {
            years.add(m.group(1));
        }

        
        System.out.println(years.size());
    }
}
    
