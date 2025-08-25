#include<stdio.h>
int  square(int a);
void display();//declare function
void main (){
display();//function calling
int input;
printf("enter number:");
scanf("%d",&input);
int result=square(input);
printf("square is %d",result);
}
void display(){// implementation
printf(" display function evoked");
}
int square(int a){
return a*a;

}/* OR
#include<stdio.h>
int square(int a){//declare function with implementation
return a*a;

}
void main (){//function calling
int input;
printf("enter number:");
scanf("%d",&input);
int result=square(input);
printf("square is %d",result);
}

