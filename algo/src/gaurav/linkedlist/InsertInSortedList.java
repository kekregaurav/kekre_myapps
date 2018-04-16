package gaurav.linkedlist;


public class InsertInSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MngLikList mLL = new MngLikList();
		mLL.insertNode(2);
		mLL.insertNode(5);
		mLL.insertNode(7);
		mLL.insertNode(10);
		mLL.insertNode(15);
		mLL.insertNode(9);
		mLL.insertNode(4);
		mLL.insertNode(16);
		//mLL.dispMLL();
		//mLL.delNode(7);
		mLL.dispMLL();
		//Node n = reverseLL(mLL.head);
		Node n = RevsKNode(mLL.head, 3);
		mLL.head = n;
		
		mLL.dispMLL();
		
	}
	
	public static Node reverseLL(Node pHead){
		
		if(pHead == null){
			return null;
		}
		
		if(pHead.next == null){
			return pHead;
		}
		
		Node curr = pHead, frwd = null;
				
		if(curr.next.next == null){
			pHead = curr.next;
			pHead.next = curr;
			curr.next = null;
			return pHead;
		}
		
		frwd = pHead.next.next;
		curr = pHead.next;
		boolean x = false;
		
		while(frwd !=null){
			curr.next = pHead;
			if(!x){
			   pHead.next = null;
			   x = true;
			}
			pHead = curr;
			curr = frwd;
			frwd = frwd.next;
			
			if(frwd == null){
				curr.next = pHead;
				pHead = curr;
			}
		}
		return pHead;
	}
	
	public static Node RevsKNode(Node pHead, final int k){
		
		if(pHead == null || pHead.next == null || pHead.next.next == null){
			return reverseLL(pHead);
		}
		
		Node pHeadNext = pHead, curr = pHead;
		int count = 0;
		
		while(pHeadNext != null){
			
			curr = pHeadNext;
			pHeadNext = pHeadNext.next;
			count ++;
			
			if(count == k){
				curr.next = null;
				pHead = reverseLL(pHead);
				curr = pHead;
				while(curr.next !=null){
					curr = curr.next;
				}
				
				curr.next = RevsKNode(pHeadNext, k);
			}
		}
		
		return pHead;
		
	}

}

class Node {
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		next = null;
	}
}

class MngLikList{
	
	Node head;
		
	public MngLikList(){
		
		head = null;
	}
	
	public void insertNode(int nd){
		
		Node node = new Node(nd);
		
		if(head == null || node.data < head.data){
			node.next = head;
			head = node;
			return;
		}
		
		Node ptrFw = head;
		Node ptrBk = null;
		
		while(ptrFw !=null ){
			
			if(node.data < ptrFw.data){
				node.next = ptrFw;
				if(ptrBk != null)
				  ptrBk.next = node;
				break;
			}else {
				ptrBk = ptrFw;
				if(ptrFw.next == null){
					ptrFw.next = node;
					break;
				}
				ptrFw = ptrFw.next;
			}
		}
	}
	
	public void delNode(int delData){
		
		Node curr = head;
		
		if(delData == curr.data){
			head = head.next;
			return;
		}
		
		while(curr.next != null){
			
			if(delData == curr.next.data){
				Node n = curr.next;
				curr.next = curr.next.next;
				n.next = null;
			}
			
			curr = curr.next;
			
		}
		
		
	}
	
	public void dispMLL(){
				
		Node n = head;
		
		System.out.print("Linked List : ");
		
		while(n != null){
			System.out.print(n.data + ", ");
			n = n.next;
		}
	}
	
}
