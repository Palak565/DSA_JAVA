public class TransformToSumTree extends BinaryTree{
    public static int transform (Node root) {
        if (root == null) {
            return 0;
        }

        int leftchild = transform(root.left);
        int rightchild = transform(root.right);
        int data = root.data;
        int newleft = 0, newright = 0;
        if (root.left != null) {
            newleft = root.left.data;
        }
        if (root.right != null) {
            newright = root.right.data;
        }
        root.data = leftchild + newleft + rightchild + newright;
        return data;
    }

    public static void main(String[] args) {
        TransformToSumTree tree = new TransformToSumTree();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        root.right.left = tree.new Node(6);
        root.right.right = tree.new Node(7);
        transform(root);
        tree.preorder(root);
    }
}
