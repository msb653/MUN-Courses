//class to test LinkedBinaryTree class
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math.*;
public class TreeTester{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		//------------create binary search tree from input integers-------------
		int size;
		//user inputs size of tree
		System.out.println("How many integers do you want in your binary search tree?");
		size=in.nextInt();
		System.out.println("\n");
		int[] input=new int[size];
		//user inputs values for tree
		for(int i=0; i<size; i++){
			System.out.println("Enter next value: ");
			input[i]=in.nextInt();
			System.out.println("\n");
		}
		//creating tree using method SearchTree
		LinkedBinaryTree tree=new LinkedBinaryTree();
		for(int i : input){
			tree=SearchTree(tree, i, tree.root());
		}
		//end of tree creation--------------------------------------------------
		
		
		//count and return the number of nodes in the binary tree
		int counter=NodeCount(tree,tree.root());
		System.out.println("\nNumber of nodes in tree: "+counter+"\n");
		
		//compute and return the height of the tree
		int height=Height(tree, tree.root());
		System.out.println("Height of tree: "+height+"\n");
		
		//output the contents of the binary tree using an inorder traversal
		System.out.println("Inorder traversal: ");
		Inorder(tree, tree.root());
		System.out.println("\n");
		
		//output the contents of the binary tree using a postorder traversal
		System.out.println("Postorder traversal: ");
		Postorder(tree, tree.root());
		System.out.println("\n");
		
		//given an int x, search for x in the tree, return point to node or null
		System.out.println("Enter value to search for in the tree: ");
		int value=in.nextInt();
		IntNode result=Search(tree, tree.root(), value);
		if(result==null)
			System.out.println("Value not found.\n");
		else
			System.out.println("Value was found in the tree.\n");
		
		//compute and output the sum of the values in the tree
		int sum=0;
		sum=Sum(tree, tree.root());
		System.out.println("Sum of integers in tree: "+sum+"\n");
		
		//output a drawing of the binary tree
		System.out.println("Drawing of tree: \n");
		DrawTree(tree, tree.root(), 0);
		
	}
	
	//Method that counts the nodes in a tree
	public static int NodeCount(LinkedBinaryTree t, IntNode n){
		int count=1;
			if(t.left(n)!=null)
				count= count+NodeCount(t, t.left(n));
			if(t.right(n)!=null)
				count=count+NodeCount(t,t.right(n));
		return count;
	}
	
	//Method that takes an int and inserts it into the binary search tree
	//used to construct the tree using the array of inputs
	public static LinkedBinaryTree SearchTree(LinkedBinaryTree t, int i, IntNode n){
		if(t.size()==0)
			t.addRoot(i);
		else{
			if(i>n.getElement()){
				if(t.right(n)==null)
					t.addRight(n, i);
				else
					t=SearchTree(t, i, t.right(n));
			}
			else{
				if(t.left(n)==null)
					t.addLeft(n, i);
				else
					t=SearchTree(t,i,t.left(n));
			}
		}
		return t;
	}
	//Method for finding height, call with tree and root
	public static int Height(LinkedBinaryTree t, IntNode n){
		int h=0;
		if(t.left(n)!=null)
			h=Math.max(h,1+Height(t, t.left(n)));
		if(t.right(n)!=null)
			h=Math.max(h,1+Height(t,t.right(n)));
		return h;
	}
	//Method for printing the postorder traversal of a tree
	public static void Postorder(LinkedBinaryTree t,IntNode n){
		if(t.left(n)!=null)
			Postorder(t, t.left(n));
		if(t.right(n)!=null)
			Postorder(t,t.right(n));
		System.out.print(n.getElement()+" ");
	}
	//Method for printing the Inorder traversal of a tree
	public static void Inorder(LinkedBinaryTree t,IntNode n){
		if(t.left(n)!=null)
			Inorder(t, t.left(n));
		System.out.print(n.getElement()+" ");
		if(t.right(n)!=null)
			Inorder(t,t.right(n));
	}
	//Method that searches for a value in tree
	public static IntNode Search(LinkedBinaryTree t, IntNode n, int v){
		IntNode temp=null;
		if(n.getElement()==v)
			temp=n;
		if(v<n.getElement()&& t.left(n)!=null)
			temp=Search(t, t.left(n), v);
		if(v>n.getElement() && t.right(n)!=null)
			temp=Search(t, t.right(n), v);
		return temp;
	}
	//Method for computing the sum of integers in the tree
	public static int Sum(LinkedBinaryTree t, IntNode n){
		int sum=n.getElement();
		if(t.left(n)!=null)
			sum= sum+Sum(t, t.left(n));
		if(t.right(n)!=null)
			sum=sum+Sum(t,t.right(n));
		return sum;
	}
	//Method for drawing the tree (draws from left to right)
	public static void DrawTree(LinkedBinaryTree t, IntNode n, int level){
		if(n==null)
			return;
		DrawTree(t,t.right(n), level+1);
		if(level!=0){
			for(int i=0;i<level-1;i++){
				System.out.print("|\t");
			}
			System.out.println("|-------"+n.getElement());
		}
		else
			System.out.println(n.getElement());
		DrawTree(t, t.left(n),level+1);
	}
	
}
		