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
class B
{
public:
    void getB()
    {
        cout<< "B class"<<endl;
    }
};
class C:public B,public A//aay c nu banne class sathe relation chhe pn a and b nu ek bijasathe relation nathi.
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
    obj.getB();
    obj.getC();
}
