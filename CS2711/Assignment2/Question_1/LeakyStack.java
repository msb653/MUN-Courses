public class LeakyStack{
	//Node class
	private static class IntNode{
		private int element;
		private IntNode next;
		public IntNode(int e, IntNode n){
			element=e;
			next=n;
		}
		public int getElement(){
			return element;
		}
		public IntNode getNext(){
			return next;
		}
		public void setNext(IntNode n){
			next=n;
		}
	}
	//variables and functions for LeakyStack
	private IntNode top;
	private int size;
	private int capacity;
	public LeakyStack(int c){
		top=null;
		size=0;
		capacity=c;
	}
	//checks if stack is empty
	public boolean isEmpty(){
		return (size==0);
	}
	//returns size
	public int size(){
		return size;
	}
	//pushes value onto stack, deletes oldest entry if size>capacity
	public void push(int c){
		IntNode curr=new IntNode(c, null);
		curr.setNext(top);
		top=curr;
	    size=size+1;
		if (size>capacity) {
			IntNode prev = top;
			IntNode item = top.getNext();
			while (item.getNext() != null) {
				prev = item;
				item = item.getNext();
			}
			prev.setNext(null);	
			size=size-1;
		}
		
	}
	//returns top value
	public int peek(){
		if(isEmpty())
			return 0;
		else
			return top.getElement();
	}
	//removes top value and returns it
	public int pop(){
		if(isEmpty())
			return 0;
		else{
			int v=top.getElement();
			top=top.getNext();
			size=size-1;
			return v;
		}
	}
}
