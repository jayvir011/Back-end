#include<iostream>
using namespace std;
int main()
{
    int monthly,annual,tax,tax_amount;
    int netsalary,inhand_salary;
    cout<<"enter your monthly salary : ";
    cin>>monthly;
    annual=monthly*12;

    if(annual>=0 && annual<300000)
    {
        tax=3;
    }
    else if(annual>=300000 && annual<500000)
    {
        tax=5;
    }
    else if(annual>=500000 && annual<700000)
    {
        tax=10;
    }
    tax_amount=annual*tax/100;
    netsalary=annual-tax_amount;
    inhand_salary=netsalary/12;

    cout<<"your monthly in hand salary is "<<inhand_salary;

}
