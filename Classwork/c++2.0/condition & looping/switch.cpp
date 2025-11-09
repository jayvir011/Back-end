#include<iostream>
using namespace std;
int main()
{
    int choice,flag;
    do
    {
    cout<<"1. C language"<<endl;
    cout<<"2. C++ language"<<endl;
    cout<<"3. java language"<<endl;

    cout<<"enter your choice :"<<endl;
    cin>>choice;

    switch(choice)
    {
    case 1:
        cout<<"you selected C language"<<endl;
        break;
    case 2:
        cout<<"you selected C++ language"<<endl;
        break;
    case 3:
        cout<<"you selected java language"<<endl;
        break;
    default:
        cout<<"select appropriate option"<<endl;
    }
        cout<<"select 4 for continue";
        cin>>flag;
    }
    while(flag==4);
}
