import java.util.*;
public class CustomerTester{
	public static void main(String[]args){
		//Creation of customer objects
		Customer c1=new Customer("Steve", "Paradise", "102328400", 2015);
		Customer c2=new Customer("Amy", "Mount Pearl", "823296745", 2016);
		Customer c3=new Customer("Robert", "Paradise", "037684629", 2015);
		Customer c4=new Customer("Eric", "St.John's", "475694345", 2011);
		//Creating singly-linked list
		LinkedList<Customer> customers=new LinkedList<Customer>();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		//printing the list
		System.out.println("Original list of customers:");
		for(Customer element : customers)
			System.out.println(element.toString()+"\n");
		
		//testing method that retrieves cInfo given a cNum
		//Test with valid number
		String temp=(numCheck("475694345", customers));
		System.out.println(temp);
		//Test with invalid number
	    temp=(numCheck("049320019", customers));
	    System.out.println(temp);
	    
	    //Outputting name+address who plaed an order last year
	    System.out.println("");
	    System.out.println("Customers who made a purcahse in 2015:");
	    for(Customer element:customers){
	    	if(element.getLOrder()==2015){
	    		System.out.println("[Name: "+element.getName()+"] [Address: "+element.getAddress()+"]");
	    		System.out.println("");
	    	}
	    }
	    
	    //Deleting customer records that haven't order in 5+ years
	    int count=0;
	    for(Customer element:customers){
	    	if(element.getLOrder()<2012){
	    		customers.remove(count);
	    		count--;
	    	}
	    	count++;
	    }
	    
	    //Printing updated list
	    System.out.println("List with inactive customers removed:");
	    for(Customer element : customers)
	    	System.out.println(element.toString()+"\n");
	    
	}
	
	//Method given a cNum and returns corresponding customer info
	public static String numCheck(String c, LinkedList<Customer> customers){
		String temp=("Sorry "+c+" isn't a valid customer number.");
		for (Customer element:customers){
			if (c.equals(element.getCNum())){
					temp=("\n"+"Customer Information for :"+c+"\n"+element.toString()+"\n");
			}
		}
		return temp;
	}
		
}
		
		