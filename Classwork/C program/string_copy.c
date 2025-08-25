#include<stdio.h>
#include<string.h>
void main()
{
    char src[]="source";
    char dest[10];
    strcpy(dest,src);
    printf("copied string :%s\n",dest);
}
