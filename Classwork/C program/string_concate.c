#include<stdio.h>
#include<string.h>
void main()
{
    char str1[]="hello ";
    char str2[]="world";
    strcat(str1,str2);
    printf("concatenated string: %s",str1);
}
