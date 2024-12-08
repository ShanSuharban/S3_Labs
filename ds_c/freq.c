#include<stdio.h>

void freq (int a[], int n) {
	
	int b[n],i,count,j;
	for (i=0;i<n;i++) {
		b[i]=0;
	}	
	for (i=0;i<n;i++) { 
		count=0;
		if (b[i]==0) {
			for (j=0;j<n;j++) {
				if (a[i]==a[j]) {
						count++;
						b[j]=1;
				}
			}
			printf ("\nElement %d occurs %d times",a[i],count);
		}
	}

}
void main () {
	int n,i,count;
	printf ("\nEnter the array limit: ");
	scanf ("%d",&n);
	
	int a[n];
	printf ("\nEnter the array elements: ");
	for (i=0;i<n;i++) {
		scanf("%d",&a[i]);
	}
	
	freq (a,n);
}

