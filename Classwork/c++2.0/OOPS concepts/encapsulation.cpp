#include<iostream>
using namespace std;
class student
{
private :
    int rollno;
    string name;
    string city;
public :
    void setRollno(int rollno)
    {
        this->rollno=rollno;
    }
    int getRollno()
    {
        return rollno;
    }
    void setName(string name)
    {
        this->name=name;
    }
    string getName()
    {
        return name;
    }
    void setCity(string city)
    {
        this->city=city;
    }
    string getCity()
    {
        return city;
    }
};
int main()
{
    int rollno;
    string name,city;
    student s;
    cout<<"enter roll no :";
    cin>>rollno;
    cout<<"enter name :";
    cin>>name;
    cout<<"enter city :";
    cin>>city;
    s.setRollno(rollno);
    s.setName(name);
    s.setCity(city);
    cout<<"roll no :"<<s.getRollno()<<endl;
    cout<<"name :"<<s.getName()<<endl;
    cout<<"City :"<<s.getCity()<<endl;
    return 0;
}
