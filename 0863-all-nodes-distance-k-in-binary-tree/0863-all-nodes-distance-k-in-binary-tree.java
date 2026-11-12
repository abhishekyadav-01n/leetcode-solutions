/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private void buildParent(TreeNode root , TreeNode p , Map<TreeNode , TreeNode> parent){
        if(root == null) return;
        parent.put(root , p);

        buildParent(root.left , root , parent);
        buildParent(root.right , root , parent);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        buildParent(root , null , parent);

        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        q.offer(target);
        visited.add(target);

        int distance = 0;

        while(!q.isEmpty()){
            int size = q.size();

            if(distance == k){
                List<Integer> ans = new ArrayList<>();
                while(!q.isEmpty()){
                    ans.add(q.poll().val);
                }
                return ans;
            }

            for(int i = 0; i<size ; i++){
                TreeNode curr = q.poll();

                if(curr.left != null && !visited.contains(curr.left)){
                    q.offer(curr.left);
                    visited.add(curr.left);
                }
                if(curr.right != null && !visited.contains(curr.right)){
                    q.offer(curr.right);
                    visited.add(curr.right);
                }

                TreeNode p = parent.get(curr);
                if(p != null && !visited.contains(p)){
                    q.offer(p);
                    visited.add(p);
                }
            }
            distance++;
        }
        return new ArrayList<>();
    }
}