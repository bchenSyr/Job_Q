// Created Date: May 23, 2018
// Job_Q:
// isSymmetricBT() - Check if a given binary tree is symmetric.

package myMain;

class TreeNode {
	public int value;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(int v) {
		value = v;
		left = null;
		right = null;
	}
}

public class isSymmetricBT {
	
	public boolean isSymmetricBT(TreeNode root) {
		if(root == null) return true; // corner case
		
		// if a tree is symmetric to itself, it's a Symmetric Binary Tree
		return isSymmetricHelper(root, root); 
	}
	
	//Time Complexity: O(n)
	//Space Complexity: O(height), worst case: O(n)
	private boolean isSymmetricHelper(TreeNode left, TreeNode right) {
		
		if(left == null && right == null) return true;
		if(left == null || right == null) return false;
		if(left.value == right.value) return true;
			
		boolean first = isSymmetricHelper(left.left, right.right);
		boolean second = isSymmetricHelper(left.right, right.left);
		return first && second;
	}
}
