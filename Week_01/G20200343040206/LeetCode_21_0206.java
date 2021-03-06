//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
// 示例：
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
//
// Related Topics 链表


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class LeetCode_21_0206 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }

//    public static void main(String[] args) {
//
//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(3);
//        ListNode l2 = new ListNode(2);
//        l2.next = new ListNode(4);
//
//        LeetCode_21_0206 source = new LeetCode_21_0206();
////        ListNode result = source.mergeTwoLists(l1, l2);
////        ListNode result = source.mergeTwoLists(null, l2);
//        ListNode result = source.mergeTwoLists(l1, null);
//        do {
//            System.out.println(result.val);
//            result = result.next;
//        } while (result != null);
//
//    }
}

