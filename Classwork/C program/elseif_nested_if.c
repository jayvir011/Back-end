#include<stdio.h>
void main()
{
    int a=15, b=25, c=30;
    if (a>b)
    {
        if (a>c){
            printf("%d is max",a);
        }
    }
    else
    {
        printf("%d is less than %d",a,b);
    }
}
