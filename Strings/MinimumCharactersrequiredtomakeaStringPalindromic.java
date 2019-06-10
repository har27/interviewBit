/*
You are given a string. The only operation allowed is to insert characters in the beginning of the string. How many minimum characters are needed to be inserted to make the string a palindrome string

Example:
Input: ABC
Output: 2
Input: AACECAAAA
Output: 2
*/
public class Solution {
    public String removechar(String a, int x) {  
        return a.substring(0, x);  
    }  
    public boolean ispalindromic(String a){
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public int solve(String A) {
        int count=0;
        while(!ispalindromic(A)){
            A=removechar(A,A.length()-1);
            count++;
        }
        return count;
    }
}
