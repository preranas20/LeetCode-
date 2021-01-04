//Move Zeroes
/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Note:
1.You must do this in-place without making a copy of the array.
2.Minimize the total number of operations.
*/


class Solution {
    public void moveZeroes(int[] nums) {
        // 1, 3, 12 , 0, 0
        /*for(int i=0;i<nums.length;i++){ 
            if(nums[i] == 0){  
                int j = i+1;
                if(j<nums.length){
                    while(j<nums.length-1 && nums[j] == 0)
                       j++;
                int temp = nums[j]; 
                nums[j] = nums[i]; 
                nums[i] = temp;  
                }
                
                
                
            }
        }*/
        
        //Solution 2 - pass all the nonzero elements to left side using another pointer in case current pointer is not equal to 0
        int n = nums.length;
        int j=0;
        
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
               nums[j] = nums[i];
               if(i!=j)  
                  nums[i] = 0;
                j++;
            }
        }
        
       /* for(int i=j;i<n;i++)
            nums[i] = 0;*/
            
        
    }
}