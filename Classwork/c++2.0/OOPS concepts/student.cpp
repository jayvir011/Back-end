#include<iostream>
using namespace std;
class student
{
public:
    int rollno;//instance var
    string name;
    string  city;

    void insertstudent(int r,string n,string c)//local var
    {
        rollno=r;
        name=n;
        city=c;
    }

    void showstudent()
    {
        cout<<rollno<<" "<<name<<" "<<city<<endl;
    }
};
int main()
    {
        student s1,s2;
        s1.insertstudent(101,"manish","jharkhand");
        s1.showstudent();
        s2.insertstudent(102,"yash","surat");
        s2.showstudent();

        return 0;
    }
/*
employee data
insert id,name,basicsal
show employee id,name,da,hra,tax,netsal.
useer thi input levo.
