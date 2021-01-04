//Palindrome Permutation
/*
Given a string, determine if a permutation of the string could form a palindrome.

Example 1:

Input: "code"
Output: false
Example 2:

Input: "aab"
Output: true
Example 3:

Input: "carerac"
Output: true
*/

class Solution {
    public boolean canPermutePalindrome(String s) {
        
        int len = s.length();
        if(s.equals("")||len == 0)
            return false;
        
       //Set is used to find the uniqure characters being used in the string 
       Set<Character> set = new HashSet<Character>();
        
       for(int i=0;i<len;i++){
           
           char c = s.charAt(i);
           
           //if character at this index is already in set, remove the character so that we know that the frequencey of character has been even now
           if(!set.add(c))
                set.remove(c);  
           else
               set.add(c);
       }  
       
         
      //For even number of string length, there would always be either 0 characters with odd frequency or more than 2. For odd Number of string length, there would always be atleast 1 odd frequency character.
       return set.size()<2;
        
        
        
    }
}