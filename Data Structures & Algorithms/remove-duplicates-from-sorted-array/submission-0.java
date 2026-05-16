class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        //Set<Integer> newSet = new Hashset<>();
        int l = 1;
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] != nums[r - 1]) {
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
        
    }
}