#include<iostream>
using namespace std;
int add(int a,int b)
{
    return(a+b);
}
int main()
{
    int a=10;
    char c='a';
    char ch[]="krunal";
    string str="kavya";
    string str2=str;
    float marks=99.99;

    cout<<"hello world"<<endl;
    cout<<"value  of a is"<<a<<endl;
    cout<<marks<<endl;
    cout<<c<<endl;
    cout<<ch<<endl;
    cout<<str<<endl;
    cout<<str2<<endl;
    cout<<add(10,20);
    return 0;
}
