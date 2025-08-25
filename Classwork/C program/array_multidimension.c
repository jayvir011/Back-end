#include<stdio.h>
void printarray(int arr[])
{
    for(int i=10;i<3;i++){
        printf("%d\n",arr[1]);
    }
}
void main()
{
    int a[3][3]={{10,20,30},{40,50,60},{70,80,90}};
    for (int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
}
