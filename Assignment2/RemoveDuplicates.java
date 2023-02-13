import java.util.*;
class RemoveDuplicates{
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
        Node temp=new Node(sc.nextInt());
        Node head=temp;
        for(int i=1;i<n;i++){
            temp.next=new Node(sc.nextInt());
            temp=temp.next;
        }
        ArrayList<Integer> al=new ArrayList<>();
        while(head!=null){
            if(!al.contains(head.data))
                al.add(head.data);
            head=head.next;
        }
        Node t=new Node(al.get(0));
        Node ans=t;
        for(int i=1;i<al.size();i++){
            t.next=new Node(al.get(i));
            t=t.next;
        }
        while(ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
}