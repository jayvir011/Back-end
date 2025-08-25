#include<stdio.h>
void main()
{
    int a=10;
    int*p;//&a etle a nu address thay
    p=&a;//p ne a ni supari api dhyan rakhva mate
    printf("variable address %x\n",&a);//%x is used for hexadecimal
    printf("pointer address %x\n",p);
    printf("a value %d\n",a);//%d is used for int
    printf("p value %d\n\n",*p);
    a=20;
    printf("variable address %x\n",&a);
    printf("pointer address %x\n",p);
    printf("after change a value p value %d\n\n",*p);
    *p=30;
    printf("variable address %x\n",&a);
    printf("pointer address %x\n",p);
    printf("a value %d\n",a);
}
//insert student
    //how much student you want to insert
//show all student
//  search student by roll no

