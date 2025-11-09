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
class B
{
public:
    void square(int a)
    {
        cout<<a*a<<endl;
    }
};
class C:public A,public B
{

};
int main()
{
    C c;
    c.add(10,20);
    c.square(10);
}
