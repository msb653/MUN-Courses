#include "C:\Users\matthew\Downloads\MUN\CS2510\Assignment2\std_lib_facilities.h" 
//Function for converting letters to matching digits
vector<char> converter(vector<char> & temp)
{
    //for loop to process each element in the vector
    for(int i=0; i<7;i++){
        //switch to check/change each possible letter input
        switch(temp[i]){
            case 'a':case 'b':case 'c': case 'A':case 'B':case 'C':
                temp[i]='2';
                break;
            case 'd':case 'e':case 'f': case 'D':case 'E':case 'F':
                temp[i]='3';
                break;
            case 'g':case 'h':case 'i': case 'G':case 'H':case 'I':
                temp[i]='4';
                break;
            case 'j':case 'k':case 'l': case 'J':case 'K':case 'L':     
                temp[i]='5';
                break;
            case 'm':case 'n':case 'o': case 'M':case 'N':case 'O':
                temp[i]='6';
                break;
            case 'p':case 'q':case 'r': case 's':case 'P':case 'Q':case 'R':case 'S':
                temp[i]='7';
                break;
            case 't':case 'u':case 'v': case 'T':case 'U':case 'V':
                temp[i]='8';
                break;
            case 'w':case 'x':case 'y': case 'z':case 'W':case 'X':case 'Y':case 'Z':
                temp[i]='9';
                break;
            default:
                break;       
        }
    }
    //return new vector with letters removed
    return temp;
}
int main()
{
    //initializing both vectors and a string to hold user input
    vector<char> number(13);
    vector<char> end_number(7);
    string str;
    //getting user input and clarifying the format
    cout<<"Please enter a phone number (in the form 1-234-ABCDEFG): \n";
    cin>>str;
    //checking if the correct length is used (ends program if not)
    //if correct length is used, transfers the input into the vector of chars
    if(str.length()==13){
        for(int i=0; i<13;i++){
            number[i]=str[i];
        }
    }
    else{
        cout<<"Invalid input, please use the mentioned format next time.\n";
        return(0);
    }
    //filling the second vector with the letters at the end of the first vector
    for(int i=6;i<13;i++){
        end_number[-6+i]=number[i];
    }
    //calling function to convert letters to numbers
    end_number=converter(end_number);
   //printing the first 6 chars of the original number
    for(int i=0; i<6; i++){
        cout<<number[i];
    }
    //printing the end of the number after conversion
    for(char i: end_number){
        cout<<i;
    }
}
