// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean reverse = false;
        if(root == null){
            return new ArrayList<>();
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> output = new ArrayList<>();
        while(queue.size() > 0){
            int count = queue.size();
            List<Integer> level = new ArrayList<>(count);
             for(int i=0;i<count;i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left!=null){queue.add(node.left);}
                if(node.right!=null){queue.add(node.right);}
            }
            if(reverse){
                Collections.reverse(level);
            }
            reverse = !reverse;
            output.add(level);
        }
        return output;
    }
}
