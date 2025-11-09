#include<iostream>
using namespace std;
int main()
{
    int P,R,T,SI;
    cout<<"enter principle : ";
    cin>>P;
    cout<<"enter Rate : ";
    cin>>R;
    cout<<"Enter time in year: ";
    cin>>T;

    SI=(P*R*T)/100;

    cout<<"simplr innterest is : "<<SI;

    return 0;
}
