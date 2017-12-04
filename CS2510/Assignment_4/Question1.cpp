//Code for Assignment 4 begins below dotted line
#include "C:\Users\matthew\Downloads\MUN\CS2510\Assignment4\std_lib_facilities.h" 
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
    Company(string n, string a, string pN);
    void addNewItem(Item i);
    void addNewUser(User u);
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
//------------------------------Below are functions for assignment 4------------
//Question1a part i
Company::Company(string n, string a, string pN): users(),inventory(){
    name=n;
    address=a;
    phone=pN;
    user_id=0;  
}
User::User(string n, string address, string pN): card(){
    user_id="";
    userName=n;
    address=a;
    phone_number=pN;
    password="";
}

class Transaction{//Question 1a part ii
private:
    Company tCompany;
    User tUser;
    vector<Item> tItems;
    Date tDate;
    double totalPrice, tax, shipFee, totalCharge;
    bool charged, chipped;
public:
    Transaction(Company c,User u, vector<Item> i, Date d, double t, double sF, bool cha, bool chi);
    Date getDate();
    void print(); //prints receipt
};
//question 1a part iii
Transaction::Transaction(Company c,User u, Vector<Item> i, Date d, double t, double sF, bool cha, bool chi){
    tCompany=c;
    tUser=u;
    tItems=i;
    tDate=d;
    totalPrice=0; tax=t; shipFee=sF; totalCharge=0;
    charged=cha; chipped=chi;
}
Date Transaction::getDate(){
    return tDate;
}

//question 1a part iv
void Transaction::print(){
    totalPrice=0;
    totalCharge=0;
    double tempPrice;
    cout<<tCompany.GetName()<<"\n"<<tCompany.GetAddress()<<"\n"<<tCompany.GetPhone()<<"\n";//displaying company info
    cout<<"\nOnline Order Invoice/Receipt\n\nDate:"<<tDate.yy<<"/"<<tDate.dd<<"/"<<tDate.mm;//displaying date
    cout<<"\n\nSale: \n\n"<<"Product No    Quantity    Price\n\n";
    for(int i=0; i<tItems.size(); i++){
        tempPrice=tItems[i].quantity*tItems[i].price;
        cout<<tItems[i].product_number<<"           "<<tItems[i].quantity<<
                "           "<<tempPrice<<"\n";
        totalPrice=totalPrice+tempPrice;
    }
    totalCharge=(totalPrice+shipFee)*tax;
    cout<<"\n Total Charge: "<<totalCharge;
    
}
struct perDayTrans//question 1a part v
{
    string name;
    Date day;
    vector<Transaction> v;
};

//question 1a part vi
void Company::addNewItem(Item i){
    inventory.push_back(i);
}
void Company::addNewUser(User u){
    users.push_back(u);
}

int main()
{
    //question 1b part i
    string company_name;
    string company_address;
    string company_phone;
    cout<<"Input company name: \n";
    cin>>company_name;
    cout<<"Input company address: \n";
    cin>>company_address;
    cout<<"Input company phone number: \n";
    Company newCompany(company_name, company_address, company_phone);
    //question 1b part ii
    string number,name;
    int quantity;
    double price;
    Item temp;
    cout<<"Enter the product number, product name, quantity and price of all objects in inventory (end with |)";
    while(cin>>number>>name>>quantity>>price){
        if(number=="|")return false;
        temp.price=price;
        temp.quantity=quantity;
        temp.product_name=name;
        temp.product_number=number;
        newCompany.addNewItem(temp);
    }
    
    //question 1b part iii 
    string  uN, a, pN;
    User tempUser;
    cout<<"Enter the username, address and phone number for 3 users.";
    for (int i=0; i<3; i++){
        cin>>uN>>a>>pN;
        User tempUser(uN,a,pN);
        newCompany.addNewUser(tempUser);
    }
}

