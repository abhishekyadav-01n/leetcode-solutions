/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if(root == null) return sb.toString();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        sb.append(root.val);
        sb.append(",");

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i<size ; i++){
                TreeNode node = q.poll();

                if(node.left != null){
                    q.add(node.left);
                    sb.append(node.left.val);
                    sb.append(",");
                }
                else{
                    sb.append("null");
                    sb.append(",");
                }
                if(node.right != null){
                    q.add(node.right);
                    sb.append(node.right.val);
                    sb.append(",");
                }
                else{
                    sb.append("null");
                    sb.append(",");
                }
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;
        String arr[] = data.split(",");

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int idx = 1;

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i<size ; i++){
                TreeNode node = q.poll();

                if(idx < arr.length && !arr[idx].equals("null")){
                    TreeNode newNode = new TreeNode(Integer.parseInt(arr[idx]));
                    q.add(newNode);
                    node.left = newNode;
                }
                idx++;
                
                if(idx < arr.length && !arr[idx].equals("null")){
                    TreeNode newNode = new TreeNode(Integer.parseInt(arr[idx]));
                    q.add(newNode);
                    node.right = newNode;
                }
                idx++;
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));