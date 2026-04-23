class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] finalArray = new int[2];
        for(int i=0;i< nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
               if((nums[i] + nums[j]) == target){
                finalArray[0] = i;
                finalArray[1] = j;
                return finalArray;
               }
            }
        }
    return finalArray;
    }
}
