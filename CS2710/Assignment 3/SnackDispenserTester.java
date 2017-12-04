import java.util.ArrayList;
public class SnackDispenserTester{
    public static void main (String[]args){
        //Initialize an array list of products 
        ArrayList<Products> productList=new ArrayList<Products>();
        
        //Add products to the array list (more can be added later)
        productList.add(new Products("Gatorade", 4.00, 10));
        productList.add(new Products("Bottled Water", 2.00, 15));
        productList.add(new Products("Chips", 3.00, 15));
        productList.add(new Products("Candy Bar", 2.00, 20));
        
        //Passing list of products to the vending machine
        SnackDispenser Machine1=new SnackDispenser(productList);
        
        //Calling method to print list of products
        Machine1.printList();
        
        //Buying a number of products
        Machine1.buyItem("Gatorade", 4.00);
        Machine1.buyItem("Bottled Water", 2.00);
        Machine1.buyItem("Chips", 2.00);
        
        //Adding new product to the machine
        Machine1.addProduct(new Products("Monster Energy", 5.00, 5));
        
        //Printing out updated list
        Machine1.printList();
        
        //Showing current coin count( should be 6.00)
        Machine1.getTCoins();
        
        //Emptying coins from machine
        Machine1.emptyCoins();
        
        //Showing updated coin count
        Machine1.getTCoins();
        
        //Using method to quit process
        Machine1.quitProcess();

        
    }
}