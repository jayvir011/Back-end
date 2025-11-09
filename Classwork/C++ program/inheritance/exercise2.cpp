#include<iostream>
using namespace std;
class Addition
{
public:
    void add(int a,int b)
    {
        cout<<a+b<<endl;
    }
    void add(int a,int b,int c)
    {
        cout<<a+b+c<<endl;
    }
    void add(int a,int b,int c,int d)
    {
        cout<<a+b+c+d<<endl;
    }
};
int main()
{
    Addition a;
    a.add(10,20,30,40);
}
