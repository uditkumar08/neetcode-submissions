class Solution {
    public int maxArea(int[] h) {
        int n=h.length;
        int i=0;
        int j=n-1;
        int max=0;
        int ans=0;
        while(i<j){
            max=Math.min(h[i],h[j]);
            ans=Math.max(ans,max*(j-i));
            if(h[i]<h[j]){
                i++;
            }else j--;
            
        }
        return ans;
    }
}
