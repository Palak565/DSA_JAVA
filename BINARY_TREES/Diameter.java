public class Diameter extends BinaryTree{
    public int findDiameterI(Node root){
        if (root == null){
            return 0;
        }
        int self = findHeight(root.left) + findHeight(root.right) + 1;
        int leftdia = findDiameterI(root.left);
        int rightdia = findDiameterI(root.right);

        return Math.max(self, Math.max(leftdia, rightdia));
    }

    public class Info{
        int dia, ht;
        Info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }

    public Info findDiameterII(Node root){
        if (root == null){
            return new Info(0, 0);
        }
        Info leftInfo = findDiameterII(root.left);
        Info rightInfo = findDiameterII(root.right);

        int finalDia = Math.max(leftInfo.ht + rightInfo.ht + 1, Math.max(leftInfo.dia, rightInfo.dia));
        int finalHt = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(finalDia, finalHt);
    }



    public static void main(String[] args) {
        Diameter tree = new Diameter();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        root.right = tree.new Node(3);
        root.right.right = tree.new Node(6);
        System.out.println(tree.findDiameterI(root));
        System.out.println(tree.findDiameterII(root).dia);
    }
}
