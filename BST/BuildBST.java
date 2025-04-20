public class BuildBST {
    public static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int arr[], int i) {
        Node newnode = new Node(arr[i]);
        if (root == null) {
            root = newnode;
            return root;
        }

        if (root.data > newnode.data) {
            root.left = insert(root.left, arr, i);
        } else {
            root.right = insert(root.right, arr, i);
        }
        return root;
    }

    public static boolean searchInBST(Node root, int key){
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return searchInBST(root.left, key);
        } else {
            return searchInBST(root.right, key);
        }
    }

    public static void inorder(Node root){
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {5,1,3,4,2,7};
        Node root = null;
        for (int i = 0; i < arr.length; i++){
            root = insert(root, arr, i);
        }
        //inorder(root);
        System.out.println(searchInBST(root, 3));

    }
}