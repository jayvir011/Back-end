#include<iostream>
using namespace std;
class prac
{
private:
    int a=10;
public:
    friend void disp(prac p);

};
void disp(prac p)
{
    cout<<p.a<<endl;
}
int main()
{
    prac obj;
    disp(obj);
}
