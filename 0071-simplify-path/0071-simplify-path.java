class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        String paths[] = path.split("/");

        for(String part : paths){
            if(part.equals(".") || part.equals("")) continue;

            if(part.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(part);
            }
        }

        return "/" + String.join("/" ,stack);
    }
}