Write a program to find the average of digits of a number ( as integer value).

Input Format

integer value.
Constraints

The input number is a positive integer with at least one digit.
Output Format

The integer average of the digits.
Sample Input 0

1 5
Sample Output 0

3
Explanation 0

The total number of digits in 15 is 2. The sum of the digits are 6 (1 + 5 = 6). The average of digits of a number is 3 (6/2 = 3).
=====================================================================================================================================


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replaceAll("\\s+", "");

        int sum = 0, count = 0;

        for (int i=0;i<input.length();i++) {
            char ch=input.charAt(i);
            int digit = ch - '0';
            sum += digit;
            count++;
        }
        System.out.print(sum/count);
    }
}
