public class IntNode{
		private int element;
		private IntNode left;
		private IntNode right;
		//constructor with element and both children as parameters
		public IntNode(int e, IntNode l, IntNode r){
			element=e;
			left=l;
			right=r;
		}
		//accessors
		public int getElement(){ return element;}
		public IntNode getLeft(){return left;}
		public IntNode getRight(){return right;}
		//mutators
		public void setElement(int e){element=e;}
		public void setLeft(IntNode l){left=l;}
		public void setRight(IntNode r){right=r;}
}