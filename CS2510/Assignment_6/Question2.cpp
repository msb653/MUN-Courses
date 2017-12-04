#include "std_lib_facilities.h"
//node struct
struct Node{
    string value;
    Node *next;
    Node(const string& v, Node *n=nullptr):value{v}, next{n}{}
};

//singly linked list class
class SL_list{
public:
    SL_list():size{0}{linkFirst=nullptr;}//default constructor
    SL_list(Node *f):size{1}, linkFirst{f}{}//initialization constructor
    //add, erase, find and advance member functions
    Node *add(Node *p, Node *x);
    Node *erase(Node *p);
    Node *find(Node *p, const string& s);
    Node *advance(Node *p, int n);
    
private:
    int size;//change to static?
    Node *linkFirst;
    
};
//add function
Node* SL_list::add(Node* p, Node* x){
    if(x==nullptr) return p;
    if(p==nullptr) return x;
    x->next=p->next;
    p->next=x;
    size=size+1;
    return x;
}
//erase function
Node* SL_list::erase(Node* p){
    if(p==nullptr)return nullptr;//given an empty node
    
    if(p==linkFirst){//parameter is the first link
        linkFirst=linkFirst->next;
        size=size-1;
        return p;
    }
    int count=0;
    Node *current=linkFirst;
    while(count<size){//finding node in list and erasing
        if(current->next==p){
            current->next=p->next;
            size=size-1;
            return p;
        }
        count=count+1;
    }
    return p; //returning p if it isn't found in the list
}
//find function
Node* SL_list::find(Node* p, const string& s){
    while(p){
        if(p->value==s)return p;
        p=p->next;
    }
    return nullptr;
}

//advance function
//only works with positive values since list is singly link
Node* SL_list::advance(Node* p, int n){
    if(p==nullptr || n<=0)return nullptr;
    while(n--){
        if(p->next==nullptr) return nullptr;
        p=p->next;
    }
    return p;    
}

//testing singly linked class
int main(){
    cout<<"\nCreating the list Matthew, Bob, Samuel\n";
    Node *matt=new Node("Matthew");//creating Node
    SL_list nameList(matt);//creating SL_List
    Node *sam=new Node("Samuel");
    nameList.add(matt, sam);//adding sam after matt
    Node *bob=new Node("Bob");
    nameList.add(matt, bob);//inserting bob between matt and sam
    
    cout<<"\nSearching list for Bob (True expected):\n";
    if(nameList.find(matt, "Bob")==nullptr)
        cout<<"False\n";
    else
        cout<<"True\n";
    
    cout<<"\nSearching list for Billy (False expected):\n";
    if(nameList.find(matt, "Bill")==nullptr)
        cout<<"False\n";
    else
        cout<<"True\n";
    
    cout<<"\nDeleting Bob's node and then searching for it (False expected):\n";
    nameList.erase(bob);
    if(nameList.find(matt, "Bob")==nullptr)
        cout<<"False\n";
    else
        cout<<"True\n";
    
    cout<<"\nAdvancing 1 node in list and returning the value (Samuel expected):\n";
    cout<<nameList.advance(matt,1)->value<<"\n";
}
