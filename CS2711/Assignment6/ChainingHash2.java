import java.util.Arrays;
public class ChainingHash2{
	private Entry[][] map;//array of arrays
	int size;
	public ChainingHash2(int c){
		map=new Entry[c][];
		for(int i=0;i<c;i++){//initializing the "buckets"
			map[i]=new Entry[c];
		}
		size=0;
	}
	//class user calls to add a student to the hashtable
	public Student addStudent(Student s){
		int i=hashFunction(s.getStudentNum());//getting index from key
		Entry e=new Entry(s.getStudentNum(), s);//creating new enrty object
		for(int j=0; j<map.length; j++){//adding entry to the bucket
			if(map[i][j]==null){
				map[i][j]=e;
				return s;
			}
		}
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
		hash=hash%map.length;// hashValue mod size
		return hash; //returning index that key hashed to	
	}
	
	//Search function that also outputs the probe sequence
	public boolean search(int i){
		boolean found=false;
		int index=hashFunction(i);
		System.out.println("Checking bucket located at index "+index+".");
		for (int j=0; j<map.length; j++){
			if(map[index][j]==null){
				System.out.println("Student number not found in the bucket.\n");
				return found;
			}
			if(map[index][j].getValue().getStudentNum()==i){
				found=true;
				System.out.println("Student number found in the bucket.\n");
				return found;
			}
		}
		System.out.println("Student number not found in the bucket.\n");
		return found;
	}
	
}
	