package gaurav.linkedlist;
//compare two strings represented by Linked List lexicographically.

public class LexicographStrCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringLinList S1 = new StringLinList();
		StringLinList S2 = new StringLinList();
		
		S1.insertNode('g');
		S1.insertNode('a');
		S1.insertNode('u');
		
		
		S2.insertNode('g');
		S2.insertNode('a');
		S2.insertNode('u');
		S2.insertNode('r');
		
		S1.dispMLL();
		S2.dispMLL();
		
		System.out.println("Real Result "+ "gau".compareTo("gaur"));
		
		System.out.println("Test Result "+ S1.compS1S2(S2));

	}

}


class NodeCh {
	char data;
	NodeCh next;
	
	public NodeCh(char data){
		this.data = data;
		next = null;
	}
}

class StringLinList{
	
	NodeCh head;
		
	public StringLinList(){
		
		head = null;
	}
	
	public void insertNode(char nd){
		
		NodeCh node = new NodeCh(nd);
		
		if(head == null){
			node.next = head;
			head = node;
			return;
		}
		
		NodeCh ptrFw = head;
		
		
		while(ptrFw.next !=null ){
			ptrFw = ptrFw.next;
		}
		
		ptrFw.next = node;
	}
	
		
	public void dispMLL(){
				
		NodeCh n = head;
		
		System.out.print("Linked List : ");
		
		while(n != null){
			System.out.print(n.data + ", ");
			n = n.next;
		}
	}
	
	public int compS1S2(StringLinList s2){
		
		NodeCh myHead = this.head;
		NodeCh othHead = s2.head;
		
		while(myHead != null && othHead !=null){
			
			if(myHead.data > othHead.data){
				return 1;
			}else if(myHead.data < othHead.data){
				return -1;
			}
			
			myHead = myHead.next;
			othHead = othHead.next;
		}
		
		if(myHead == null && othHead !=null)
			return -1;
		
		if(myHead != null && othHead ==null)
			return 1;
		
		return 0;
	}
	
}
