class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ns=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ns[indices[i]]=s.charAt(i);
        }
        String news=new String(ns);
        return news;
    }
}
