#include<iostream>
using namespace std;
class A
{
public:
    void getA()
    {
        cout<< "A class"<<endl;
    }
};
class B:public A
{
public:
    void getB()
    {
        cout<< "B class"<<endl;
    }
};
class C:public A
{
public:
    void getC()
    {
        cout<< "C class"<<endl;
    }
};
int main()
{
    C obj;
    obj.getA();
    //obj.getB();
    obj.getC();
}
