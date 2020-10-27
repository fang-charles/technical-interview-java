import java.util.Stack;

public class DFSTreeTraversalIterative {
	// non-recursive java program for inorder traversal
	// https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
	/*
	 * Class containing left and right child of current node and key value
	 */
	static class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	/* Class to print the inorder traversal */
	static class BinaryTree {
		Node root;

		void inorder() {
			if (root == null)
				return;

			Stack<Node> stack = new Stack<>();
			Node current = root;

			while (current != null || stack.size() > 0) {
				while (current != null) {
					stack.push(current);
					current = current.left;
				}
				// current is null
				current = stack.pop();
				System.out.print(current.data + " ");
				current = current.right;
			}

		}

	}

	public static void main(String args[]) {
		/*
		 * Constructed binary tree is 1 / \ 2 3 / \ 4 5
		 */
		/*
		 * creating a binary tree and entering the nodes
		 */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.inorder();

		// 4 2 5 1 3
	}
}
