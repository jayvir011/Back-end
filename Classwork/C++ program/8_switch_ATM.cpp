#include<iostream>
using namespace std;
int main()
{
    int balance = 50000,option,withdraw,deposite;

    cout<<"1. check balance"<<endl;
    cout<<"2. withdraw"<<endl;
    cout<<"3. deposite"<<endl;

    cout<<"select option :";
    cin>>option;

    switch(option)
    {
    case 1:
        cout<<"your balance is 50000";
        break;
    case 2:
        cout<<"enter amount to withdraw ";
        cin>>withdraw;
        balance=balance-withdraw;
        cout<<"now your balance is"<<balance;
        break;
    case 3:
        cout<<"enter amount to deposite";
        cin>>deposite;
        balance=balance+deposite;
        break;
    }
}
