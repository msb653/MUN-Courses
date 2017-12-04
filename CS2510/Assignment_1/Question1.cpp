#include "C:\Users\matthew\Downloads\MUN\CS2510\Assignment1\std_lib_facilities.h"
int main()
{
    //Variable initialization
    int square;
    int temp_grains;
    int total_grains=0;
    
    //Finding number of squares for at least 1000 grains
    for(square=0; total_grains<1000; square++){
        temp_grains=pow(2, square);
        total_grains=total_grains+temp_grains;
    }
    //Displaying required squares
    cout<<square<<" squares are needed to give the inventor at least 1000"
            <<" grains of rice.\n";
    
    total_grains=0;
    
        //Finding number of squares for at least 1,000,000 grains
    for(square=0; total_grains<1000000; square++){
        temp_grains=pow(2, square);
        total_grains=total_grains+temp_grains;
    }
    //Displaying required squares
    cout<<square<<" squares are needed to give the inventor at least 1,000,000"
            <<" grains of rice.\n";
    
    total_grains=0;
    
    //Finding number of squares for at least 1,000,000,000 grains
    for(square=0; total_grains<1000000000; square++){
        temp_grains=pow(2, square);
        total_grains=total_grains+temp_grains;
    }
    //Displaying required squares
    cout<<square<<" squares are needed to give the inventor at least 1,000,000,000"
            <<" grains of rice.\n";
}