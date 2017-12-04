#include "C:\Users\matthew\Downloads\MUN\CS2510\Assignment1\std_lib_facilities.h"
int main()
{
    //Initializing variables
    string product;
    double cost;
    double change;
    int bill;
    int dollars;
    int quarters;
    
    //Getting user input
    cout<<"Please enter you desired product ('water', 'soda' or 'juice'):\n";
    cin>>product;
    cout<<"Please enter your bill (an integer):\n";
    cin>>bill;
    
    //Setting cost based on selection
    if (product=="water")
        cost=2.00;
    else if(product=="soda")
        cost=2.50;
    else if(product=="juice")
        cost=3.75;
    else
        cout<<"Invalid product selected.\n";
    
    //Printing message based on cost and amount paid
    //Too little inserted
    if(bill<cost)
        cout<<"Sorry, insufficient funds. Please take back you bill.\n";
    //Exact amount inserted
    else if(bill==cost)
        cout<<"Please retrieve your "<<product<<" from the dispenser.\n";
    //Extra inserted (change is refunded))
    else{
        dollars=(bill-cost)/1;
        quarters=(bill-dollars-cost)/0.25;
        cout<<"Please retrieve your "<<product<<" from the dispenser.\n";
        cout<<"You are also refunded "<<dollars<<" dollar(s) and "<<quarters<<" quarter(s).";
    }
    
}
