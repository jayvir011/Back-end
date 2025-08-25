#include<stdio.h>
void main()
{
    char s[10]="topse";
    int i=0;
    int count=0;
    while(i<11)
    {
        if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
        {
            count ++;
            printf("vowel is %c\n",s[i]);
        }
        i++;
    }
    printf("the number of vowels %d",count);
}
