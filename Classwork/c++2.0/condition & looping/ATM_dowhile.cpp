#include<iostream>
using namespace std;
int main()
{
    int amount=50000,withdraw,deposite,choice;
    char flag;
    do
    {
        cout<<"1. check balance"<<endl;
        cout<<"2. withdaw"<<endl;
        cout<<"3. deposite"<<endl;

        cout<<"enter your choice :"
        cin>>choice;

        switch(choice)
        {
        case 1:
            cout<<"your balance is "<<balance;
            break;
        case 2:
            cout<<"enter withdraw amount :";
            cin>>withdraw;
            if(withdraw<balance)
            {
                cout<"you withdraw "<<withdraw;
                balance=balance-withdraw;
            }
            else
            {
                cout<<"influence balance";
            }

            break;
        case 3:
            cout<<"enter amount to deposite";
            cin>>deposite;
            cout<<"you deposite "<<deposite;
            balance=balance+deposite;
        }
    }
}
