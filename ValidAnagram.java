//Valid Anagram
/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?

*/

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()  != t.length())
            return false;
        
       //To count frequency of each character in the string
       int[] charFrequency = new int[26];
        
        //Increment the fequency by 1 if character is present in s, 
        //Decement the frequency by 1 if charater is present in t
        for(int i=0;i<s.length();i++){
           charFrequency[s.charAt(i) - 'a']++;
           charFrequency[t.charAt(i) - 'a']--;     
        }
        
        for(int idx: charFrequency){
            if(idx!=0)
                return false;
        }
        
        return true;
    }
}