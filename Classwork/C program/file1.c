#include<stdio.h>
int main()
{
    FILE *fp;
    char ch;
    fp=fopen("file1.c","r");//jo ahiiya r lakhyu hoy to eno matalab read thay chhe
    while(1)//jo apde while ma limit 1 apiye to loop infinite chhaaltu j re
    {
        ch=fgetc(fp);
        if(ch==EOF)
            break;
        printf("%c",ch);
    }
    fclose(fp);
}
