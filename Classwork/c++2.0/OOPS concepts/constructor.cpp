#include<iostream>
using namespace std;
class student
{
public :
    int rollno;
    string name;
    string city;
    student()
    {
        cout<<"default constructor"<<endl;
    }
    student(int rollno,string name,string city)
    {
        this->rollno=rollno;
        this->name=name;
        this->city=city;
    }
    void disp()
    {
        cout<<"disp"<<endl;
    }
    void showstudent()
    {
        cout<<rollno<<" "<<name<<" "<<city<<endl;
    }
};
int main()
{
    student s1(101,"jay","radhanpur");
    s1.disp();
    s1.disp();
    student s2;
    s1.showstudent();
    return 0;
}
