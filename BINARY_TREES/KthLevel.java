import java.util.*;
import java.util.LinkedList;

public class KthLevel extends BinaryTree{
    public void kthlevel(Node root, int level, int k){
        if (root == null){
            return;
        }

        if (level == k){
            System.out.print(root.data + " ");
            return;
        }

        kthlevel(root.left, level+1, k);
        kthlevel(root.right, level+1, k);
    }

    public void kthlevel2 (Node root, int k){
        if (k == 1) {
            System.out.print(root.data);
            return;
        }
        Queue<Node> q = new LinkedList<>();
        int level = 1;

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null){
                level++;
                if (q.isEmpty()){
                    break;
                } else {
                    if (level == k){
                        while (q.peek() != null) {
                            System.out.print(q.poll().data + " ");
                        }
                        return;
                    }
                    q.add(null);
                }
            } else {
                if (curr.left != null){
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        KthLevel tree = new KthLevel();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        root.right.left = tree.new Node(6);
        root.right.right = tree.new Node(7);

        tree.kthlevel2(root, 1);
    }
}
