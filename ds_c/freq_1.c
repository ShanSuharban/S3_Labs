#include<stdio.h>

int freq (int a[], int n, int key) {
	int i,count=0;
	for (i=0;i<n;i++) {
		if (a[i]==key)
			count++;
	}
	return count;

}
void main () {
	int n,key,i,count;
	printf ("\nEnter the array limit: ");
	scanf ("%d",&n);
	
	int a[n];
	printf ("\nEnter the array elements: ");
	for (i=0;i<n;i++) {
		scanf("%d",&a[i]);
	}
	printf ("Enter the element to be searched : ");
	scanf ("%d",&key);
	
	count=freq (a,n,key);
	printf ("The element %d occurs %d times",key,count );
}

