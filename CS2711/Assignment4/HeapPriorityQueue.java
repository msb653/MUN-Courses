import java.util.ArrayList;
//Priority queue implementation using a heap
public class HeapPriorityQueue{
	protected ArrayList<Entry> heap=new ArrayList<Entry>();
	public HeapPriorityQueue(){}
	
	protected int parent(int j){return (j-1)/2;}
	protected int left(int j){return 2*j+1;}
	protected int right(int j){return 2*j+2;}
	protected boolean hasLeft(int j){return left(j)<heap.size();}
	protected boolean hasRight(int j){return right(j)<heap.size();}
	
	protected void swap(int i, int j){
		Entry temp=heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}
	protected void upheap(int j){
		while(j>0){
			int p=parent(j);
			if(heap.get(j).getKey()>heap.get(p).getKey())break;
			swap(j,p);
			j=p;
		}
	}
	protected void downheap(int j){
		while(hasLeft(j)){
			int leftIndex=left(j);
			int smallChildIndex=leftIndex;
			if(hasRight(j)){
				int rightIndex=right(j);
				if (heap.get(leftIndex).getKey()>heap.get(rightIndex).getKey())
					smallChildIndex=rightIndex;
			}
			if(heap.get(smallChildIndex).getKey()>heap.get(j).getKey())
				break;
			swap(j, smallChildIndex);
			j=smallChildIndex;
		}
	}
	
	public int size(){
		return heap.size();
	}
	
	public boolean isEmpty(){
		return heap.size()==0;
	}
	public Entry insert(int k, int v){
		Entry newest=new Entry(k,v);
		heap.add(newest);
		upheap(heap.size()-1);
		return newest;
	}
	
	public Entry min(){
		if(heap.isEmpty()) return null;
		return heap.get(0);
	}
	
	public Entry removeMin(){
		if(heap.isEmpty()) return null;
		Entry answer=heap.get(0);
		swap(0, heap.size()-1);
		heap.remove(heap.size()-1);
		downheap(0);
		return answer;
	}
}