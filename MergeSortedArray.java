//Merge Sorted Array
/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
 

Constraints:

-10^9 <= nums1[i], nums2[i] <= 10^9
nums1.length == m + n
nums2.length == n

*/

//Time - O(n+m)
//Space - O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
       // int resultPtr = nums1.length -1;
        int ptr1 = m-1;
        int ptr2 = n-1;
        
        for(int i=nums1.length-1;i>=0;i--){
            
            //if first array pointer has reached the last element, copy the whole 2nd array
            if(ptr1<0){
                nums1[i] = nums2[ptr2];
                ptr2--;
            }//if the second array has reached the last element, let the array positions in first array be same
            else if(ptr2<0)
                break;
            else{
           //compare the values of the 2 arrays from backwards
                if(nums2[ptr2]>nums1[ptr1]){
                    nums1[i] = nums2[ptr2];
                    ptr2--;
                }else{
                    nums1[i] = nums1[ptr1];
                    ptr1--;
                }
            }
        }
     
        
        
    }
}