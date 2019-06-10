/*
# interviewBit

Write a function to find the longest common prefix string amongst an array of strings.

Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".

Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.

Example:

Given the array as:

[

  "abcdefgh",

  "aefghijk",

  "abcefgh"
]
The answer would be “a”.

*/

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        int mil = A.get(0).length();
        for(int i=1;i<A.size();i++){
            if(A.get(i).length()<mil){
                mil = A.get(i).length();
            }
        }
        
        String result = "";
        char current;
        for(int i=0;i<mil;i++){
            current=A.get(0).charAt(i);
            for(int j=0;j<A.size();j++){
                if(A.get(j).charAt(i)!=current){
                    return result;
                }
            }
            result = result + current; 
        }
        return result;
    }
}
