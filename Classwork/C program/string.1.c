#include<stdio.h>
#include<string.h>
void main()
{
    char str[]="hello world";
    char *ptr=strstr(str,"world");
    printf("%s",ptr);
    if(ptr !=NULL)
        printf("first occurance of 'world' at :%d\n ",ptr-str+1);
    else
        printf("world not found\n");
}
