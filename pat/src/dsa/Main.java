package dsa;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {}
    
    TreeNode(int val) { 
        this.val = val; 
    }
    
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    TreeNode prev = null;
    
    public boolean isValidBST(TreeNode root) {
        return inord(root);
    }
    
    private boolean inord(TreeNode r){
        if(r == null) return true;
        
        if (!inord(r.left)) {
            return false; 
        }
        
        if (prev != null && prev.val >= r.val) {
            return false;
        }
        
        prev = r;
        
        return inord(r.right);
    }
}

public class Main {
    public static void main(String[] args) {
        
        
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);

        // We create a new Solution object so the 'prev' pointer resets to null
        Solution sol2 = new Solution(); 
        boolean result2 = sol2.isValidBST(root2);
        System.out.println("Tree 2 is valid BST: " + result2);
    }
}