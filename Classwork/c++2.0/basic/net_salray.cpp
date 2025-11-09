#include<iostream>
using namespace std;
int main()
{
    int basic_sal,DA,HRA,gross_sal,tax,net;
    cout<<"Enter your basic sal: ";
    cin>>basic_sal;

    DA=(basic_sal*2)/100;
    HRA=(basic_sal*3)/100;
    gross_sal=basic_sal+DA+HRA;
    tax=(gross_sal*3)/100;
    net=gross_sal-tax;

    cout<<"your net salary is "<<net;

    return 0;
}
