#include<iostream>                               //polymorphism matlbb many forms
using namespace std;                             //polymorphism has two types
class addition                                   //1.compile time=overloading->same function name but different parameters
{                                                //2.complile time=overriding->same function naem and same parameters but different implimentation.
public:
    void add(int a,int b)
    {
        cout<< "sum :"<<a+b<<endl;
    }
    void add(int a,int b,int c)
    {
        cout<< "sum :"<<a+b+c<<endl;
    }
    void add(int a,int b,int c,int d)
    {
        cout<< "sum :"<<a+b+c+d<<endl;
    }
};
int main()
{
    addition a;
    a.add(10,20,30);
    a.add(70,80);
}
