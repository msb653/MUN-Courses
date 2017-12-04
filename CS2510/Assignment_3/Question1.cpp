#include "C:\Users\matthew\Downloads\MUN\CS2510\Assignment3\std_lib_facilities.h" 
//Name Structure
struct Name{
    string first_name, last_name;
    char initial;
};
//Date Structure
struct Date{
    int yy, mm, dd;
};
//Item Structure
struct Item{
    string product_number, product_name;
    int quantity;
    double price;
};
//Credit card class
class CreditCard{
private:
    //data members
    string credit_type; //visa, master or ams
    Name user_name;
    Date end_date;
    string card_number;
public:
  //Function members
  CreditCard(string type, Name name, Date date, string number); //Constructor 
  bool validCard(string ty, string num); //checks if type and number are valid
  string blacknumb(string num);//return number in the form ************1234
  //getters for data members
  string GetType(); //getter for credit card type
  Name GetName(); //getter for user name
  Date GetDate(); //getter for end date of card
  string GetNumber(); // getter for card number
  
  
};
//Constructor for CreditCard
CreditCard::CreditCard(string type, Name name, Date date, string number)
{
    if(validCard(type, number)){
        credit_type=type;
        user_name=name;
        end_date=date;
        card_number=number;
    }
    else
        cout<<"Invalid type or number entered. \n";
}
//CreditCard getter functions
string CreditCard::GetType()
{
    return credit_type;
}
Name CreditCard::GetName()
{
    return user_name;
}
Date CreditCard::GetDate()
{
    return end_date;
}
string CreditCard::GetNumber()
{
    return card_number;
}
//Function to check for valid type/number
bool CreditCard::validCard(string ty, string num)
{
    if((ty=="visa"||"master"||"ams")&&num.size()==16)
        return true;
    else
        return false;
}
//Function to display number with first 12 digits censored
string CreditCard::blacknumb(string num)
{
    return "************"+num.substr(12,4);
}
//User class
class User{
private:
    //data members
    string user_id;
    string userName;
    string address;
    string phone_number;
    string password;
public:
    //function members
    User(string id, string uN, string a,string pN, string p, CreditCard & c): card(c){//constructor
        user_id=id;
        userName=uN;
        address=a;
        phone_number=pN;
        password=p;
        card=c;
    
    } CreditCard & card; 
    //getters for data members
    string GetID(); //getter for user_id
    string GetName();//getter for user name
    string GetAddress();//getter for address
    string GetPhone(); //getter for phone number
    string GetPassword(); //getter for password
    CreditCard GetCard();
};
//getter for User class
string User::GetID()
{
    return user_id;
}
string User::GetName()
{
    return userName;
}
string User::GetAddress()
{
    return address;
}
string User::GetPhone()
{
    return phone_number;
}
string User::GetPassword()
{
    return password;
}
CreditCard User::GetCard()
{
    return card;
}
class Company{
private:
    //data member
    string name;
    string address;
    string phone;
    vector<User> users;
    static int user_id;
public:
    //member functions
    string generateID(string cname);
    string generatePW();
    Company(string n, string a, string p, vector<Item> & i): users(), inventory(i){ //constructor
    name=n;
    address=a;
    phone=p;
    inventory=i;
    user_id=0;
    }vector<Item> & inventory ;
    //getters
    string GetName();
    string GetAddress();
    string GetPhone();
    vector<User> GetUsers();
    vector<Item> GetItems();
    void addUser(User x);
};
int Company::user_id=0; 
//getters for Company class
string Company::GetName()
{
    return name;
}
string Company::GetAddress()
{
    return address;
}
string Company::GetPhone()
{
    return phone;
}
vector<User> Company::GetUsers()
{
    return users;
}
vector<Item> Company::GetItems()
{
    return inventory;
}
string Company::generateID(string cname) 
{
    user_id=user_id+1;
    string id="";
    
    //Add first name initial
    id=id+cname.substr(0,1);
    //Loop to find last initial
    int temp=0;
    while(cname[temp]!=' '){
        temp++;
    }
    //adding last initial
    id=id+cname[temp+1];
    //calculating length of current user_id
    int length = 1;
    while ( user_id /= 10 )
        length++;
    //adding number to id
    for(int i=0; i<6-length;i++){
        id=id+"0";
    }
    id=id+to_string(user_id);
    return id;
}
string Company::generatePW()
{
    string s="";
    int temp;
    for (int i=0; i<6;i++){
        temp=randint(48,122);
        if(temp>57)
            s=s+":;<=>?@abcdefghijklmnopqrstuvwxyz"[temp-58];
        else{
            s=s+to_string(temp-48);
            }
    }
    return s;
}
void Company::addUser(User x)
{
    users.push_back(x);
}
int main()
{
    //vectors for an order and an inventory
    vector<Item> order;
    vector<Item> inventory;
    
    //Initializing struct objects
    //Initializing date
    Date date;
    date.dd=30;
    date.mm=1;
    date.yy=2017;
    
    //Initializing 2 items
    Item item1, item2;
    item1.price=50.00;
    item1.product_number="001";
    item1.product_name="Speakers";
    item1.quantity=1;
    item2.price=125.00;
    item2.product_number="002";
    item2.product_name="Monitor";
    item2.quantity=5;
    
    //Initializing a name
    Name name;
    name.first_name="Matthew";
    name.initial='S';
    name.last_name="Bartlett";
    
    //Adding items to vectors
    order.push_back(item1);
    order.push_back(item2);
    
    //Updating quantity and adding to inventory vector
    item1.quantity=100;
    item2.quantity=50;
    inventory.push_back(item1);
    inventory.push_back(item2);
    
    //Creating objects for CreditCard, User and Company
    CreditCard card("visa", name, date, "0476038506927697"); //creating CreditCard
    Company temp("Magic Goods", "189 Kenmount Avenue", "709 7733754", inventory);//creating company
    User bill(temp.generateID("Bill Joe"), "Bill Joe", "10 First Drive", "709 1111111", temp.generatePW(), card);//initializing user
    temp.addUser(bill);//adding user to companies vector of users
    
    //Displaying invoice
    cout<<temp.GetName()<<"\n"<<temp.GetAddress()<<"\n"<<temp.GetPhone()<<"\n";//displaying company info
    cout<<"\nOnline Order Invoice/Receipt\n\nDate:"<<date.yy<<"/"<<date.dd<<"/"<<date.mm;//displaying date
    cout<<"\n\nSale: \n\n"<<"Product No    Quantity    Price\n\n";
    double total=0;
    double price;
    for(int i=0; i<order.size(); i++){ //Displays all items in the order
        price=order[i].price*order[i].quantity;
        cout<<order[i].product_number<<"           "<<order[i].quantity<<"           "<<price<<"\n";
        total=total+price;
    }
    
    //Display the total cost
    double tax=total*0.15;
    double shipping=total*0.05;
    double charge=total+tax+shipping;
    cout<<"              SUBTOTAL    "<<total<<"\n";
    cout<<"              HST(15%)    "<<tax<<"\n";
    cout<<"              Shipping    "<<shipping<<"\n";
    cout<<"              Total       "<<charge<<"\n";
    
    //Displaying message including card number
    cout<<"\n$"<<charge<<" has been charged to your credit card: \n";
    cout<<card.GetType()<<": "<<card.blacknumb(card.GetNumber())<<"\n\n";
    
    //Displaying users info/shipping address
    cout<<"Items will ship to: \n";
    cout<<bill.GetName()<<"\n"<<bill.GetAddress()<<"\n"<<bill.GetPhone();
}