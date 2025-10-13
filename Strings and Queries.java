Ram is a student who often gets confused with lowercase and uppercase letters. He has decided to write an algorithm to resolve this issue. Given a string, you are required to determine whether it should be converted to all uppercase or all lowercase, depending on the count of uppercase and lowercase letters in the string.

For example,

assert fix_case("AbCdEfG") ==

"ABCDEFG"

assert fix_case("xYz") == "xyz"

assert fix_case("ABCabcXYZ") ==

"abcabcxyz"

Input Format

A strings (1 <= |s| <= 1000) consisting of both uppercase and lowercase letters.

Constraints

The length of the string 𝑠 should be at least 1 and at most 1000: 1≤∣s∣≤1000.
The string should only consist of English uppercase and lowercase letters.
Input will always contain at least one letter (no empty strings or special characters).
Output Format

Return the corrected string f the given strings has more uppercase letters than lowercase letters, retum it in all uppercase. Otherwise, return it in all lowercase.

Sample Input 0

HELLOworld
Sample Output 0

helloworld
Explanation 0

The string contains 5 uppercase and 5 lowercase letters. When the counts are equal, let's assume the function converts to lowercase.

Sample Input 1

xYz
Sample Output 1

xyz
Explanation 1

The string has 1 uppercase letters and 2 lowercase letters.

Submissions: 12
Max Score: 60
Difficulty: Medium
Rate This Challenge:

    SOLUTION
==========================================
 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch))
                l++;
            else
                c++;
        }
        if(c>l)
        {
            System.out.print(s.toUpperCase());
        }
        else{
            System.out.print(s.toLowerCase());
        }
    }
}
