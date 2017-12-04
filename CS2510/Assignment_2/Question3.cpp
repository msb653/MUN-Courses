#include "C:\Users\matthew\Downloads\MUN\CS2510\Assignment2\std_lib_facilities.h"
//Function for creating a vector of integers from a vector of roman numerals
vector<int> convert_roman(vector<char> & temp)
{
    //creating empty integer vector
    vector<int> v;
    //filling up vector with integers corresponding to roman numerals
    for(int i=0; i<temp.size(); i++){
        switch(temp[i]){
            case 'I':
                v.push_back(1);
                break;
            case 'V':
                v.push_back(5);
                break;  
            case 'X':
                v.push_back(10);
                break;
            case 'L':
                 v.push_back(50);  
                 break;
            case 'C':
                 v.push_back(100);    
                 break;
            case 'D':
                v.push_back(500);
                break;
            case 'M':
                 v.push_back(1000);   
                 break;
            default:
                cout<<"Invalid input";
                exit (EXIT_FAILURE);
        }
    }
    return v;
}
//Takes vector of integers and returns corresponding roman numeral sum
int calculate_roman(const vector<int> v)
{
    int total=0;
    //applying the given algorithm for computing sum 
    for(int i=0; i<v.size(); i++){
        if(i==v.size()-1 || v[i]>=v[i+1] )
            total=total+v[i];
        else{
            total=total+(v[i+1]-v[i]);
            i++;
        }
        if(i==v.size())
            break;
    }
    return total;
}
int main(){
    //Initializing vectors/variables
    vector<char> v_roman;
    vector<int> v_int;
    char temp;
    int sum;
    //Getting user input
    cout<<"Please enter a Roman numeral one character at a time (end with |):\n";
    while(cin>>temp){
        if(temp=='|')
            break;
        v_roman.push_back(temp);
    }
    //Creating vector of corresponding integers
    v_int=convert_roman(v_roman);
    //Calculating sum
    sum=calculate_roman(v_int);
    //Displaying final result
    cout<<"Roman Numeral: ";
    for(int i=0; i<v_roman.size(); i++){
        cout<<v_roman[i];
    }
    cout<<"\n"<<"Decimal Value: "<<sum;	
}

