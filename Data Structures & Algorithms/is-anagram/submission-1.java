class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2)return false;
        boolean []vis=new boolean[n2];
        char []sh=s.toCharArray();
        char []th=t.toCharArray();
        for(int i=0;i<n1;i++){
            boolean found=false;
            for(int j=0;j<n2;j++){
                if(!vis[j] &&sh[i]==th[j]){
                    vis[j]=true;
                    found=true;
                    break;
                }
            }
            if(!found)return false;
        }
        return true;
    }
}
