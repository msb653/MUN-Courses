import java.util.*;
public class EntrantTester{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		//Created singly-linked list of Entrant objects
		LinkedList<Entrant> eList=new LinkedList<Entrant>();
		eList.add(new Entrant("John"));
		eList.add(new Entrant("Sara"));
		eList.add(new Entrant("Beth"));
		eList.add(new Entrant("Steve"));
		eList.add(new Entrant("Anthony"));	
		
		//Delete an entrant from the list given their entry number
		System.out.println("Enter entrant number to be deleted:");
		int value=in.nextInt();
		for(Entrant temp: eList){
			if(temp.getNumber()==value){
				eList.remove(temp);
				break;
			}
		}
		
		//Enter entrant number and time after race
		int time;
		int number;
		for(int y=1;y<=eList.size();y++){
			System.out.println("Enter entrant number: ");
			number=in.nextInt();
			System.out.println("Enter entrant time(in minutes): ");
			time=in.nextInt();
			for(Entrant temp: eList){
				if(temp.getNumber()==number)
					temp.setTime(time);
			}
		}
			
		//Output name, entry number and time for each entrant
		for(Entrant temp: eList){
			System.out.println("[Name: "+temp.getName()+"][Entry Number: "+
				temp.getNumber()+"][Time: "+temp.getTime()+" minutes]");
			System.out.println();
		}
	}		
}