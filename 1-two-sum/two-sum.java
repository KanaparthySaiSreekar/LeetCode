class Solution {
    public int[] twoSum(int[] nums, int target) {
    int[][] numsWithIndex = new int[nums.length][2];
    for (int i = 0; i < nums.length; i++) {
        numsWithIndex[i][0] = nums[i];
        numsWithIndex[i][1] = i;
    }


    Arrays.sort(numsWithIndex, Comparator.comparingInt(arr -> arr[0]));
    int left = 0, right = nums.length - 1;
    while (left < right) {
        int sum = numsWithIndex[left][0] + numsWithIndex[right][0];
        if (sum == target) {
            return new int[] {numsWithIndex[left][1], numsWithIndex[right][1]};
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }
    return new int[]{}; 
}
}