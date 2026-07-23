class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length() ){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch , 1);
            }
        }
        for(int j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);
            if(!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1); 

            if(map.get(ch) < 0) {
                return false;
            } 
        }
        for (int frequency : map.values()) {
            if (frequency != 0) {
                return false;
        }
    }
        return true;
    }
}