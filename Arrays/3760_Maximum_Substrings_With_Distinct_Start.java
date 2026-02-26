import java.util.HashSet;
class 3760_Maximum_Substrings_With_Distinct_Start {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        for(int i = 0; i<n ; i++){
            set.add( s.charAt(i) );
        }
        return set.size();        
    }
}
