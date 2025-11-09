#include<iostream>
using namespace std;
class fact
{
public:
    int num=5;
    void pri()
    {
        int fact=1;
        for(int i=num;i>=1;i--)
        {
             fact=fact*i;
        }
        cout<<fact;
    }
};
int main()
{
    fact f1;
    f1.pri();
}
