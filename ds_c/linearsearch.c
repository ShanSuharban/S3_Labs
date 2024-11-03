#include<stdio.h>

void lsearch (int a[], int n, int b) {
	int i,flag=0;
	for (i=0;i<n;i++) {
		if (a[i]==b) {
			printf ("\nElement found in %d position",i+1);
			flag++;
			break;
		}
	}
	
	if (flag==0)
		printf ("\nElement not found ");
}

void main () {
	int n,b,i;
	printf ("\nEnter the array limit: ");
	scanf ("%d",&n);

	int a[n];
	printf ("\nEnter numbers: ");
	for (i=0;i<n;i++) {
		scanf ("%d",&a[i]);
	}
	printf ("\nEnter the element to be searched: ");
	scanf ("%d",&b);
	
	lsearch (a,n,b);



}
