class Solution {
    public String longestCommonPrefix(String[] strs) {
        int maxLen = 201;
        for (int i=0; i<strs.length; i++) {
            if (strs[i].length() < maxLen) {
                maxLen = strs[i].length();
            }
        }
        String p = "";
        top_break:
        for (int i=0; i<maxLen; i++) {
            for (int j=1; j<strs.length; j++) {
                if (strs[0].charAt(i) != (strs[j].charAt(i))) {
                    break top_break;
                }
            }
            p = p + strs[0].charAt(i);
        }
        return p;
    }
}
