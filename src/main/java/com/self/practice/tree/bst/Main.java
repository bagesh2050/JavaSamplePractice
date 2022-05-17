package com.self.practice.tree.bst;

public class Main {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insert(null, 4);
		bst.setRoot(root);
		bst.insert(root, 2);
		bst.insert(root, 1);
		bst.insert(root, 3);
		bst.insert(root, 6);
		bst.insert(root, 5);
		bst.insert(root, 7);
		

		bst.printInOrder(bst.getRoot());

		CheckValidBSTRecursiveSingleVariable bstValid = new CheckValidBSTRecursiveSingleVariable();
		System.out.println(bstValid.checkValidBST(bst.getRoot()));
	}
}
