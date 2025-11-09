#include<iostream>
using namespace std;
class calculator
{
    int num1,num2;
public:
    calculator()
    {
        cout<<"number 1 : ";
        cin>>num1;
        cout<<"number 2 : ";
        cin>>num2;
    }
    void addition()
    {
        cout<<"addition = "<<(num1+num2);
    }
    void substraction()
    {
        cout<<"substraction  = "<<(num1-num2);
    }
    void multiplication()
    {
        cout<<"multiplication = "<<(num1*num2);
    }
    void division()
    {
        cout<<"dividion = "<<(num1/num2);
    }

};
int main()
{
    calculator c;
    int choice;
    cout<<"1. sum"<<endl;
    cout<<"2. sub"<<endl;
    cout<<"3. mult"<<endl;
    cout<<"4. div"<<endl;

    cout<<"enter your choice : ";
    cin>>choice;

    switch(choice)
    {
        case 1: c.addition(); break;
        case 2: c.substraction(); break;
        case 3: c.multiplication(); break;
        case 4: c.division(); break;
        default: cout << "Invalid choice!" << endl;
    }
}
