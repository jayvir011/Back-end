#include<stdio.h>
int currencyChange(int rupees);
int main()
{
    int rupees;
    printf("Enter amount in rupees: ");
    scanf("%d", &rupees);
    
    int result = currencyChange(rupees);
    printf("amount in  dollars: %d\n", result);
    return 0;
}
int currencyChange(int rupees)
{
    return rupees / 83; 
}