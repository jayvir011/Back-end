#include<iostream>
#include<fstream>//
using namespace std;
int main()
{
    int rno,fee;
    string name;
    ifstream fin("student.txt");//
    while(getline(fin,name))
    {
        fin>>rno>>name>>fee;
        cout<<name<< " "<<rno<<endl;
    }
    fin.close();
}
