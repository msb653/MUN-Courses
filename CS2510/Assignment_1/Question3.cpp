#include "C:\Users\matthew\Downloads\MUN\CS2510\Assignment1\std_lib_facilities.h"
int main()
{
    //Creating variables and vectors
    vector<int> v={8,2,5,1};
    vector<int> g(4);
    int bulls;
    int cows;
    //Giving the user instructions
    cout<<"Enter 4 different integers from 1-9 to begin (Press enter after each integer): \n";
    //Loop for guessing
    while(bulls!=4 && cin>>g[0]>>g[1]>>g[2]>>g[3]){
        bulls=0;
        cows=4;
        for(int i=0; i<=3; i++){
            if (g[i]==v[i]){
                bulls++;
                cows--;
            }
        }
        //Unsuccessful guess message 
        if(bulls<4)
            cout<<bulls<<" bull and "<<cows<<" cow. Please guess again.\n";
        //Successful guess message 
        else
            cout<<bulls<<" bull and "<<cows<<" cow. Congrats, you win!\n";
    }
    return(0);
}
