package linked;

import java.util.HashMap;

class Node {
	int data;
	int nodeVal;
	int treeLevel;
	
	Node left;
	Node right;
	
	public Node(int pData, int pNdVal){
		this.data = pData;
		this.nodeVal = pNdVal;
		left = null;
		right = null;
	}
	
	public void dispNode(){
		
		//System.out.println(" Data:"+this.data + " Level:"+ this.treeLevel);
		System.out.print(this.data + ", ");
	}
}

class BinaryTree {
	Node root;
	int minDepth = 0;
	int pathMaxVal = 0;
	boolean isFullBibTree = true;
	HashMap btmVw = new HashMap();
	
	public BinaryTree (){
		 root = null;
	}
	
	public void insertNode(int pData, int pNdVal){
		
	  Node newNode = new Node(pData, pNdVal);
	  Node ptr = root;
	  
	  if(ptr == null){
		  root = newNode;
		  return; 
	  }
	  
	  
	  while (ptr != null){
		  
		  if(newNode.data < ptr.data){
			  
			  if(ptr.left == null){
				 newNode.treeLevel = ptr.treeLevel - 1;
			     ptr.left = newNode;
			     return;
			  }
			  else 
				 ptr = ptr.left;
			  
		  } else if(newNode.data > ptr.data){
			  
			  if(ptr.right == null){
				 newNode.treeLevel = ptr.treeLevel + 1;
			     ptr.right = newNode;
			     return;
			  }
			  else 
				 ptr = ptr.right;
		  }
	  }
	}
	
	/* In Order Traversal on a Binary Tree*/
	public void displayBinTree(Node pRoot){
		
		Node start = pRoot;
		
		if(start == null)
			return;
		
		start.dispNode();
		displayBinTree(start.left);
		
		displayBinTree(start.right);
	}
	
	public int findMinMax(boolean pFindMin){
		
		Node curr = this.root;
				
		if(curr == null)
			return -1;
		
		if(curr.left == null && curr.right == null)
			return curr.data;
		
		
		if(!pFindMin){
			while( curr.left != null){
			
			  curr = curr.left;
		   }
		}else{
			while( curr.right != null){
				
				  curr = curr.right;
			   }
		}
		
		return curr.data;
	}
	
	
   public int getMinDepth(Node pRoot, int depth){
		
		Node start = pRoot;
		int tempDepth = 0;
		
		if(start == null)
			return 0;
		
		if(start.left == null && start.right == null){
			
			return depth;
		}
		
		tempDepth = getMinDepth(start.left, (depth + 1));
		if(tempDepth < this.minDepth || this.minDepth == 0)
			this.minDepth = tempDepth;
		start.dispNode();
		
		//depth = 0;
		tempDepth = getMinDepth(start.right, (depth + 1));
		if(tempDepth < this.minDepth || this.minDepth == 0)
			this.minDepth = tempDepth;
		
		return this.minDepth;
	}
   
   
   
   int findMaxUtil(Node node, Res res)
   {

       // Base Case
       if (node == null)
           return 0;

       // l and r store maximum path sum going through left and
       // right child of root respectively
       int l = findMaxUtil(node.left, res);
       int r = findMaxUtil(node.right, res);

       // Max path for parent call of root. This path must
       // include at-most one child of root
       int max_single = Math.max(Math.max(l, r) + node.nodeVal,
                                 node.nodeVal);


       // Max Top represents the sum when the Node under
       // consideration is the root of the maxsum path and no
       // ancestors of root are there in max sum path
       int max_top = Math.max(max_single, l + r + node.nodeVal);

       // Store the Maximum Result.
       res.val = Math.max(res.val, max_top);

       return max_single;
   }
   
   
   public boolean isFullBinTree(Node pRoot){
		
		Node start = pRoot;
		int tempDepth = 0;
		
		if(start == null)
			return (this.isFullBibTree = true);
		
		if(start.left == null && start.right == null){
			
			return (this.isFullBibTree = true);
		}else if (start.left != null && start.right == null){
			 return (this.isFullBibTree = false);
		}else if (start.left == null && start.right != null){
			 return (this.isFullBibTree = false); 
		}
		
				
		if( isFullBinTree(start.left) && 
				isFullBinTree(start.right) )
			return true;
		
				
		return (false);
	}
   
   
   public void btmVwBinTree(Node pRoot){
		
		Node start = pRoot;
		
		if(start == null)
			return;
		
		btmVw.put(String.valueOf(pRoot.treeLevel), String.valueOf(pRoot.data));
		
		btmVwBinTree(start.left);
		
		btmVwBinTree(start.right);
	}
   
   public void topVwBinTree(Node pRoot){
		
		Node start = pRoot;
		
		if(start == null)
			return;
		
		if(btmVw != null && !btmVw.containsKey(String.valueOf(pRoot.treeLevel)))
		    btmVw.put(String.valueOf(pRoot.treeLevel), String.valueOf(pRoot.data));
		
		topVwBinTree(start.left);
		
		topVwBinTree(start.right);
	}
   
   
   
	
	
}

class Res {
    public int val;
    
    public Res(){
    	val = 0; 
    }
}

/*                           55
 *                      45       65
 *                    35  50   60  70
 * 
 * 
 * */

public class BinTreeOpr {

	public static void main(String [] args){
		
		BinaryTree binTree = new BinaryTree();
		
		//insert elements.
		/*binTree.insertNode(50, 10);
		binTree.insertNode(40, 2);
		binTree.insertNode(30, 20);
		binTree.insertNode(43, 1);
		binTree.insertNode(60, 10);
		binTree.insertNode(70, -25);
		binTree.insertNode(65, 3);
		binTree.insertNode(75, 4);*/
		
		/*binTree.insertNode(20);
		binTree.insertNode(10);
		binTree.insertNode(25);
		binTree.insertNode(8);
		binTree.insertNode(12);
		binTree.insertNode(22);
		binTree.insertNode(30);
		binTree.insertNode(27);
		binTree.insertNode(31);
		binTree.insertNode(26);
		binTree.insertNode(28);
		binTree.insertNode(29);*/
		
		/*binTree.insertNode(2);
		binTree.insertNode(4);
		binTree.insertNode(5);*/
		
		/*binTree.insertNode(20);
		binTree.insertNode(8);
		binTree.insertNode(22);
		binTree.insertNode(5);
		binTree.insertNode(12);
		binTree.insertNode(21);
		binTree.insertNode(25);*/
		//binTree.insertNode(9);
		//binTree.insertNode(13);
		
		binTree.insertNode(50, 10);
		binTree.insertNode(40, 2);
		binTree.insertNode(30, 20);
		binTree.insertNode(35, 1);
		binTree.insertNode(60, 10);
		binTree.insertNode(55, -25);
		
		
		binTree.displayBinTree(binTree.root);
		
		//binTree.btmVwBinTree(binTree.root);
		//binTree.topVwBinTree(binTree.root);
		
		//System.out.println(binTree.btmVw.values().toString());
		
		//System.out.println("Minimum Value in Tree is : "+binTree.findMinMax(false)); //find min
		//System.out.println("Maximum Value in Tree is : "+binTree.findMinMax(true)); //find Max
		
		//System.out.println(" The Minimum depth is :- "+binTree.getMinDepth(binTree.root, 0));
		//System.out.println(" The Max path value is :- "+binTree.getMaxPathSum(binTree.root, 0));
		//System.out.println(" The Max path value is :- "+binTree.findMaxUtil(binTree.root, new Res()) );
		//System.out.println(" Is full BinTree :- "+binTree.isFullBinTree(binTree.root) );
		
	int i = Integer.MIN_VALUE;
		
		
	}
}
