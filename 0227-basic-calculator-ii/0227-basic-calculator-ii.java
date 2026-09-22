class Solution {
    public int calculate(String s) {
        int result = 0;
        int last = 0;
        int num = 0;;
        char operation = '+';
        
        for(int i = 0; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                num = num * 10 + ch-'0';
            }

            if((!Character.isDigit(ch) && ch != ' ') || (i == s.length()-1) ){
                if(operation == '+'){
                    result += last;
                    last = num;
                }
                else if(operation == '-'){
                    result += last;
                    last = -num;
                }
                else if(operation == '*'){
                    last = last * num;
                }
                else if(operation == '/'){
                    last = last/num;
                }

                operation = ch;
                num = 0;
            }
        }
        return result + last;
    }
}