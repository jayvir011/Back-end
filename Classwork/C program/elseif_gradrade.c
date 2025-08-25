#include<stdio.h>
void main()
{
    int marks1,marks2,marks3;
    int total;
    int percentage;
    printf("enter marks1:");
    scanf("%d",&marks1);
    printf("enter marks2:");
    scanf("%d",&marks2);
    printf("enter marks3:");
    scanf("%d",&marks3);
    total=marks1+marks2+marks3;
    percentage=total*100/300;

    if(marks1<=40 || marks2<=40 || marks3<=40){
        printf("you succesfully failed");
    }
    else if(percentage>=90 ){
        printf("your grade is A+");
    }
    else if(percentage>=80 && percentage<90){
        printf("your grade is A");
    }
    else if(percentage>=70 && percentage<80){
        printf("your grade is B");
    }
    else if (percentage>=60 && percentage<70){
        printf("your grade is C");
    }
    else if (percentage>=50 && percentage<60){
        printf("your grade is D");
    }
    else if (percentage>=40 && percentage<50){
        printf("your grade is E");
    }
    else{
        printf("failed");
    }

}
