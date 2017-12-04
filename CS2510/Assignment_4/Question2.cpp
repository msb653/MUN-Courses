#include "C:\Users\matthew\Downloads\MUN\CS2510\Assignment4\Simple_window.h"  
#include "C:\Users\matthew\Downloads\MUN\CS2510\Assignment4\Graph.h" 
//couldn't get headers working so can't compile
int main(){
    using namespace Graph_lib;
    Point tl(100,100);
    Simple_window win(tl,600,400,"Canvas");
    
    Rectangle house(Point(200,200,100,50));//creating house frame
    house.set_fill_color(Color::red);
    win.attach(house);
    
    Rectangle door(Point(240,230 ), 20,30 );//creating door
    door.set_fill_color(Color::brown;
    win.attach(door);
   
    Rectangle window1(Point(210,210),20,20);//creating both windows
    window1.set_fill_color(Color::blue);
    win.attach(window1);
    Rectangle window2(Point(270,210),20,20);
    window2.set_fill_color(Color::blue);
    win.attach(window2);
    
    Rectangle chimney(Point(210,150),20, 50);//creating chimney
    chimney.set_fill_color(Color::red);
    win.attach(chimney);
    
    Polygon roof;
    roof.add(Point(200,200));//creating roof
    roof.add(Point(250,150));
    roof.add(Point(300,200));
    roof.set_fill_color(Color::green);
    win.attach(roof);
    
}