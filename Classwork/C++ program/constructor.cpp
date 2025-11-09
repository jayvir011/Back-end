#include<iostream>
using namespace std;
class emp
{
public:
    int eid;
    emp(int e)
    {
        eid=e;
    }
    void show()
    {
        cout<<eid<<endl;
    }
};
int main()
{
    emp e(101);
    emp e1(102);
    e.show();
    e1.show();
}
