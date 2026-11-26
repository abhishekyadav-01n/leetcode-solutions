class Solution { // bidirectional bfs
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);

        if(!set.contains(endWord)) return 0;

        HashSet<String> beginSet = new HashSet<>();
        HashSet<String> endSet = new HashSet<>();

        beginSet.add(beginWord);
        endSet.add(endWord);
        set.remove(beginWord);
        set.remove(endWord);

        int ans = 1;

        while(!beginSet.isEmpty() && !endSet.isEmpty()){
            if(beginSet.size() > endSet.size()){
                HashSet<String> temp = beginSet;
                beginSet = endSet;
                endSet = temp;
            }

            HashSet<String> nextLevel = new HashSet<>();

            for(String word : beginSet){
                
                char arr[] = word.toCharArray();

                for(int i = 0; i<arr.length ; i++){
                    char original = arr[i];

                    for(char ch = 'a' ;ch<='z' ; ch++){
                        arr[i] = ch;

                        String newWord = new String(arr);
                        if(endSet.contains(newWord)){
                            return ans+1;
                        }

                        if(set.contains(newWord)){
                            nextLevel.add(newWord);
                            set.remove(newWord);
                        }
                    }
                    arr[i] = original;
                }
            }
            ans++;
            beginSet = nextLevel;
        }
        return 0;
    }
}