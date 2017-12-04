public class LinkedQueue{
	//initialize a singly linked list
	private SinglyLinkedList list=new SinglyLinkedList();
	//empty contructor
	public LinkedQueue(){
	}
	//Accessors
	public int size(){
		return list.size();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	//Mutators
	public void enqueue(String s){
		list.addLast(s);
	}
	public String first(){
		return list.first();
	}
	public String dequeue(){
		return list.removeFirst();	
	}
}
	