class Solution {
    public String reverseString(String s) {
        /*
        += for strings in loops is baaad
    
        String rev = "";
        for (int i=s.length()-1; i >= 0; i--) {
            rev+=s.charAt(i);
        }
        return rev;*/
        
        char[] str = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            str[s.length()-1 - i] = s.charAt(i);
        }
        
        return new String(str);
    }
}