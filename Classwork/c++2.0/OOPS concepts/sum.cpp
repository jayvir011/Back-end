#include<iostream>
using namespace std;
class calc
{
public:
     void sum(int a,int b)
    {
        int c=a+b;
        cout<<"sum is "<<c<<endl;
    }
    void sub(int a,int b)
    {
        int d=a-b;
        cout<<"sub is "<<d<<endl;
    }
    void mult(int a,int b)
    {
        int e=a*b;
        cout<<"mult is "<<e<<endl;
    }
    void div(int a,int b)
    {
        int f=a/b;
        cout<<"div is "<<f<<endl;
    }
};
int main()
{
    calc c;
    c.sum(10,20);
    c.sub(30,20);
    c.mult(10,20);
    c.div(1000,20);


}
