public class SinglyLinkedList {
	//Node class
    private static class StringNode {
        private String str;
        private StringNode next;
        public StringNode(String s, StringNode n){
            str=s;
            next=n;
        }
        public String getData(){
        	return str;
        }
        public StringNode getNext(){
        	return next;
        }
        public void setNext(StringNode n){
        	next=n;
        }
    }
    //Linked List variables/functions
    private StringNode head = null;
    private StringNode tail = null;
    private int size=0;
    public SinglyLinkedList(){
    }
    public int size(){
    	return size;
    }
    //return t/f based on whether list is empty
    public boolean isEmpty(){
    	return(size==0);
    }
    //returns first value
    public String first(){
    	if(isEmpty())
    		return null;
    	else
    		return head.getData();
    }
    //returns last value
    public String last(){
    	if(isEmpty())
    		return null;
    	else
    		return tail.getData();
    }
    //adds node to front of list
    public void addFirst(String s){
    	head=new StringNode(s, head);
    	if(size==0)
    		tail=head;
    	size++;
    }
    //adds node to end of list
    public void addLast(String s){
    	StringNode newest=new StringNode(s, null);
    	if(isEmpty())
    		head=newest;
    	else
    		tail.setNext(newest);
    	tail=newest;
    	size++;
    }
    //removes first element of list and returns it
    public String removeFirst(){
    	if(isEmpty())
    		return null;
    	String value=head.getData();
    	head=head.getNext();
    	size--;
    	if(size==0)
    		tail=null;
    	return value;
    }
}