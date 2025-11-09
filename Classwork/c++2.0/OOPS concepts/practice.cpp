#include<iostream>
using namespace std;
class base1
{
public:
    void disp()
    {
        cout<< "base 1";
    }
};
class base2
{
public:
    void disp()
    {
        cout<< "base 2";
    }
};
class child:public base1,public base2
{
    void show ()
    {
        cout<< "child";
    }
};
int main()
{
    child obj;
    base1::obj.disp();
}
