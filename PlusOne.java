//Plus One
/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

*/


class Solution {
    public int[] plusOne(int[] digits) {
    
        int n = digits.length;
	        
	        
	    for(int j=n-1;j>=0;j--){
	            if(digits[j]<9){
                  digits[j]++;
                  return digits; 
            }
              
              //for numbers having 9 at the end
              digits[j]=0;
	    }
      
       //for single digit numbers
       int[] arr = new int[n+1];
       arr[0]=1;
        
        return arr;
    }
}