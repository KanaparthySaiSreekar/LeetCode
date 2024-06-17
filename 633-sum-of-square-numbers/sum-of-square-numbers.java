import java.lang.Math;

class Solution {
    public boolean judgeSquareSum(int c) {
        long r = (int) Math.sqrt(c);
        long l = 0;
        
        boolean flag = false;

        while(l<=r){
            long sum=(l*l + r*r);
            if(sum==c){
                flag=true;
                break;
            }
            else if(sum<c){
                l++;
            }
            else{
                r--;
            }
            
        }
        



        
        return flag;



    }
}