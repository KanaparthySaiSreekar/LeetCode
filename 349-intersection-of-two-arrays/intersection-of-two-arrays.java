class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(!arr.contains(nums1[i])){
                        arr.add(nums1[i]);
                    }
                }
            }
        }
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        
        return result;
        
    }
}