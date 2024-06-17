class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==0 || x/10==0)
            return true;
        int r=0;
        int t=x;

        while(t!=0){
            int d = (int) (t%10);
            r=r*10+d;
            t/=10;
        }

        return (r==x);

        
        
    }
}