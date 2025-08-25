#include<stdio.h>
void main()
{
    int balance =50000, withdraw,deposite,option;
    printf("1. check balance\n");
    printf("2. withdraw\n");
    printf("3. deposite\n\n\n");

    printf("select option :");
    scanf("%d",&option);

    switch(option){
case 1:
    printf("your balance is 50000.\n ");
    break;
case 2:
    printf("enter amount for withdraw:\n");
    scanf("%d",&withdraw);
    printf("NOW your balance is %d",50000-withdraw);
    break;
case 3:
    printf("enter amount for deposite:\n");
    scanf("%d",&deposite);
    printf("Now your balance is %d",50000+deposite);
    break;
default:
    printf("select appropriate option");
}
}
