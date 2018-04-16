package linked;

class Link {
	
	int val1;
	Link next;
	
	public Link (int pVal){
		val1 = pVal;
	}
}



public class LinkedList {

	Link first; 
	public static LinkedList ll = null;
    
	public void insertFirst(int pVal) {
		
		Link temp = new Link(pVal);
		temp.next = first;
		first = temp;
	}
	
	public boolean isEmpty() {
		
		return (first == null);
		
	}
	
	public Link deleteFirst() {
		
		if(isEmpty())
			return null;
		Link temp = first;
		first = temp.next;
		temp.next = null;
		return temp;
	}
	
	public void displayList() {
		
		Link curr = first;
		while (curr != null){
			System.out.println(" :- "+ curr.val1);
			curr = curr.next;
		}
	}
	
	public Link searchDelete(int pVal){
		
		Link curr = null;
		if(isEmpty())
			return null;
		
		curr = first;
		if(curr.val1 == pVal) {
			first = curr.next;
			curr.next = null;
			return curr;
		}
		
		Link temp = curr;
		curr = curr.next;
		while (curr != null){
			
			if(curr.val1 == pVal){
				temp.next = curr.next;
				curr.next = null;
				return curr;
			}
		}
		
		return curr;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ll = new LinkedList();
		System.out.println(ll.isEmpty());
		ll.insertFirst(1);
		ll.insertFirst(2);
		ll.insertFirst(3);
		ll.insertFirst(4);
		ll.insertFirst(5);
		/*ll.displayList();
		System.out.println(ll.isEmpty());
		
		Link del1 = ll.deleteFirst();
		System.out.println(" The deleted value : " + del1.val1);
		
		ll.displayList();*/

	}

}
