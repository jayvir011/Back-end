#include<stdio.h>
#include<conio.h>

void main(){

    int arr[3],i=0,j,temp;

    while(i<3){
        printf("Enter your arr %d :",i+1);
        scanf("%d",&arr[i]);
        i++;
    }

    i= 0;

    while(i<3){
        printf("A[%d] : %d\n",i,arr[i]);
        i++;
    }

    printf("Asceding order : \n");

    for(i=0;i<3;i++){
        for(j=i+1;j<3;j++){
            if(arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

     i= 0;

    while(i<3){
        printf("A[%d] : %d\n",i,arr[i]);
        i++;
    }

    getch();

}
