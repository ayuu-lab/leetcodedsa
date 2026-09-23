class Solution {
    public void func(String s, HashMap<Character, String> map, int i, List<String> ans, String digits) {
        if (i == digits.length()) {
            ans.add(s);
            return;
        }

        String temp = map.get(digits.charAt(i));
        for (int si = 0; si < temp.length(); si++) {
            s += temp.charAt(si);
            func(s, map, i + 1, ans, digits);
            s = s.substring(0, s.length() - 1);
        }

    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        func("", map, 0, ans, digits);
        return ans;

    }
}