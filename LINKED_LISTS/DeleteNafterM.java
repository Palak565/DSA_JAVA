public class DeleteNafterM extends BasicLinkedList{
    public Node deleteNafterM(int m, int n){
        Node temp = head;
        if (size <= m){
            return head;
        }

        while (temp != null){
            int count1 = 0, count2 = 0;
            while (temp != null && count1 < m-1){
                count1++;
                temp = temp.next;
            }
            Node curr = temp;

            while (temp != null && count2 != n){
                temp = temp.next;
                count2++;
            }
            curr.next = temp.next;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        DeleteNafterM ll = new DeleteNafterM();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);
        printLL();
        head = ll.deleteNafterM(3,2);
        printLL();
        System.out.println(tail.data);
    }
}
