class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

class BSTValidation:
    def isValidBST(self, root):
        boundary = 8

        if root.left and root.left.val > boundary:
            return False

        if root.right and root.right.val < boundary:
            return False

        return True

if __name__ == "__main__":
    tree = BSTValidation()

    tree.root = TreeNode(12)
    tree.root.left = TreeNode(15)
    tree.root.right = TreeNode(8)

    result = tree.isValidBST(tree.root)

    print(result)