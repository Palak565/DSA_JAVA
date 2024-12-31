import java.util.*;
import java.util.LinkedList;

public class BinaryTree {
    public class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;
    public Node buildPreorder(int[] nodes){
        idx++;
        if (idx == nodes.length || nodes[idx] == -1){
            return null;
        }

        Node newnode = new Node(nodes[idx]);
        newnode.left = buildPreorder(nodes);
        newnode.right = buildPreorder(nodes);
        return newnode;
    }

    public void preorder(Node root){
        if (root == null){
            System.out.print(-1 + " ");
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root){
        if (root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void postorder(Node root){
        if (root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public void levelorder(Node root){
        if (root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null){
                    q.add(currNode.left);
                }
                
                if (currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public int findHeight(Node root){
        if (root == null){
            return 0;
        }

        int lh = findHeight(root.left);
        int rh = findHeight(root.right);

        return Math.max(lh, rh) + 1;
    }

    public int countNodes(Node root){
        if (root == null){
            return 0;
        }

        int lnodes = countNodes(root.left);
        int rnodes = countNodes(root.right);
        return lnodes + rnodes + 1;
    }

    public int sumOfNodes(Node root){
        if (root == null){
            return 0;
        }

        int lsum = sumOfNodes(root.left);
        int rsum = sumOfNodes(root.right);
        return lsum + rsum + root.data;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildPreorder(nodes);
        System.out.println(root.data);
        //tree.preorder(root);
        //tree.inorder(root);
        //tree.postorder(root);
        //tree.levelorder(root);
        //System.out.println("Height of tree = " + tree.findHeight(root));
        //System.out.println("Total nodes = " + tree.countNodes(root));
        System.out.println("Sum of nodes = " + tree.sumOfNodes(root));
    }
}
