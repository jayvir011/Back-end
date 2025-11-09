#include<iostream>//constructor e special function chhe,jyare object declare thay tyre automatically call thai jay chhe
using namespace std;
class emp
{
    int eid;
public:
    emp()//default constructor mate je class nu name hoy ee j name api ne lakhvu
    {
        cout<<"enter employee id : ";
        cin>>eid;
    }
    void show()
    {
        cout<<eid<<endl;
    }
};
int main()
{
    emp e,e1;
    e.show();
    e1.show();
}
