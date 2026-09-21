class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<num.length() ; i++){
            int n = num.charAt(i) - '0';
            while(!stack.isEmpty() && stack.peek() > n && k > 0){
                k--;
                stack.pop();
            }
            stack.push(n);
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