public class KthAncestor extends BinaryTree{
    public static int getKthAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftdist = getKthAncestor(root.left, n, k);
        int rightdist = getKthAncestor(root.right, n, k);
        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }

        int max = Math.max(leftdist, rightdist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static void main(String[] args) {
        KthAncestor tree = new KthAncestor();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        root.right.left = tree.new Node(6);
        root.right.right = tree.new Node(7);
        getKthAncestor(root, 4, 2);
    }
}
