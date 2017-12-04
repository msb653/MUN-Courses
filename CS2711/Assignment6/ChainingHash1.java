import java.util.Arrays;
public class ChainingHash1{
	private Entry[][] map;//array of arrays
	int size;
	public ChainingHash1(int c){
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
		//getting the last 5 digits of the student number(ignoring year portion)
		int first=Integer.parseInt(Integer.toString(i).substring(4,5));
		int second=Integer.parseInt(Integer.toString(i).substring(5,6));
		int third=Integer.parseInt(Integer.toString(i).substring(6,7));
		int fourth=Integer.parseInt(Integer.toString(i).substring(7,8));
		int fifth=Integer.parseInt(Integer.toString(i).substring(8));
		
		//multiplying together for hash value
		int hash=first*second*third*fourth*fifth;
		//compression function to make sure index is in range
		hash=hash%map.length;// hash value mod size
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
	
	