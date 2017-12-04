//class ADT implemented using adjacency list
//cannot compile due to "unsafe or unchecked operations"
import java.util.*;
public class Question1Graph{
	private List<Vertex> V;
	private List<Edge> E;
	private List<List<Edge>>[] adj;
	/*
	adj is a list containing lists of adjacent edges, with indexes
	matching those of the Vertex list
	*/
	
	//Creating adjacency list graph given a list of vertices and a list of edges
	public Question1Graph(List<Vertex> v, List<Edge> e, int c){
		V=v;
		E=e;
		adj =(List<Edge>[]) new List<Edge>(c);
		for(Vertex x: V){//going through V and E and creating adj.list
			for(Edge y: E){
				if(x==y.getStart() || x==y.getEnd()){
					if(adj[x.getIndex()].isEmpty()){
						adj[x.getIndex()]=new List<Edge>(20);
						adj[x.getIndex()].add(y);
					}
					else
						adj[x.getIndex()].add(y);
				}
		    }
        }
	}
	
	//implementing update methods
	
	//inserting new vertex
	public void insertVertex(Vertex x){
		V.add(x.getIndex(), x);
		for(Edge y: E){
				if(x==y.getStart() || x==y.getEnd()){
					if(adj[x.getIndex()].isEmpty()){
						adj[x.getIndex()]=new List<Edge>(20);
						adj[x.getIndex()].add(y);
					}
					else
						adj[x.getIndex()].add(y);
				}
		    }
	}
	
	//inserting new edge
	public void insertEdge(Edge x){
		E.add(x.getIndex(), x);
		for(Vertex y: V){
			if(y==x.getStart() || y==x.getEnd()){
					if(adj[y.getIndex()].isEmpty()){
						adj[y.getIndex()]=new List<Edge>(20);
						adj[y.getIndex()].add(x);
					}
					else
						adj[y.getIndex()].add(x);
				}
		}
	}
	
	//removing a vertex
	public void removeVertex(Vertex x){
		V.remove(x.getIndex());
		adj[x.getIndex()].clear();
	}
	
	//removing an edge
	public void removeEdge(Edge x){
		for(Vertex y: V){
				if(adj[y.getIndex()].contains(x))
					adj[y.getIndex()].remove(x);
		}
		E.remove(x.getIndex());
	}
		
}
