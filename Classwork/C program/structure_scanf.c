#include<stdio.h>
#include<string.h>
struct stud {
    int rollno;
    char name[20];
    char city[20];
};
void main()
{
    struct stud s[2];

    for (int i=0;i<2;i++)
    {
        printf("Enter rollno: ");
        scanf("%d",&s[i].rollno);
        printf("\nEnter name: ");
        scanf("%s",&s[i].name);
        printf("\nEnter enter city: ");
        scanf("%s",&s[i].city);
    }
    for (int j=0;j<2;j++)
    {
        printf("%dst student details\n",j+1);
        printf("roll no %d\n",s[j].rollno);
        printf("name %s\n",s[j].name);
        printf("city %s \n\n\n",s[j].city);
    }
}
