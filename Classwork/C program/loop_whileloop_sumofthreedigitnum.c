#include<stdio.h>
void main()
{
    int num;
    printf("Enter  number:");
    scanf("%d",&num);
    int sum;
    while(num>0)
    {
        int temp=num%10;
        sum=sum+temp;
        num=num/10;
    }
    printf("sum of digit %d",sum);
}
/*armstrong number
153
3*3*3=27
5*5*5=125
1*1*1=1
sum is equal to original value

pelindrome number
banne baju thi vanchta same vanchay
ex.121
