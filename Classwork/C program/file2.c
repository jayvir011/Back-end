#include<stdio.h>
int main()
{
    FILE *fp1;//FILE is file constant and fp is name of variable.
    fp1=fopen("file1.txt","w");//file opening //w etle open kareli file ma write karva nu chhe
    fprintf(fp1,"jayvir\n");
    fprintf(fp1,"raj\n");
    printf("file written");
    fclose(fp1);
    return 0;
}
