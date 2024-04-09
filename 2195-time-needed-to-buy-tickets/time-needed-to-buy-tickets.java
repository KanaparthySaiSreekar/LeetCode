class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int total = 0;

        for (int i = 0; i < tickets.length; i++) {
            if(i<=k){
                total=total+Math.min(tickets[i],tickets[k]);
            }
            else{
                if(tickets[i]>=tickets[k]){
                    total=total+tickets[k]-1;
                }
                else{
                    total=total+tickets[i];
                }
            }
        }

        return total;
    }
}