#include<stdio.h>
#include<stdlib.h>
void insertsort(int a[],int n)
{
        int i,key,j;
        for(i=1;i<n;i++)
        {
                key = a[i];
                j = i-1;
                while(j>=0 && a[j]>key)
                {
                        a[j+1] = a[j];
                        j--;
                }
                a[j+1] = key;
        }

}
void main()
{
        int a[25],n,i;
        printf("Enter the size of array: ");
        scanf("%d",&n);
        printf("Enter the elements: ");
        for(i=0;i<n;i++)
                scanf("%d",&a[i]);
        insertsort(a,n);
        printf("The sorted array is\n");
        for(i=0;i<n;i++)
                printf("\t%d",a[i]);
        printf("\n");
}
