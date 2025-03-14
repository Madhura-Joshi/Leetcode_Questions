class Solution {
    public boolean isIsomorphic(String s, String t) {
     
        int[] indexS = new int[200]; 
        int[] indexT = new int[200]; 
       
        int len = s.length();
        if(len != t.length()) {
            return false;
        }
        for(int i = 0; i < len; i++) {
            // Check if the index of the current character in string s
            // is different from the index of the corresponding character in string t
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false; // If different, strings are not isomorphic
            }            
            indexS[s.charAt(i)] = i + 1;
            indexT[t.charAt(i)] = i + 1; 
        }
        
       
        return true;
    }
}
