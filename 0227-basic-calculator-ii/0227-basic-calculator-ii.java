class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();

        char operation = '+';
        int result = 0;
        int num = 0;

        for(int i = 0; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                num = num * 10 + ch - '0';
            }

            if ((!Character.isDigit(ch) && ch != ' ') || (i == s.length()-1)){
                if(operation == '+'){
                    stack.push(num);
                }
                else if(operation == '-'){
                    stack.push(-num);
                }
                else if(operation == '*'){
                    int prevNum = stack.pop();
                    stack.push(prevNum * num);
                }
                else if(operation == '/'){
                    int prevNum = stack.pop();
                    stack.push(prevNum / num);
                }
                operation = ch;
                num = 0;
            }
        }
        while(!stack.isEmpty()){
            result += stack.pop();
        }

        return result;
    }
}