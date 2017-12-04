/*
Queue implementation using an unsorted list implementation of a
Priority queue
*/
public class LPQ_Queue{
	private int count;
	private ListPriorityQueue lpq;
	public LPQ_Queue(){
		count=1;
		lpq=new ListPriorityQueue();
	}
	public int size(){
		return lpq.size();
	}
	public boolean isEmpty(){
		return lpq.isEmpty();
	}
	public void enqueue(int v){
		lpq.insert(count,v);
		count++;
	}
	public int first(){
		return lpq.min().getValue();
	}
	public int dequeue(){
		return lpq.removeMin().getValue();
	}
}