#include<iostream>
using namespace std;
class student
{
public:
    int rollno;
};
int main()
{
    student s1,s2;
    s1.rollno=101;
    s2.rollno=102;
    cout<<"S1 Rollno :"<<s1.rollno<<endl;
    cout<<"S2 Rollno :"<<s2.rollno<<endl;

    return 0;
}
