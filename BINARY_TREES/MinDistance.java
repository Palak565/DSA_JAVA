public class MinDistance extends LowestCommonAncestor{
    public static int distFromLCA (Node lca, int n) {
        if (lca == null) {
            return -1;
        }

        if (lca.data == n) {
            return 0;
        }

        int leftdist = distFromLCA(lca.left, n);
        int rightdist = distFromLCA(lca.right, n);
        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }
        return Math.max(leftdist, rightdist) + 1;
    }

    public static int minDist (Node root, int n1, int n2) {
        if (root == null) {
            return -1;
        }

        Node lca = lca2(root, n1, n2);
        int dist1 = distFromLCA(lca, n1);
        int dist2 = distFromLCA(lca, n2);
        return dist1 + dist2;
    }

    public static void main(String[] args) {
        MinDistance tree = new MinDistance();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        root.right.left = tree.new Node(6);
        root.right.right = tree.new Node(7);
        System.out.println(minDist(root, 4, 5));
    }
}
