#include<stdio.h>
#include<string.h>
void  main()
{
    char str[]="hello world";
    char *ptr=strstr(str,"world");
    char a='A';
    int total=a+1;
    printf("%d\n",total);
    printf("%s",ptr);
    if(ptr != NULL)
    {
        printf("first occurance of 'world' at: %d\n",ptr-str+1);
        printf("first occurance of 'world' at: %d\n",*ptr);
        printf("first occurance of 'world' at: %d\n",str);

    }
    else
    {
        printf("'world' not found\n");
    }
}
