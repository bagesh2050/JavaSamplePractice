package com.self.practice.tree.bst;

public class CheckValidBSTRecursiveSingleVariable {
	private int prev = Integer.MIN_VALUE;

	public boolean checkValidBST(Node root) {
		return isBST(root);
	}

	private boolean isBST(Node root) {
		if(root== null) 
			return true;
		
		if(!isBST(root.getLeft()))
			return false;
		if(root.getData()<prev)
			return false;
		prev = root.getData();
		return isBST(root.getRight());
	}
}
