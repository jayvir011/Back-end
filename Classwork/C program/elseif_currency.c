#include<stdio.h>
void main()
{
    int curr;
    printf("enter currency :");
    scanf("%d",&curr);
    if(curr==10){
        printf("10 note available");
    }
    else if(curr==20){
        printf("20 note available");
    }
    else if(curr==50){
        printf("50 note available");
    }
    else if(curr==100){
        printf("100 note available");
    }
    else{
        printf("%d, sorry note note available", curr);
    }

}
