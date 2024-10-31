#include<stdio.h>
#include<stdlib.h>


void insertionsort (int a[] , int n) {
		int i,j,key;
        	for(i=0;i<n;i++)
        	{
                	key = a[i];
                	j = i-1;
                	while(j>=0&&a[j]>key)
                	{
                        	a[j+1] = a[j];
                        	j--;
	                }
         	}      a[j+1]  = key;
}

void main () {
	int n,i;
	printf ("\nEnter the array limit: ");
	scanf ("%d",&n);
	int a[n];
	printf ("\nEnter the array elements: ");
	for (i=0;i<n;i++) {
		scanf ("%d",&a[i]);
	}
	insertionsort (a,n);

	printf ("\nSorted array: ");
        for (i=0;i<n;i++) {
                printf ("%d\t",a[i]);
        }
	

}
