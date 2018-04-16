package linked;

public class SecondLargValInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MaintainBST bst = new MaintainBST();
       bst.insertBSTNode(50);
       bst.insertBSTNode(60);
       bst.insertBSTNode(70);
       
       System.out.println("Second lasrget element is :" + bst.searchSecLargBSTVal());
	}

}

class MaintainBST {
	BinaryTreeNode root = null;
	
	public MaintainBST(){
		
	}
	
	public void insertBSTNode(int val){
		
		BinaryTreeNode curr = this.root;
		
		if(root == null){
			root = new BinaryTreeNode(val);
			return;
		}
		
		while(curr != null){
			if(val < curr.value){
				if(curr.left != null){
				   curr = curr.left;
				}else{
					curr = curr.insertLeft(val);
					return;
				}
			
			}else{
				if(curr.right != null){
				   curr = curr.right;
				}else{
					curr = curr.insertRight(val);
					return;
				}
			}
		}
	}
	
	
	public int searchSecLargBSTVal(){
		
		BinaryTreeNode curr = this.root;
		
		if(root == null || (root.right == null)){
			return -1;
		}
		
		while (curr.right.right != null){
			
			curr = curr.right;
				
		}
		return curr.value;
	}
	
	
}

class BinaryTreeNode {

    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public BinaryTreeNode insertLeft(int leftValue) {
        this.left = new BinaryTreeNode(leftValue);
        return this.left;
    }

    public BinaryTreeNode insertRight(int rightValue) {
        this.right = new BinaryTreeNode(rightValue);
        return this.right;
    }
    
    
}
