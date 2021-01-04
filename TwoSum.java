//Two Sum
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 103
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int numsLen = nums.length;
        int[] result = new int[2];
       // int sum =0;
        
        /*for(int i=0;i<numsLen;i++){
            for(int j=0;j<numsLen;j++){
                if(i != j){
                  int sum = nums[i] + nums[j];
                
                  if(sum == target){
                      result[0] =i;
                      result[1] =j;
                      return result;
                  }
                     
                
                }
                   
                    
            }
        }*/
        

        //Solution 2 - Use Hashmap to store all the numbers and their array index in HashMap,
        //Check if the difference of target and the element in loop is there in the map, 
        //if not, then store it to hashmap or fetch the index of the number
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
       
        
        for(int i=0;i<numsLen;i++){
            int num = target - nums[i];
            
            if(map.containsKey(num)){
                int index = map.get(num);
                if(index != i){
                    result[0] = i;
                    result[1] = index;
                    return result;
                }
                    
            }
            map.put(nums[i],i);
        }
        
        return new int[0];
        
        
        
    }
}