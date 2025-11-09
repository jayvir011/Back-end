#include<iostream>
using namespace std;
int main()
{
    int marks1,marks2,marks3;
    int total=0,percentage;
    cout<<"enter maths marks :";
    cin>>marks1;
    cout<<"enter science marks :";
    cin>>marks2;
    cout<<"enter english marks :";
    cin>>marks3;

    total=marks1+marks2+marks3;
    percentage=total*100/300;

    cout<<"your perrcentage is "<<percentage<<endl;

    if(marks1<=40 || marks2<=40 || marks3<=40)
    {
        cout<<"congrats! you succesfully failed";
    }
    else if(percentage>=90)
    {
        cout<<"your grade is A+";
    }
    else if(percentage>=80 && percentage<90)
    {
        cout<<"your grade is A";
    }
    else if(percentage>=70 && percentage<80)
    {
        cout<<"your grade is B";
    }
    else if(percentage>=60 && percentage<70)
    {
        cout<<"your grade is C";
    }
    else if(percentage>=50 && percentage<60)
    {
        cout<<"your grade is D";
    }
    else if(percentage>=40 && percentage<50)
    {
        cout<<"your grade is E";
    }
    else
    {
        cout<<"you failed";
    }
    return 0;

}
