#include<stdio.h>
#include<string.h>
struct stud {
    int rollno;
    char name[20];
    char city[20];
};
union stud1{
    int rollno;
    char name[20];
    char city[10];
};
void main()
{
    struct stud s1;
    union stud1 s2;
    printf("size of structure is %d\n",sizeof(s1));
    printf("size of union is %d\n",sizeof(s2));
}