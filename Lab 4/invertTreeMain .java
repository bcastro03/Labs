
public class invertTreeMain {

	TreeNode root;

	public TreeNode invertTree(TreeNode root) {

		if (root.left != null && root.right != null) {
			TreeNode left = invertTree(root.left);
			TreeNode right = invertTree(root.right);
			root.left = right;
			root.right = left;
		
		}

		return root;

	}

	public static void main(String[] args) {

		invertTreeMain tree = new invertTreeMain();
		tree.root = new TreeNode(12);
		tree.root.left = new TreeNode(8);
		tree.root.right = new TreeNode(15);
		tree.invertTree(tree.root);

		System.out.println(tree.root.left.val);
		System.out.println(tree.root.right.val);
		System.out.println(tree.root.val);
	}

}
