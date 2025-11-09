#include<iostream>
using namespace std;
int main()
{
    int a,b,c;

    cout<<"enter a: ";
    cin>>a;
    cout<<"enter b: ";
    cin>>b;
    cout<<"enter c: ";
    cin>>c;

    if(a>b)
    {
        if(a>b)
        {
            cout<<" a is max"<<endl;
        }
        else{
            cout<<"inner condition is false";
        }
    }
    else
    {
        cout<<"outer condition is false";
    }
}
