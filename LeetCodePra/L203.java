public class L203 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        class Solution {
            public ListNode removeElements(ListNode head, int val) {
                if (head == null) {
                    return head;
                }
                ListNode dummy = new ListNode(-1, head);
                ListNode pre = dummy;
                ListNode cur = head;
                while (cur!= null){
                    if(cur.val==val){
                        pre.next=cur.next;
                    }else {
                        pre=cur;
                    }
                    cur=cur.next;
                }
                return dummy.next;


            }
        }
    }
}
