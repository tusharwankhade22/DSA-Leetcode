class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;

        int unique = 0;

        for(int i=1;i<n;i++){
            if(nums[unique] != nums[i]){
                unique++;
                nums[unique] = nums[i];
            }
        }

        return unique+1;
    }
}