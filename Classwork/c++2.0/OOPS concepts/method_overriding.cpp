#include<iostream>
using namespace std;
class RBI
{
public:
    void rateofinterest()
    {
        cout<< "RBI "<<endl;
    }
};
class SBI:public RBI
{
public:
    void rateofinterest()
    {
        cout<< "SBI "<<endl;
    }
};
int main()
{
    SBI obj;
    obj.rateofinterest();// jo function name andd parameters same hoy toayy je class no object banayo hoy ee j class nu fuction call thase ane jo ee class ma ee function nai hoy to j parent class nu function call thase.
}
