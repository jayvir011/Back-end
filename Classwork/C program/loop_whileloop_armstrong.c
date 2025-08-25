#include<stdio.h>
void main()
{
    int originalnum,num;
    printf("Enter  number:");
    scanf("%d",&originalnum);
    int sum=0;
    num=originalnum;
    while(num>0)
    {
        int temp=num%10;
        int cube;
        cube=temp*temp*temp;
        sum=sum+cube;
        num=num/10;
    }
    if(sum==originalnum)
    {
        printf("%d is a armstrong number",originalnum);
    }
    else
    {
        printf("%d is not armstrong number",originalnum);
    }
}


