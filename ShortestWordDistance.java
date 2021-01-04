//Shortest Word Distance

/*
Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.

Example:
Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

Input: word1 = “coding”, word2 = “practice”
Output: 3
Input: word1 = "makes", word2 = "coding"
Output: 1
Note:
You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.

*/


class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        
        int indexA = -1;
        int indexB = -1;
        int minDistance = words.length;
        int distance = words.length;
        
        /*["practice", "makes", "perfect", "coding", "makes"]
         coding practice
        ["a","c","b","a"]
        "b"
         "a"
        */
    
        for(int i= 0;i<words.length;i++){
            if(word1.equals(words[i]))
                indexA = i; //2
                
            
            
            if(word2.equals(words[i]))
                indexB = i; //3      
            
            
           
            if(indexA != -1 && indexB != -1)
                distance = Math.abs(indexA-indexB);
                
            
            if(distance<minDistance)
                minDistance = distance; //1
        }
        
        
        return minDistance;
    }
}