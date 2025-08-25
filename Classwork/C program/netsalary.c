//with the use of function calling
#include<stdio.h>
int netsalary(int gross, int tax);//total salary(functoio declaration)
void main()
{
    int basic,DA,HRA,gross,tax;
    printf("enter bassic salary:");
    scanf("%d",&basic);
    DA=2*basic/100;//2 % of basic
    HRA=3*basic/100;//3% of basic
    gross=basic+DA+HRA;
    tax=3*gross/100;//3% of gross
    int result=netsalary(gross,tax);
    printf("net salary is %d",result);
}
int netsalary(int gross,int tax)
{
    return gross-tax;//net salary=gross-tax
}
//without calling function
/*#include<stdio.h>
void main()
{
    int basic,DA,HRA,gross,tax,net;
    printf("enter basic salary:");
    scanf("%d",&basic);
    DA=2*basic/100;
    HRA=3*basic/100;
    gross=basic+DA+HRA;
    tax=3*gross/100;
    net=gross-tax;
    printf("net salary is=%d",net);
}
*/
