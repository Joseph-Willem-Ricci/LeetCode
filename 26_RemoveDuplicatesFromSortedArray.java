class Solution {
    public int removeDuplicates(int[] nums) {
        int i = nums.length-1;
        int count = 0;
        while (i > 0) {
            if (nums[i] == nums[i-1]) {
                nums[i] = 101;
                count++;
                int j=i;
                while (j<nums.length-1 && nums[j+1] != 101) {
                    nums[j] = nums[j+1];
                    nums[j+1] = 101;
                    j++;
                }
            }
            i--;
        }
        int k = nums.length-count;
        return k;
    }
}
