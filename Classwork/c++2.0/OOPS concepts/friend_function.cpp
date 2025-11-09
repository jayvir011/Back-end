#include<iostream>
using namespace std;
class Box
{
    double width,height;
public:
    friend void printwidth(Box box1);
    void setwidth(double wid,double hi);
};
void Box::setwidth(double wid,double hi)
{
    width =wid;
    height=hi;
}
void printwidth(Box box1)
{
    cout<< "width of box :"<<box1.width<<endl;
    cout<< "height of box :"<<box1.height<<endl;
}

int main()
{
    Box box;
    box.setwidth(10.0,20.0);
    printwidth(box);

    Box box2;
    box2.setwidth(30.0,40.0);
    printwidth(box2);
    return 0;
}
