package com.lalongooo.datastructures.treeheight;
public class TreeHeight {
	public static int calculateHeight(TreeNode root) {
		if (root == null) {
			return -1;
		}

		int leftHeight = calculateHeight(root.getLeftChild());
		int rightHeight = calculateHeight(root.getRightChild());

		if (leftHeight > rightHeight)
			return leftHeight + 1;
		else
			return rightHeight + 1;
	}

	public static void main(String[] args) {
		TreeNode leaf1 = new TreeNode(null, null);
		TreeNode leaf2 = new TreeNode(null, null);
		TreeNode node = new TreeNode(leaf1, null);
		TreeNode root = new TreeNode(node, leaf2);

		System.out.println(TreeHeight.calculateHeight(root));
	}
}