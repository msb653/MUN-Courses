public class QueueTester{
	public static void main(String[]args){
		//testing first queue
		LPQ_Queue queue1=new LPQ_Queue();
		System.out.println("Testing Queue implemented with an unsorted list priority queue.");
		System.out.println("Entering 1,4,7 and 2 into the queue in that order:");
		queue1.enqueue(1);
		queue1.enqueue(4);
		queue1.enqueue(7);
		queue1.enqueue(2);
		System.out.println("Checking queue size (4 expected):");
		System.out.println("Queue size: "+queue1.size()+"\n");
		System.out.println("Dequequeing 2 values (1,4 expected):");
		System.out.println(queue1.dequeue()+","+queue1.dequeue()+"\n");
		System.out.println("Checking new queue size (2 expected):");
		System.out.println("Queue size "+queue1.size()+"\n");
		System.out.println("Dequeueing last 2 values (7,2 expected): ");
		System.out.println(queue1.dequeue()+","+queue1.dequeue()+"\n");
		System.out.println("Checking if queue is empty (true expected):");
		System.out.println("Queue empty: "+queue1.isEmpty()+"\n\n");
		
		//testing second queue
		HPQ_Queue queue2=new HPQ_Queue();
		System.out.println("Testing Queue implemented with a heap priority queue:");
		System.out.println("Entering 12,63,57,9 and 24 into the queue in that order:");
		queue2.enqueue(12);
		queue2.enqueue(63);
		queue2.enqueue(57);
		queue2.enqueue(9);
		queue2.enqueue(24);
		System.out.println("Checking queue size (5 expected):");
		System.out.println("Queue size: "+queue2.size()+"\n");
		System.out.println("Dequequeing 3 values (12,63,57 expected):");
		System.out.println(queue2.dequeue()+","+queue2.dequeue()+","+queue2.dequeue()+"\n");
		System.out.println("Checking new queue size (2 expected):");
		System.out.println("Queue size "+queue2.size()+"\n");
		System.out.println("Dequeueing last 2 values (9,24 expected): ");
		System.out.println(queue2.dequeue()+","+queue2.dequeue()+"\n");
		System.out.println("Checking if queue is empty (true expected):");
		System.out.println("Queue empty: "+queue1.isEmpty()+"\n\n");
	}
}