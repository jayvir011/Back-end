#include<iostream>
using namespace std;
class base
{
public:
    //pure virtual function
    virtual void fun()=0;
    virtual void rateofinterest()=0;

};
class ICICI:public base
{
public:
    //implementationn of the pure virtual function
    void fun()
    {
        cout<< "fun() called";
    }
    void rateofinterest()
    {
        cout<< "ICICI 's bank rate of interest is 5%"<<endl;
    }
};
class SBI : public base
{
public:
    //implementation of the pure virtual function
    void fun()
    {
        cout<< "fun() called";
    }
    void rateofinterest()
    {
        cout<< "SBI 's bank rate of interest is 15%"<<endl;
    }
};
int main()
{
    ICICI d;
    d.rateofinterest();
    SBI obj;
    obj.rateofinterest();
}
