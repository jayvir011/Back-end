#include<iostream>
using namespace std;
class A
{
public:
    void add(int a,int b)
    {
        cout<<a+b<<endl;
    }
};
class B:public A
{

public:
    void square(int a)
    {
        cout<<a*a<<endl;
    }
};
class C
{
public:
    void disp()
    {
        cout<<"C class"<<endl;
    }
};
class D:public B,public C
{

};
int main()
{
    D d;
    d.add(10,20);
    d.disp();
    d.square(15);
}
