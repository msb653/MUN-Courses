//Queue implementation using a heap implementation of a priority queue
public class HPQ_Queue{
	private int count;
	private HeapPriorityQueue hpq;
	public HPQ_Queue(){
		count=1;
		hpq=new HeapPriorityQueue();
	}
	public int size(){
		return hpq.size();
	}
	public boolean isEmpty(){
		return hpq.isEmpty();
	}
	public void enqueue(int v){
		hpq.insert(count, v);
		count ++;
	}
	public int first(){
		return hpq.min().getValue();
	}
	public int dequeue(){
		return hpq.removeMin().getValue();
	}
}