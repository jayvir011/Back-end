#include<stdio.h>
void main()
{
    int monthlysal;//total-tax (monthly)
    int annualsal;
    int tax;
    int inhandsal;
    int tax_amount;
    printf("enter your monthly total salary:");
    scanf("%d",&monthlysal);

    annualsal=monthlysal*12;

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
    tax_amount=monthlysal*tax/100;
    inhandsal=monthlysal-tax_amount;
    printf("your inhand salary is %d",inhandsal);
}
