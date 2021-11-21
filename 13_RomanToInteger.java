class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> symbol = new HashMap<>();
        symbol.put('I', 1);
        symbol.put('V', 5);
        symbol.put('X', 10);
        symbol.put('L', 50);
        symbol.put('C', 100);
        symbol.put('D', 500);
        symbol.put('M', 1000);
        int val = 0;
        for (int i=0; i<s.length()-1; i++) {
            if (symbol.get(s.charAt(i)) >= symbol.get(s.charAt(i+1))) {
                val+=symbol.get(s.charAt(i));
        } else {
                val-=symbol.get(s.charAt(i));
            }
        }
        val+=symbol.get(s.charAt(s.length()-1));
        return val;
    }
}
