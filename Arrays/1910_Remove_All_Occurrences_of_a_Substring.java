class Solution {
    public String removeOccurrences(String s, String part) {
        int n = s.length();
        while(n != 0 && s.contains(part)){
            s = s.substring(0,s.indexOf(part)) + s.substring(s.indexOf(part) + part.length());
        }
        return s;
    }
}
