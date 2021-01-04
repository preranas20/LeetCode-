//First Unique Character in a String
/*

Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.
 

Note: You may assume the string contains only lowercase English letters.

*/


class Solution {
    public int firstUniqChar(String s) {
        
        /* Solution 1: count the frequency of each alphabet in string and check which one has frequency 1
        int[] charFrequency = new int[26];
        
        int n = s.length();
        
        for(int i=0;i<n;i++){
            charFrequency[s.charAt(i) - 'a']++;
        }
        
        for(int i=0;i<n;i++){
            if(charFrequency[s.charAt(i) - 'a'] == 1)
                return i;
        }
        
        return -1;*/
        
        /*Solution 2 - Instead of counting the frequency , count the 26 letters and and its first and last index. If the first index is not equal to -1  and  also first and last index is equal that means that character occured one time in the string. Find all such characters and check the lowest index of such characters by comparing*/
        s = s.trim();
        
        if(s == null || s.length() ==0)
            return -1;
        
        int result = Integer.MAX_VALUE;
        
        for(int i='a';i<='z';i++){
            int firstChar = s.indexOf(i);
            int lastChar = s.lastIndexOf(i);
            
            if(firstChar != -1 && firstChar ==  lastChar )
                result = Math.min(result,firstChar);
        }
        
        if(result != Integer.MAX_VALUE)
            return result;
        else
            return -1;
        
    }
}