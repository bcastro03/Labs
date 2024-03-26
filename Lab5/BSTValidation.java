
public class BSTValidation {

	TreeNode root;

	public boolean isValidBST(TreeNode root) {

		int boundary = 8;

		if (root.left.val > boundary) {
			return false;
		}

		if (root.right.val < boundary) {
			return false;
		}

		else return true;

	}

	public static void main(String[] args) {

		BSTValidation tree = new BSTValidation();

		tree.root = new TreeNode(12);

		tree.root.left = new TreeNode(8);

		tree.root.right = new TreeNode(15);
 
	    boolean result = tree.isValidBST(tree.root);

		System.out.print(result);

	}

}