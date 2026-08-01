class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet();
        int n=s.length();
        int ans=0;
        int l=0;
        if(n==0||n==1)return n;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            //System.out.println(set);
            set.add(c);
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}
