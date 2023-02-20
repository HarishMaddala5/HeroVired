import java.util.*;	
class ListNode
{
	int data;
	ListNode next;
	public ListNode(int data) {
    	this.data=data;
    }
}
public class CircularLinkedList {
	public static ListNode createCircularLinkedList(ArrayList<Integer> al) {
		ListNode temp=new ListNode(al.get(0));
		ListNode t=temp;
		for(int i=1;i<al.size();i++) {
			t.next=new ListNode(al.get(i));
			t=t.next;
		}
		t.next=temp;
		return temp;
	}
	public static void printCircularLinkedList(ListNode node) {
		ListNode head1=node;
    	ListNode head2=node;
    	System.out.printCircularLinkedList(head1.data+" ");
		head1=head1.next;
    	while(head1!=head2) {
    		System.out.printCircularLinkedList(head1.data+" ");
    		head1=head1.next;
    	}
    	System.out.printCircularLinkedListln();
	}
	public static ListNode addAtEnd(ListNode node,int val) {
		ListNode head1=node;
		ListNode head2=node;
		while(head1.next!=head2) {
			head1=head1.next;
		}
		head1.next=new ListNode(val);
		head1.next.next=head2;
		node=head1;
		return node;
	}
	public static ListNode addAtStart(ListNode node,int val) {
		ListNode h=new ListNode(val);
		ListNode head1=node;
		ListNode head2=node;
		h.next=head2;
		while(head1.next!=head2) {
			head1=head1.next;
		}
		head1.next=h;
		
		
		
		return node;
	}
	public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	ArrayList<Integer> al=new ArrayList<>();
    	for(int i=0;i<n;i++) {
    		al.add(sc.nextInt());
    	}
    	ListNode node=createCircularLinkedList(al);
    	printCircularLinkedList(node);
    	addAtStart(node,5);
    	printCircularLinkedList(node);
    }   
}