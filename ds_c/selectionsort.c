#include<stdio.h>
#include<stdlib.h>

void swap (int a[], int minindex, int i) {
	int t;
	t=a[minindex];
	a[minindex]=a[i];
	a[i]=t;
}

void selectionsort (int a[] , int n) {
	int minindex,i,j;
	for (i=0;i<n-1;i++) {
		minindex=i;
		for (j=i+1; j<n; j++) {
			if (a[minindex] > a[j]) 
				minindex=j;
		}
		swap (a,minindex,i);
	}

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
	selectionsort (a,n);

	printf ("\nSorted array: ");
        for (i=0;i<n;i++) {
                printf ("%d\t",a[i]);
        }
	

}
