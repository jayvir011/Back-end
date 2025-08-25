#include<stdio.h>
void main()
{
    int balance =50000, withdraw,deposite,option;
    int flag;
    do{
    printf("1. check balance\n");
    printf("2. withdraw\n");
    printf("3. deposite\n\n\n");

    printf("select option :");
    scanf("%d",&option);

    switch(option){
case 1:
    printf("your balance is %d.\n ",balance);
    break;
case 2:
    printf("enter amount for withdraw:\n");
    scanf("%d",&withdraw);
    if(withdraw>balance){
        printf("you have influence balance");
    }
    else{
        balance=balance-withdraw;
    printf("NOW your balance is %d\n",balance);
    }
    break;
case 3:
    printf("enter amount for deposite:\n");
    scanf("%d",&deposite);
    balance=balance+deposite;
    printf("Now your balance is %d\n",balance);
    break;
default:
    printf("select appropriate option\n");
    }
    printf("press 4 for continue:\n");
    scanf("%d",&flag);

}
while(flag==4);
}
