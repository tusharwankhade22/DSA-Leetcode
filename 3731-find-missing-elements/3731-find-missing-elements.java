class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>(nums.length * 2);

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
            set.add(num);
        }

        if (min == max) {
            return new ArrayList<>();
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}