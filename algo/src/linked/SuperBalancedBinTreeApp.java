/* 
 * Write a function to see if a binary tree is "superbalanced" (a new tree property we just made up). 
 * A tree is "superbalanced" if the difference between the depths of any two leaf nodes is no greater than one.
 * Solution
 * */

package linked;

class TNode{
	int data;
	TNode nextLeft;
	TNode nextRight;
	
	public TNode(){
		data = 0;
		nextLeft = null;
		nextRight =  null;
	}
	
	public void displayNode(TNode n){
		System.out.println("My values is : "+n.data);
	}
}

class BinaTree{
	
	TNode root;
	int minDept = -1;
	int maxDepth = -1;
	boolean isSuperBal = true;
	
	public BinaTree(){
		root = null;
	}
	
	public void addTNode(int data){
		
		TNode temp = new TNode();
		temp.data = data;
		
		if(root == null){
			root = temp; 
			return;
		}
		
		TNode curr = root;
		
		while(curr.data != data){
			
			if(data > curr.data){
				
				if(curr.nextRight == null){
					curr.nextRight = temp;
					
				}
				curr = curr.nextRight;
			}else{
				
				if(curr.nextLeft == null){
					curr.nextLeft = temp;
					
				}
				curr = curr.nextLeft;
			}
		
		}
	}
	
	
	public void displayTNodeTree(TNode pRoot){
		
		if(pRoot == null)
			return;
		
		pRoot.displayNode(pRoot);
		displayTNodeTree(pRoot.nextLeft);
		displayTNodeTree(pRoot.nextRight);
		
	}
	
	
  public boolean isSupBlncTNodeTree(TNode pRoot, int pDepth){
		
		if(pRoot == null)
			return true;
		
		
		
		//find out if this is a leaf node, if yes then capture the depth
		if(pRoot.nextLeft == null && pRoot.nextRight ==  null){
			if(this.minDept == -1 || pDepth < this.minDept){
				this.minDept = pDepth;
				System.out.println("First min depth "+this.minDept + " value at first min depth "+pRoot.data);
			}
			
			if(this.maxDepth == -1 || pDepth > this.maxDepth){
				this.maxDepth = pDepth;
				System.out.println("First max depth "+this.maxDepth + " value at first max depth "+pRoot.data);
			}
			
			if(Math.abs(maxDepth - this.minDept) > 1){
				
				System.out.println(" bigger depth "+ pDepth + " value at bigger depth "+ pRoot.data);
				isSuperBal = false;
			}
		}
		
		if(this.isSuperBal){
		  isSupBlncTNodeTree(pRoot.nextLeft, (pDepth + 1));
		
		  isSupBlncTNodeTree(pRoot.nextRight, (pDepth + 1));
		}
			
		return isSuperBal;
		
	}
}



public class SuperBalancedBinTreeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaTree bT = new BinaTree();
		bT.addTNode(50);
		bT.addTNode(40);
		bT.addTNode(60);
		bT.addTNode(30);
		bT.addTNode(45);
		bT.addTNode(55);
		bT.addTNode(53);
		bT.addTNode(51);
		bT.addTNode(28);
		bT.addTNode(41);
		bT.addTNode(66);
		
		bT.displayTNodeTree(bT.root);
		
		System.out.println(bT.isSupBlncTNodeTree(bT.root, 0));

	}

}
