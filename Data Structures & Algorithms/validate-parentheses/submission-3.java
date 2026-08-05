class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        int n=s.length();
        if(n<=1)return false;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                if(s.charAt(i)=='(')stack.push(')');
                if(s.charAt(i)=='{')stack.push('}');
                if(s.charAt(i)=='[')stack.push(']');
                
            }else{
                if(stack.isEmpty())return false;
                if(!stack.isEmpty())if(s.charAt(i)!=stack.pop())return false;
            }
        }
        return stack.isEmpty();
    }
}
