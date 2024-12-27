public class Palindrome extends BasicLinkedList {
    public static boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; 
        }
    
        // Find midNode
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
    
        // Reverse 2nd half
        Node prev = null, curr = mid;
        while (curr != null) {
            Node nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
    
        Node right = prev, left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    } 

    public static void main(String[] args) {
        BasicLinkedList ll = new BasicLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        System.out.println(isPalindrome()); // true
        ll.addLast(6);
        System.out.println(isPalindrome()); // false
    }
}
