#include<stdio.h>
void main()
{
    //display cource list
    int choose;
    printf("1. java\n");
    printf("2. PHP\n");
    printf("3. python\n\n\n");

    printf("enter your choice:");
    scanf("%d",&choose);

    switch(choose){
case 1:
    printf("you selected java language\n");
    break;
case 2:
    printf("you selected PHP language\n");
    break;
case 3:
    printf("you selected python language\n");
    break;
default:
    printf("pls choose correct option");
    }
}


//1. balance check
//2. withdraww
//3.deposite
