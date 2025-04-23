public class DeleteLeavesWithVal extends BinaryTree {
    public static Node deleteLeaves(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null && root.data == key){
            return null;
        }

        root.left = deleteLeaves(root.left, key);
        root.right = deleteLeaves(root.right, key);
        return root;
    }

    public static boolean countLeavesWithVal(Node root, int key){
        if (root == null){
            return false;
        }

        if (root.left == null && root.right == null && root.data == key){
            return true;
        }

        return countLeavesWithVal(root.left, key) || countLeavesWithVal(root.right, key);
    }

    public static void main(String[] args) {
        DeleteLeavesWithVal tree = new DeleteLeavesWithVal();
        Node root = tree.new Node(1);
        root.left = tree.new Node(3);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(3);
        root.left.right = tree.new Node(2);
        root.right.left = tree.new Node(3);

        while (countLeavesWithVal(root, 3)) {
            root = deleteLeaves(root, 3);
        }
        
        tree.inorder(root);
    }
}
