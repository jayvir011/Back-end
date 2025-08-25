#include<stdio.h>
int sum(int a,int b);//decelare
void main(){//function calling
int input1;
int input2;
int input3;
printf(" enter num 1:");
scanf("%d",&input1);
printf("enter num 2:");
scanf("%d",&input2);
int result=sum(input1,input2);
printf("sum is %d",result);
}
int sum(int a,int b){// implementation
return a+b;
}
