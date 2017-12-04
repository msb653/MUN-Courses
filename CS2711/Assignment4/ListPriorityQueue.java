import java.util.ArrayList;
//Priority Queue implementation using an unsorted list
public class ListPriorityQueue{
	private ArrayList<Entry> list=new ArrayList<Entry>();
	public ListPriorityQueue(){
	}
	private int findMin(){
		int small=0;
		for(int i=0; i<list.size();i++){
			if(list.get(i).getKey()<list.get(small).getKey())
				small=i;
		}
		return small;
	}
	public int size(){
		return list.size();
	}
	public boolean isEmpty(){
		return size()==0;
	}
	public Entry insert(int k, int v){
		Entry newest=new Entry(k,v);
		list.add(newest);
		return newest;
	}
	public Entry min(){
		if(list.size()==0) return null;
		return list.get(findMin());
	}
	public Entry removeMin(){
		if(list.size()==0)return null;
		return list.remove(findMin());
	}
}