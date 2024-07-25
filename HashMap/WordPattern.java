// Given a pattern and a string s, find if s follows the same pattern.
// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();
        String s1[] = s.split(" ");
        if(pattern.length() != s1.length){
            return false;
        }
        for(int i=0; i<pattern.length();i++){
            char c = pattern.charAt(i);
            String st = s1[i];
            if(!hm.containsKey(c)){
                if(hm.containsValue(st)){
                    return false;
                }
                hm.put(c, st);
            }
            else if(!hm.get(c).equals(st)){
                return false;
            }
        }
        return true;
    }
}
