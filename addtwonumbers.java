/**
 * Need to work on linked list updates in Java, had a hell of a time working with references
 * Think a bit more about the problem before starting (in general)
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {   
        //loop through both at the same time
        int i = 0;
        ListNode sentinal = new ListNode(0);
        ListNode current = sentinal;
        
        ListNode prev = null;
        int carryValue = 0;
        int sum = 0;
        
        while (l1 != null || l2 != null) {
            sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            //apply previous carry
            sum += carryValue;
            
            //update carry & sum
            carryValue = sum / 10; //int, will be truncated
            if (sum >= 10) {
                sum = sum % 10;
            }
            
            //building new linked list
            System.out.println(sum);
            current.next = new ListNode(sum);
            current = current.next;
        }
        //handle carry over
        if (carryValue > 0) {
            current.next = new ListNode(carryValue);
        }
        
        return sentinal.next;
    }
    
    private int listNodeToInt(ListNode listNode) {
        int value = 0;
        int i = 0;
        while (listNode != null) {
            value += listNode.val * Math.pow(10,i);
            i++;
            listNode = listNode.next;
        }
        return value;
    }
    
}
