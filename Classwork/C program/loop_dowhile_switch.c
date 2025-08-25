#include<stdio.h>
void main()
{
    int choose;//initialitation
    int flag;
    do{
        printf("1. C language\n");//
        printf("2. C++ language\n");
        printf("3. java language\n");

        printf("enter your option");
        scanf("%d",&choose);

        switch(choose){
    case 1:
        printf("you selected c language\n");
        1

        break;
    case 2:
        printf("you selected c++ language\n");
        break;
    case 3:
        printf("you selected java language\n");
        break;
    default:
        printf("pls input correct option\n");
        }
        printf("press 4 for continue");
        scanf("%d",&flag);
    }
    while(flag==4);//condition
}
