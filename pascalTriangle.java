//Pascals Triangle

/*Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/



class Solution {
    public List<List<Integer>> generate(int numRows) {
        
         int n = numRows;
        int m = n*(n+1)/2;
        
        List<List<Integer>> topList = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++){
            //for each innner list
            int[] secondArr = new int[i+1];
            secondArr[0]=1;
            if(secondArr.length == 2)
                secondArr[1]=1;
            if(secondArr.length>2){ 
            	secondArr[i]=1; //of length of list is more than 2, first and end element should be 1
                for(int j=1;j<secondArr.length-1;j++){
                    List<Integer> numList = topList.get(i-1); //fetch the previous list
                    int sum = numList.get(j-1)+numList.get(j); //fetch the previous element and the current indexed element of the previous list
                    secondArr[j]=sum;
                }
            }
            List<Integer> secondList = new ArrayList<Integer>();
            //convert array to list
            for(int num:secondArr) {
            	secondList.add(num);
            }
            
            topList.add(i,secondList);
        }
        return topList;

    }
}