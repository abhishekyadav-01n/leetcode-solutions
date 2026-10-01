class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean flag = false;

        for(int i = 0; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty() && ch == ')' && stack.peek() == '('){
                stack.pop();
                flag = true;
            }
            if(!stack.isEmpty() && ch == ']' && stack.peek() == '['){
                stack.pop();
                flag = true;
            }
            if(!stack.isEmpty() && ch == '}' && stack.peek() == '{'){
                stack.pop();
                flag = true;
            }
            
            if(!flag) stack.push(ch);
            flag = false;
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}