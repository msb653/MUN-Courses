import java.util.ArrayList;
public class SnackDispenser{
    //Initialize variables
    private int temp;
    private double tCoins=0;
    private ArrayList<Products> items;
    
    //Constructor takes in the created list of products
    public SnackDispenser(ArrayList<Products> i){
        items=i;  
    }
    
    //Takes in the required item and coins, if enough money is input
    //and enough stock is available,transaction is completed.
    public void buyItem(String n, double c){
        temp=-1;
        for (int k=0; k<items.size(); k++){
            if (n.equals(items.get(k).getName()))
                temp=k;
        }
        if (temp!=-1){
            if(items.get(temp).getCount()<1)
                System.out.println("Sorry, product is currently out of stock.");
            else if(c<items.get(temp).getPrice())
                System.out.println("Not enough money inserted, please reclaim your coins.");
            else{
                tCoins=tCoins+c;
                items.get(temp).setCount(items.get(temp).getCount()-1);
                System.out.println(items.get(temp).getName()+" has been successfully purchased.");
            }
            
        }
        else
            System.out.println("Invalid product selected");
        System.out.println(" ");
    }
    
    //Empty all coins from the machine
    public void emptyCoins(){
        tCoins=0;
    }
    
    //Accessor for total coins in the machine
    public void getTCoins(){
        System.out.println("Total coins in machine: $"+tCoins);
        System.out.println(" ");
    }
    
    //Method that displays all products along with their price and quantity
    public void printList(){
        System.out.println(" ");
        System.out.println("List of available products:");
        System.out.println(" ");
        for (int m=0;m<items.size();m++){
            System.out.println(items.get(m).toString());
            System.out.println(" ");
        }     
    }
    
    //Method to add new product
    public void addProduct(Products p){
    items.add(p);
    }
    
    //Method to quit process
    public void quitProcess(){
        System.exit(0);
    }
    
}