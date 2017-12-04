#include "std_lib_facilities.h"
#include <ctime>
//Appointment class
class Appointment{
public:
    tm* now;
    Appointment(String d, tm *n ):description{d}, now{n}{}
    virtual bool occurs_on(int year,int month,int day)=0;
private: 
    string description;
};

//subclasses of appointment
class OneTime:Appointment{
public:
    virtual bool occurs_on(int year,int month,int day){
        if(year==now->tm_year && month==now->tm_mon && day==now->tm_mday){
            return true;
        }
        else
            return false;
    }
private:
};
class Daily:Appointment{
public:
    virtual bool occurs_on(int year,int month,int day){
        return true; //occurs every day since its a daily appointment
    }
private:
};
class Weekly:Appointment{
public:
    virtual bool occurs_on(int year,int month,int day){
        if(year==now->tm_year && month==now->tm_mon){
            return (day-now->tm_mday)%7==0; //checking that the difference is a multiple of 7
        }
        return false;
    }
private:
};
class Monthly:Appointment{
public:
    virtual bool occurs_on(int year,int month,int day){
        if(year==now->tm_year && month==now->tm_mon){
            return day==now->tm_mday;
        }
        return false;
    }
private:
};
int main(){}