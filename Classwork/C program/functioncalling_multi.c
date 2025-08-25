#include<stdio.h>
int multi(int a,int b);
void main(){
int input1;
int input2;
printf("enter num1:");
scanf("%d",&input1);
printf("enter num2:");
scanf("%d",&input2);
int result=multi(input1, input2);
printf("multi is %d",result);
}
int multi(int a, int b){
return a*b;
}
