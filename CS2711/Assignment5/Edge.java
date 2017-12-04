//Edge class
public class Edge{
	private int value;
	public int index;
	private Vertex startVertex;
	private Vertex endVertex;
	public Edge(int v, int i, Vertex s, Vertex e){
		value=v;
		index=i;
		startVertex=s;
		endVertex=e;
	}
	public int getCost(){
		return value;
	}
	public int getIndex(){
		return index;
	}
	public Vertex getStart(){
		return startVertex;
	}
	public Vertex getEnd(){
		return endVertex;
	}
	public boolean equals(Edge e){
		if(e.getCost()==value && e.getStart()==startVertex
			&& e.getEnd()==endVertex) return true;
		else
			return false;
	}
}