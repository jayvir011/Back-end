#include<iostream>
using namespace std;
int main()
{
    int num1,num2,sum,sub,mult,div;

    cout<<"Enter number 1 : ";
    cin>>num1;
    cout<<"Enter number 2 : ";
    cin>>num2;

    sum=num1+num2;
    sub=num1-num2;
    mult=num1*num2;
    div=num1/num2;

    cout<<num1<<"+"<<num2<<"="<<sum<<endl;
    cout<<num1<<"-"<<num2<<"="<<sub<<endl;
    cout<<num1<<"*"<<num2<<"="<<mult<<endl;
    cout<<num1<<"/"<<num2<<"="<<div<<endl;

    return 0;
}
