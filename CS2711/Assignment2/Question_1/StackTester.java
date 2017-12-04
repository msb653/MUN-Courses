public class StackTester{
	public static void main(String[]args){
		//creating leaky stack with capacity 5
		int capacity=5;
		LeakyStack stack=new LeakyStack(capacity);
		//Adding 8 values to stack (first 3 should "leak" out)
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		//Checking top value (8 expected)
		System.out.println("Top Value: "+stack.peek());
		//Checking stack size(5 expected)
		System.out.println("Stack Size: "+stack.size());
		//Printing out stack contents (8,7,6,5,4 expected)
		System.out.println("Stack Contents:");
		for(int i=0; i<capacity; i++){
			System.out.println(stack.pop());
		}
	}
}

