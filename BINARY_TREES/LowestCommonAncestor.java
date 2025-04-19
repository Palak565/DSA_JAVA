import java.util.ArrayList;

public class LowestCommonAncestor extends BinaryTree{
    public Node lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++){
            if (path1.get(i) != path2.get(i)){
                break;
            }
        }

        if (i >= 1) {
            return path1.get(i-1);
        }
        return null;
    }

    public boolean getPath(Node root, int n, ArrayList<Node> path){
        if (root == null){
            return false;
        }

        path.add(root);
        if (root.data == n){
            return true;
        }

        boolean foundPathleft = getPath(root.left, n, path);
        boolean foundPathright = getPath(root.right, n, path);
        if (foundPathleft || foundPathright) {
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }

    public Node lca2 (Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = lca2 (root.left, n1, n2);
        Node rightLCA = lca2 (root.right, n1, n2);

        if (rightLCA == null) {
            return leftLCA;
        }
        if (leftLCA == null) {
            return rightLCA;
        }

        return root;
    }

    public static void main(String[] args) {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        root.right.left = tree.new Node(6);
        root.right.right = tree.new Node(7);

        System.out.println(tree.lca2(root, 4, 5).data);
    }
}
