#include<stdio.h>
void main()
{
    int annualsal=640000;
    int tax;
    if (annualsal>=0 && annualsal<300000){
        tax=0;
    }
    else if(annualsal>=300000 && annualsal<500000){
        tax=3;
    }
    else if(annualsal>500000 && annualsal<700000){
        tax=5;
    }
    else{
        tax=10;
    }
    printf("current tax %d",tax);
}

