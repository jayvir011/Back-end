#include<iostream>
using namespace std;

    class MyClass
    {
    public:
        static int count1;
        MyClass()
        {
            cout<<count1<<endl;
            count1++;
        }
    };
    int MyClass::count1=1;
    int main()
    {
        MyClass e,e1;
    }
/*#include<iostream>
using namespace std;
int i=1;
class emp
{
public:
    emp()
    {
        cout<<i<<endl;
        i++;
    }

};
int main()
{
    emp e,e1;

}*/
