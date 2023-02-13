import java.util.*;
class MergeLinkedLists{
    static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node temp1=new Node(sc.nextInt());
        Node head1=temp1;
        for(int i=1;i<n;i++){
            temp1.next=new Node(sc.nextInt());
            temp1=temp1.next;
        }
        int m=sc.nextInt();
        Node temp2=new Node(sc.nextInt());
        Node head2=temp2;
        for(int i=1;i<m;i++){
            temp2.next=new Node(sc.nextInt());
            temp2=temp2.next;
        }
        ArrayList<Integer> al=new ArrayList<>();
        while(head1!=null){
            al.add(head1.data);
            head1=head1.next;
        }
        while(head2!=null){
            al.add(head2.data);
            head2=head2.next;
        }
        Collections.sort(al);
        Node temp=new Node(al.get(0));
        Node head=temp;
        for(int i=1;i<al.size();i++){
            temp.next=new Node(al.get(i));
            temp=temp.next;
        }
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}