import java.util.*;
import java.util.LinkedList;

public class TopView extends BinaryTree{
    public class Info {
        Node node;
        int hd;
        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public void topview(Node root){
        // Level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        q.add(new Info(root, 0));
        q.add(null);

        int min = 0, max = 0;

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null){
                if (q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } 
            else {
                if (!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
    
                if (curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
    
                if (curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }
            
            

        for (int i = min; i <= max; i++){
            if (map.containsKey(i)){
                System.out.print(map.get(i).data + " ");
            }
        }
    }

    public static void main(String[] args) {
        TopView tree = new TopView();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        root.right = tree.new Node(3);
        root.right.right = tree.new Node(6);

        tree.topview(root);
    }
}
