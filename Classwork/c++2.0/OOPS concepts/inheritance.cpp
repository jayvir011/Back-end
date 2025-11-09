#include<iostream>
using namespace std;
class calc
{
public:
    void add(int a,int b)
    {
        cout<< "sum :"<<a+b<<endl;
    }
};
class sci:public calc
{
public:
    void square(int c)
    {
        cout<< "square :"<<c*c<<endl;
    }
};
int main()
{
    sci obj;
    obj.add(10,20);
    obj.square(90);
}
