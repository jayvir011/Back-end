#include<iostream>//hybrid ma multi level hoy chhe and multiple inheritance hoy chhe
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
class C
{
public:
    void getC()
    {
        cout<< "C class"<<endl;
    }
};
class D:public B,public C
{
public:
    void getd()
    {
        cout<< "D class";
    }
};
int main()
{
    D obj;
    obj.getA();
    obj.getB();
    obj.getC();
    obj.getd();
}
