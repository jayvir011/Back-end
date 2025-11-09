#include<stdio.h>
void main()
{
    int option,eid,salary;
    char name;
    printf("1. add employee\n");
    printf("2. show employee\n");
    printf("3. exit\n");

    printf("Enter your choice");
    scanf("%d",&option);

    switch(option)
    {
    case 1:
        printf("enter employee name :");
        scanf("%s",&name);
        printf("enter employee ID :");
        scanf("%d",&eid);
        printf("Enter salary :");
        scanf("%d",&salary);
        break;
    case 2:

    }

}
