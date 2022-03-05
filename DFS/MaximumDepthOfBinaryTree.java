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
    
    public void dfs(TreeNode rt){
        TreeNode ln = rt.left;
        TreeNode rn = rt.right;

        if(ln==null && rn==null){
            if( this.depth < rt.val ) this.depth = rt.val;
            return;
        }else{
            if(ln!=null) {
                ln.val = rt.val +1 ;
                dfs(ln);
            }
            if(rn!=null){
                rn.val = rt.val + 1;
                dfs(rn);
            }
        }
    }
    
    public int maxDepth(TreeNode root) {
        if(root !=null){
            root.val=1;
            dfs(root);
            return this.depth;
        }else{
            return 0;
        }
    }
}
