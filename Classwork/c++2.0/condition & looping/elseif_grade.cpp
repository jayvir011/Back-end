#include<iostream>
using namespace std;
int main()
{
    int marks1,marks2,marks3,percentage,total;
    cout<<"Enter marks1 :";
    cin>>marks1;
    cout<<"Enter marks2 :";
    cin>>marks2;
    cout<<"Enter marks3 :";
    cin>>marks3;

    total=marks1+marks2+marks3;
    percentage=total/3;

    if(marks1>40 && marks2>40 && marks3>40)
    {
        if(percentage>=90)
        {
            cout<<"your grade is A+"<<endl;
        }
        else if(percentage>=80 && percentage<90)
        {
            cout<<"your grade is A"<<endl;
        }
        else if(percentage>=70 && percentage<80)
        {
            cout<<"your grade is B"<<endl;
        }
        else if(percentage>=60 && percentage<70)
        {
            cout<<"your grade is C"<<endl;
        }
        else if(percentage>=50 && percentage<60)
        {
            cout<<"your grade is D"<<endl;
        }
        else if(percentage>=40 && percentage<50)
        {
            cout<<"your grade is E"<<endl;
        }
        cout<< "your percentage is "<<percentage<<endl;
    }
    else
    {
        cout<<"you successfully failed ";
    }
}
