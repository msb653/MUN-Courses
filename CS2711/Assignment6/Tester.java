public class Tester{
	public static void main(String[]args){
		//creating 10 students
		Student s1=new Student(201412563, "John", 3.22);
		Student s2=new Student(201437787, "Lynn", 3.56);
		Student s3=new Student(201505873, "Brandon", 3.01);
		Student s4=new Student(201558236, "Sarah", 2.95);
		Student s5=new Student(201699523, "Bill", 3.78);
		Student s6=new Student(201709121, "Fred", 2.91);
		Student s7=new Student(201783685, "Jessica", 3.44);
		Student s8=new Student(201785462, "Steve", 3.35);

		
		//testing ProbingHash1
		System.out.println("\n\nTesting ProbingHash1:\n");
		ProbingHash1 test1=new ProbingHash1(7);
		test1.addStudent(s1);
		test1.addStudent(s2);
		test1.addStudent(s3);
		test1.addStudent(s4);
		test1.addStudent(s5);
		test1.addStudent(s6);
		System.out.println("Searching Hashtable for '201437787' (True expected):");
		test1.search(201437787);
		System.out.println("Searching Hashtable for '201558236' (True expected):");
		test1.search(201558236);
		System.out.println("Searching Hashtable for '201699523' (True expected):");
		test1.search(201699523);
		
		//testing ProbingHash2
		System.out.println("\n\nTesting ProbingHash2:\n");
		ProbingHash2 test2=new ProbingHash2(10);
		test2.addStudent(s1);
		test2.addStudent(s2);
		test2.addStudent(s3);
		test2.addStudent(s4);
		test2.addStudent(s5);
		test2.addStudent(s6);
		System.out.println("Searching Hashtable for '201412563' (True expected):");
		test2.search(201412563);
		System.out.println("Searching Hashtable for '201511428' (False expected):");
		test2.search(201511428);
		System.out.println("Searching Hashtable for '201699523' (True expected):");
		test2.search(201699523);
		
		//testing ChainingHash1
		System.out.println("\n\nTesting ChainingHash1:\n");
		ChainingHash1 test3=new ChainingHash1(9);
		test3.addStudent(s1);
		test3.addStudent(s2);
		test3.addStudent(s3);
		test3.addStudent(s7);
		test3.addStudent(s8);
		System.out.println("Searching Hashtable for '201437787' (True expected):");
		test3.search(201437787);
		System.out.println("Searching Hashtable for '201785462' (True expected):");
		test3.search(201785462);
		System.out.println("Searching Hashtable for '201699453' (False expected):");
		test3.search(201699453);
		
		//testing ChainingHash2
		System.out.println("\n\nTesting ChainingHash2:\n");
		ChainingHash2 test4=new ChainingHash2(7);
		test4.addStudent(s1);
		test4.addStudent(s2);
		test4.addStudent(s3);
		test4.addStudent(s4);
		test4.addStudent(s5);
		test4.addStudent(s6);
		System.out.println("Searching Hashtable for '201505883' (False expected):");
		test4.search(201505883);
		System.out.println("Searching Hashtable for '201733809' (False expected):");
		test4.search(201733809);
		System.out.println("Searching Hashtable for '201505873' (True expected):");
		test4.search(201505873);
		
	}
}
		