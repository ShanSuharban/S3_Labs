#include<stdio.h>
void main () {
	int n,i,j,k;
	printf ("\nEnter the array limit: ");
	scanf ("%d",&n);

	int a[n],b[n],c[n];	
	printf ("\nEnter elements: ");
	for (i=0;i<n;i++) {
		scanf ("%d",&a[i]);
	}	

	for (i=0,j=0,k=0;i<n;i++) {
		if (a[i]%2==0) {
			b[j]=a[i];
			j++;
		}
		if  (a[i]%2!=0) { 
			c[k]=a[i];
			k++;
		}
	}
	printf ("\nOdd numbers: ");
	for (i=0;i<j;i++) {
		printf ("%d\t",b[i]);
	}
	printf  ("\nEven numbers: ");
	for (i=0;i<k;i++) {
		printf ("%d\t",c[i]);
	}

}
