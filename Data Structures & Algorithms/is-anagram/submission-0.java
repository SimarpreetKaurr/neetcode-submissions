class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;

        }
        Map<Character,Integer> m1 = new HashMap<>();
        //Map<Character,Integer> m2 = new HashMap<>();

        for(char c: s.toCharArray()){
            m1.put(c,m1.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            m1.put(c,m1.getOrDefault(c,0)-1);
            if(m1.get(c)<0){
                return false;
            }

        }
        //return m1.equals(m2);
        return true;
    }
}
