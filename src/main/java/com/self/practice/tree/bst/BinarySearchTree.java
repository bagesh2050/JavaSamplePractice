package com.self.practice.tree.bst;

public class BinarySearchTree {
	private Node root;

	public Node insert(Node root, int data) {
		if (root == null) {
			root = createNode(data);
			if (root == null) {
				System.out.println("Memory Error");
			} 
		} else {
			if (data < root.getData()) {
				root.setLeft(insert(root.getLeft(), data));
			} else if (data > root.getData()) {
				root.setRight(insert(root.getRight(), data));
			}
		}

		return root;
	}

	private Node createNode(int data) {
		Node temp = new Node();
		temp.setData(data);
		temp.setLeft(null);
		temp.setRight(null);
		return temp;
	}

	public void printInOrder(Node root) {
		if (root == null)
			return;

		printInOrder(root.getLeft());
		System.out.println(root.getData());
		printInOrder(root.getRight());
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
}
