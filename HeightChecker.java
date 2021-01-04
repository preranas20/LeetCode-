//Height Checker
/*Students are asked to stand in non-decreasing order of heights for an annual photo.

Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.

Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.

 

Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
Current array : [1,1,4,2,1,3]
Target array  : [1,1,1,2,3,4]
On index 2 (0-based) we have 4 vs 1 so we have to move this student.
On index 4 (0-based) we have 1 vs 3 so we have to move this student.
On index 5 (0-based) we have 3 vs 4 so we have to move this student.
Example 2:

Input: heights = [5,1,2,3,4]
Output: 5
Example 3:

Input: heights = [1,2,3,4,5]
Output: 0
 

Constraints:

1 <= heights.length <= 100
1 <= heights[i] <= 100

*/


class Solution {
    public int heightChecker(int[] heights) {
        int[] heightsFreq = new int[101];
        
        for(int height: heights){
            //collect frequency of each height in the array
            heightsFreq[height]++;
        }
        
       // 0,0,0,0,0,0   idx =4
       // 1,1,4,2,1,3    i=5   res==3
        int index =0;
        int result =0;
        //compare heights array to the frequency array
        for(int i=0;i<heights.length;i++){
            //the pointer should not move to the next element unless the current element goes to 0
            while(heightsFreq[index] == 0)
                 index++;
            
            //if the value in heights array is not equal to the index element in heightFreq array, this means the position of that number is not at right place and will move
             if(heights[i] != index)
                 result++;
                
            //if frequency array element is equal to heights array, remove the frequency 
            //OR even if it has to check the next element as the earlier one was not matching
                heightsFreq[index]--;
        }
        
        return result;
    }
}