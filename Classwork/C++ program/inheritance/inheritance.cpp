#include<iostream>
using namespace std;
class simple
{
public:
    void add(int a,int b)
    {
        cout<<a+b<<endl;
    }
};
class sci:public simple
{
public:
    void square(int a)
    {
        cout<<a*a<<endl;
    }
};
int main()
{
    sci s;
    s.square(10);
    s.add(10,20);
}
