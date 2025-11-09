#include<stdio.h>
int main()
{
    int a=10;
    int *p;
    p=&a;
    printf("%d\n",a);
    *p=90;
    printf("%d",a);
}
