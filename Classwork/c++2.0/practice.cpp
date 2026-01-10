#include<iostream>
using namespace std;
class demo
{
private:
    int a=100;
public:
    friend void disp(demo d1);
};
void disp(demo d1)
{
    cout<<d1.a;
}
int main()
{
    demo d1;
    disp(d1);
}
