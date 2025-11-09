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
class C:public A
{

};
class D:public A
{

};
int main()
{
    C s;
    s.add(10,20);
    //s.square(10);//apde ayy c class no object banayo chhe and c pase only a na funnction chhe etle only sum vadu function j execute  thase
}
