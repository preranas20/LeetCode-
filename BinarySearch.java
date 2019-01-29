class Solution {
    public int search(int[] nums, int target) {
        int middle=0;
        int first = 0;
        int last = nums.length-1;
        
        
        while(first<last){
             middle = (first+last)/2;
            if(nums[middle]==target)
                return middle;
            if(nums[middle]>target)
                last=middle;
            else
                first=middle+1;
        }
        
          if(first==last){
            if(nums[first]==target)
                return first; 
        }
        
        return -1;
    }
}