#include<stdio.h>
void disp()
{
    int x=10;
    static int y=10;//static hoy etle ee variable ma value fix thaii jay.
    printf("x=%d y=%d \n",x,y);
    x++;
    y++;
}
void main ()
{
    disp();
    disp();
    disp();
}
