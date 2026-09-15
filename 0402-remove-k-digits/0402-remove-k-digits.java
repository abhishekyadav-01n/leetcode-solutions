class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for( char digit : num.toCharArray() ){
            while(!stack.isEmpty() && k>0 && stack.peek() > digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while(k > 0){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();

        int i = 0;

        while(i < sb.length()-1 && sb.charAt(i) == '0'){
            i++;
        }
        String result = sb.substring(i);

        return sb.length() == 0 ? "0" : result;
    }
}