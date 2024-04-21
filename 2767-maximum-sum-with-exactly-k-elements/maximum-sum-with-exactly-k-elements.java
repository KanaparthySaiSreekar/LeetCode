class Solution {
    public int maximizeSum(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        int x=Collections.max(list);
        int sum=x;
        for(int i=1;i<k;i++){
            x++;
            sum=sum+x;
        }
        return sum;
        
    }
}