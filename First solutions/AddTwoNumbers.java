public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode num1p3 = new ListNode(3);
        ListNode num1p2 = new ListNode(4, num1p3);
        ListNode num1p1 = new ListNode(2, num1p2);

        ListNode num2p3 = new ListNode(4);
        ListNode num2p2 = new ListNode(6, num2p3);
        ListNode num2p1 = new ListNode(5, num2p2);

        ListNode ans = addTwoNumbers(num1p1, num2p1);

        ListNode current = ans;

        while (current != null) {
            System.out.println(current.val);
            current = current.next;

        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode toReturn = new ListNode(0);
        ListNode current = toReturn;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = 0;
            int val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
            }
            if (l2 != null) {
                val2 = l2.val;
            }

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            ListNode newNum = new ListNode(sum);
            current.next = newNum;
            System.out.println(current.next.val + " was added to the number");
            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return toReturn.next;
    }
}