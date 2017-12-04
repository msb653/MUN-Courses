public class Customer{
	//Variable initialization
	private String name;
	private String address;
	private String cNum;
	private int lOrder;
	
	//Constructor
	public Customer(String n, String a, String c, int l){
		name=n;
		address=a;
		cNum=c;
		lOrder=l;
	}
	
	//Mutators
	public void setName(String n){
		name=n;
	}
	public void setAddress(String a){
		address=a;
	}
	public void setCNum(String c){
		cNum=c;
	}
	public void setLOrder(int l){
		lOrder=l;
	}
	
	//Accessors
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getCNum(){
		return cNum;
	}
	public int getLOrder(){
		return lOrder;
	}
	
	//ToString method
	public String toString(){
		return("[Name: "+name+"] [Address: "+address+"] [Customer Number: "+cNum+"] [Last Order: "+lOrder+"]");
	}
	
}