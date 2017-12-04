//Linked implementation of a binary tree
public class LinkedBinaryTree{
	protected IntNode createNode(int x, IntNode left, IntNode right){
		return new IntNode(x, left, right);
	}
	//LinkedBinaryTree variables
	protected IntNode root=null;
	private int size=0;
	//empty constructor
	public LinkedBinaryTree(){}
	//accessors
	public int size(){ return size;}
	public IntNode root(){ return root;}
	public IntNode left(IntNode x){ return x.getLeft();}
	public IntNode right(IntNode x){ return x.getRight();}
	//mutators
	public IntNode addRoot(int i) throws IllegalStateException{
		if (size!=0) throw new IllegalStateException("Tree is not empty");
		root=createNode(i, null, null);
		size=1;
		return root;
	}
	public IntNode addLeft(IntNode x, int i)throws IllegalArgumentException {
		if(x.getLeft()!=null)
			throw new IllegalArgumentException("node already has a left child");
		IntNode temp=new IntNode(i, null, null);
		x.setLeft(temp);
		size++;
		return temp;
	}
	public IntNode addRight(IntNode x, int i)throws IllegalArgumentException {
		if(x.getRight()!=null)
			throw new IllegalArgumentException("node already has a right child");
		IntNode temp=new IntNode(i, null, null);
		x.setRight(temp);
		size++;
		return temp;
	}
}
		
	
	