public class Subtree extends BinaryTree{
    
    // Firstly find node matching with subroot and then find if they are identical
    public boolean isSubtree(Node root, Node subroot){
        if (root == null){
            return false;
        }
        
        if (root.data == subroot.data){ // root node matches subroot
            return isIdentical(root, subroot);
        } else { // check if left or right subtree matches subroot
            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }
    }


    public boolean isIdentical(Node node, Node subroot){
        if (node == null && subroot == null){
            return true;
        } else if (node == null || subroot == null || node.data != subroot.data){
            return false; // only one of the trees is empty or node data doesn't match subroot data
        }

        // if node is identical move to left & right
        if (!isIdentical(node.left, subroot.left)){
            return false; 
        }

        if (!isIdentical(node.right, subroot.right)){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // Object of subtree class and not BinaryTree so that obj can access isSubtree and isIdentical methods
        Subtree tree = new Subtree();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        root.right = tree.new Node(3);
        root.right.right = tree.new Node(6);

        Subtree subtree = new Subtree();
        Node subroot = subtree.new Node(2);
        subroot.left = subtree.new Node(4);
        subroot.right = subtree.new Node(5);
        subroot.right.right = subtree.new Node(9);
        System.out.println("Is subtree? " + tree.isSubtree(root, subroot));
    }
}
