//Class for holding the info of Entrants
public class Entrant{
	private String name;
	private int number;
	private int time;
	static int count=1;  //Static counter used to keep track of entrant numbers
	public Entrant(String n){
		name=n;
		time=0;
		number=count;
		count=count+1;
	}
	//Accessors
	public String getName(){
		return name;
	}
	public int getNumber(){
		return number;
	}
	public int getTime(){
		return time;
	}
	//Mutators
	public void setName(String n){
		name=n;
	}
	public void setNumber(int n){
		number=n;
	}
	public void setTime(int t){
		time=t;
	}
}