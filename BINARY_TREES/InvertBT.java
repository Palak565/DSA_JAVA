public class InvertBT extends BinaryTree {
    public static Node invert(BinaryTree tree,Node root) {
        if (root == null){
            return null;
        }

        Node newnode = tree.new Node(root.data);
        newnode.left = invert(tree, root.right);
        newnode.right = invert(tree, root.left);
        return newnode;
    }

    public static void main(String[] args) {
        InvertBT tree = new InvertBT();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        root.right.left = tree.new Node(6);
        root.right.right = tree.new Node(7);

        Node newroot = invert(tree, root);
        System.out.println(newroot.data + " " + newroot.left.data + " " + newroot.left.right.data);
    }
}
