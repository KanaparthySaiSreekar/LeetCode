class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        int l=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if (i - l >k){
                hs.remove(nums[l]);
                l+=1;
            }
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        return false;

        
    }
}