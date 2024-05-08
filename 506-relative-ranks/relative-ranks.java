import java.util.Arrays;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(score[i]);
        }
        Collections.sort(arr); 
        ArrayList<String> result = new ArrayList<String>();
        for(int i=0;i<n;i++){
            if(score[i]==arr.get(n-1)){
                result.add("Gold Medal");
            }
            else if(score[i]==arr.get(n-2)){
                result.add("Silver Medal");
            }
            else if(score[i]==arr.get(n-3)){
                result.add("Bronze Medal");
            }
            else{
                result.add(String.valueOf(n-arr.indexOf(score[i])));
            }

        }
        return result.toArray(new String[0]);   
    }
}