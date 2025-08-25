#include<stdio.h>
int division(int a,int b);
void main()
{
    int input1;
    int input2;

    printf("enter number1:");
    scanf("%d",&input1);
    printf("enter number2:");
    scanf("%d",&input2);
    int result=division(input1,input2);
    printf("division is %d",result);
}
int division (int a,int b){
return a/b;
}
