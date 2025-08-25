#include<stdio.h>
void main()
{
    int p,r,n,si;
    printf("enter the amount you gave:");
    scanf("%d",&p);
    printf("enter the rate:");
    scanf("%d",&r);
    printf("enter time:");
    scanf("%d",&n);
    si=p*r*n/100;
    printf("simple interest :%d",si);
}
