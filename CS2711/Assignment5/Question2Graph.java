//new graph class due to errors compiling graph from part 1
/*
still recieve message preventing compilation due to 
"unchecked or unsafe operations"
*/
import java.util.*;
class Question2Graph
{
    private int size; 
    private LinkedList<Integer> adj[]; 
    //constructor
    Question2Graph(int s){
        size=s;
        adj = new LinkedList[s];
        for (int i=0; i<s; ++i)
            adj[i] = new LinkedList();
    }
    //update method
    void addEdge(int i,int w) { adj[i].add(w); }//adding an edge (a pair of vertices)
 
    //topological sort methods
    void topologicalSortRecursive(int v, boolean visited[],Stack stack){
    	//visiting in vertices in topological order and adding them to stack
        visited[v] = true;
        Integer i;
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext())
        {
            i = it.next();
            if (!visited[i])
                topologicalSortRecursive(i, visited, stack);
        }
        stack.push(new Integer(v));
    }
    void topologicalSort()
    {
    	//creating stack for recursive call and unvisiting all vertices
        Stack stack = new Stack();
        boolean visited[] = new boolean[size];
        for (int i = 0; i < size; i++)
            visited[i] = false;
        //filling stack with recursive call
        for (int i = 0; i < size; i++)
            if (visited[i] == false)
                topologicalSortRecursive(i, visited, stack);
        //printing the result of the topological sort
        while (stack.empty()==false)
            System.out.print(stack.pop() + " ");
    }
    //testing topological sort
    public static void main(String[]args){
    	Question2Graph t=new Question2Graph(5);//creating graph for 25 vertices
    	//filling graph
    	t.addEdge(1,2);
    	t.addEdge(2,0);
    	t.addEdge(4,0);
    	t.addEdge(1,3);
    	//calling topological sort to print sorted graph
    	System.out.println("Printing topological sort of graph with edges connecting(1,2), (2,0), (4,0) and (1,3).");
    	System.out.println("(4,1,3,2,0 expected)");
    	t.topologicalSort();
    }
}
