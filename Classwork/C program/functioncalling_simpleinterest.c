#include<stdio.h>
int SI(int p, int r, int t);
int main()
{
    int principal, rate, time;    printf("Enter principal amount: ");
    scanf("%d", &principal);

    printf("Enter rate of interest: ");
    scanf("%d", &rate);
    printf("Enter time in years: ");
    scanf("%d", &time);
    
    int result = SI(principal, rate, time);
    printf("Simple Interest = %d\n", result);
    return 0;
}
int SI(int p, int r, int t)
{
    return (p * r * t) / 100;
}