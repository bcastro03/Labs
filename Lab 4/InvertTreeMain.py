class TreeNode(object):

     def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right

class InvertTreeMain:
    def invertTree(self, root):
        if root is None:
            return None
        
        left = self.invertTree(root.left)
        right = self.invertTree(root.right)
        
        root.left = right
        root.right = left
        
        return root

if __name__ == "__main__":
    tree = InvertTreeMain()
    tree.root = TreeNode(12)
    tree.root.left = TreeNode(8)
    tree.root.right = TreeNode(15)
    tree.invertTree(tree.root)

    print(tree.root.left.val)
    print(tree.root.right.val)
    print(tree.root.val)