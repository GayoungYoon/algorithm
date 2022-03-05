/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int depth =0;
    
    public int maxDepth(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        if(root !=null){
            root.val =1;
            q.add(root);
        }
        
        while(!q.isEmpty()){
            TreeNode rt = q.remove();
            TreeNode ln = rt.left;
            TreeNode rn = rt.right;
            if(ln!=null) {
                ln.val = rt.val +1 ;
                q.add(ln);
            }
            if(rn !=null){
                rn.val = rt.val +1;
                q.add(rn);
            }
            
            if(rn==null && ln==null) this.depth = rt.val;
            
        }

        return this.depth;
    }
}
