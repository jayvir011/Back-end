#include<iostream>
#include<fstream>
using namespace std;
int main()
{
    fstream fio;
    int rno,fee;
    char name[50];
    cout<< "Enter Roll No :";
    cin>>rno;
    cout<< "\n Enter name :";
    cin>>name;
    cout<< "enter fee :";
    cin>>fee;
    fio.open("student.txt",ios::app);//ios=input output stream & app=append
    fio<<rno<<"\t"<<name<< "\t"<<fee;
    fio.close();

    return 0;
}
