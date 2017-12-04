#include "C:\Users\matthew\Downloads\MUN\CS2510\Assignment2\std_lib_facilities.h"

//Function that creates and returns a reversed version of the vector
vector<int> reverse1(vector<int> v2){
    int temp;
    for(int i=0; i<v2.size()/2;i++){
        temp=v2[i];
        v2[i]=v2[v2.size()-1-i];
        v2[v2.size()-1-i]=temp;
    }
    return v2;
}

//Function that reverses a vector
void reverse2(vector<int> & v2){
    int temp;
    for(int i=0; i<v2.size()/2;i++){
        temp=v2[i];
        v2[i]=v2[v2.size()-1-i];
        v2[v2.size()-1-i]=temp;
    }
}
int main()
{
    //initializing variables/vectors
    vector<int> v;
    vector<int> v2;
    int size;
    int x;
    //giving user instructions/taking input
    cout<<"Please enter the length of the vector: \n";
    cin>>size;
    cout<<"Please enter "<<size<<" integers into the vector: \n";
    //Vector elements are input
    for(int i=0; i<size; i++){
        cin>>x;
        v.push_back(x);
    }
    //printing original vector
    cout<<"Original vector: ";
    for(int i=0; i<v.size(); i++){
        cout<<v[i]<<" ";
    }
    cout<<"\n";
    //Printing new reversed vector
    v2=reverse1(v);
    cout<<"New, reversed vector: ";
    for(int i=0; i<v2.size(); i++){
        cout<<v2[i]<<" ";
    }
    cout<<"\n";
    //Printing out original vector reversed
    reverse2(v);
    cout<<"Original vector reversed: ";
    for(int i=0; i<v.size(); i++){
        cout<<v[i]<<" ";
    }
    cout<<"\n";
}
    