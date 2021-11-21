//could make more efficient by merging the for loop iterating over k into the for loop iterating over i

class Solution {
    public boolean isValid(String s) {
        char[] chars = new char[]{'(','{','[',')','}',']'};
            //                     0   1   2   3   4   5
        ArrayList<Character> opened = new ArrayList<Character>();
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            for (int j=0; j<=2; j++) {
                if (s.charAt(i) == chars[j]) {
                    opened.add(chars[j]);
                }
            }
            for (int k=3; k<=5; k++) {
                if ((opened.size()>0) && 
                    (s.charAt(i) == chars[k]) &&
                    (chars[k-3] == opened.get(opened.size()-1))) {
                    opened.remove(opened.size()-1);
                    count--;
                }
                if (s.charAt(i) == chars[k]) {
                    count++;
                }
            }
        }
        if ((opened.size() == 0) && (count == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
