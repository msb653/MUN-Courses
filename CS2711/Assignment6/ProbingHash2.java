import java.util.Arrays;
public class ProbingHash2{
	private Entry map[];//array to hold entries
	/*creating entry to put in the array after a
	deletion is performed to avoid search problems */
	private Student x=new Student(0, "Null",0.0);
	private Entry y=new Entry(99999,x);
	int size;
	public ProbingHash2(int c){
		map=new Entry[c];
		size=0;
	}
	
	//class user calls to add a student to the hashtable
	public Student addStudent(Student s){
		int i=hashFunction(s.getStudentNum());//getting index from key
		Entry e=new Entry(s.getStudentNum(), s);//creating new enrty object
		int tracker=1;
		//check if index is empty or has been deleted
		if(map[i]==null || map[i].getValue().getName()=="Null"){
			map[i]=e;
			return s;
		}
		//else, probe and search for open slot
		else{
			while((i+tracker)%map.length!=i){
				if(map[i+tracker]==null || map[i+tracker].getValue().getName()=="Null"){
					map[i+tracker]=e;
					return s;
				}
				tracker=tracker+1;
			}
		}
		System.out.println("No open slots available, entry not added.\n");
		return s;
	}
	
	//Hashfunction (hash code and compression)
	public int hashFunction(int i){
		//getting the last 3 digits of the student number(ignoring year portion)
		int first=Integer.parseInt(Integer.toString(i).substring(6,7));
		int second=Integer.parseInt(Integer.toString(i).substring(7,8));
		int third=Integer.parseInt(Integer.toString(i).substring(8));
		int sum=first+second+third;
		
		//multiplying each of the last 3 digits by their sum and summing them
		int hash=sum*first+sum*second+sum*third;
		//compression function to make sure index is in range
		hash=hash%map.length;// hash value mod size
		return hash; //returning index that key hashed to	
	}
	
	//Search function that also outputs the probe sequence
	public boolean search(int i){
		boolean found=false;
		int index=hashFunction(i);
		System.out.println("Checking index "+index+":\n");
		if(map[index].getValue().getStudentNum()==i){
			System.out.println("Student number found at index "+index+".\n");
			found=true;
			return found;
		}
		else{
			int tracker=1;
			while((index+tracker)%map.length!=index){
				System.out.println("Probing index "+(index+tracker)+":");
				if(map[index+tracker]==null){
					System.out.println("Student Number not found. \n");
					return found;
				}
				if(map[index+tracker].getValue().getStudentNum()==i){
					System.out.println("Student number found at index "+(index+tracker)+".'n");
					found=true;
					return found;
				}
				tracker=tracker+1;
			}
		}
		return found;
	}
}