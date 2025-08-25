#include <stdio.h>
void  main() {

    int max, min,mean, sum = 0,temp;
    int n;
    int arr[100];

    printf("enter number of element:");
    scanf("%d",&n);

    for(int j=0;j<n;j++)
    {
        printf("enter %d element:",j);
        scanf("%d",&arr[j]);
    }
    max=arr[0];
    min=arr[0];

    for (int i=0;i<n;i++)
        {
        sum=sum+arr[i];

        if (arr[0]<arr[i])
        {
            max=arr[i];
        }
        if(arr[0]>arr[i])
        {
            min=arr[i];
        }
        }
        mean=sum/n;
        for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
}
printf("sum is %d \n",sum);
printf("max value is %d\n",max);
printf("min value is %d\n",min);
printf("mean is %d\n",mean);
printf("Sorted array in ascending order: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);

}
}
