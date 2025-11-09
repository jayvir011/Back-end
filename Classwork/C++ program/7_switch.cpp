#include<iostream>
using namespace std;
int main()
{
    int a;
    cout<<"1. c language"<<endl;
    cout<<"2. c++ language"<<endl;
    cout<<"3. java language"<<endl<<endl<<endl;

    cout<<"select option:";
    cin>>a;

    switch(a)
    {
    case 1:
        cout<<"you selected c language "<<endl;
        break;
    case 2:
        cout<<"you selected c++ language "<<endl;
        break;
    case 3:
        cout<<"you selected java language "<<endl;
        break;
    default:
        cout<<"please select correct option"<<endl;
    }
}
