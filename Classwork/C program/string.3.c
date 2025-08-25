#include<stdio.h>
#include<string.h>
int main()
{
    char s[20];
    int flag;

    printf("enter the string ");
    scanf("%s",&s);

    printf("%d",flag);
    flag=strcmp(s,"yes");
    if(flag==0)
    {
        printf("login successfull\n");
    }
    printf("you entered %s",s);
}
