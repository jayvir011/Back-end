#include<stdio.h>
int k=10;
void disp()
{
    printf("disp %d",k);
}
void main()
{
    k++;
    printf("main %d",k);
    disp();
}
