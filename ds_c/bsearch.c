#include<stdio.h>

int bsearch (int a[], int n, int key) {
	int high,low,mid;
	low=0;
	high=n-1;
	
	while (low<=high) {
		mid=(high+low)/2;
		
		if (a[mid]==key)
			return mid;
		else if (a[mid]>key) 
			high=mid-1;
		else
			low=mid+1;
		
	}
	return -1;
}

void main () {
	int i,j,n,t,key,pos;
	printf ("\nEnter the array limit: ");
	scanf ("%d",&n);
	
	int a[n];

	printf ("\nEnter array elements: ");
	for (i=0;i<n;i++) {
		scanf ("%d",&a[i]);
	}

	printf ("\nEnter the element to be searched: ");
	scanf ("%d",&key);

	//sorting
	for (i=0;i<n-1;i++) {
		for (j=0;j<n-i-1;j++) {
			if (a[j]>a[j+1]) {
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}

	pos=bsearch (a,n,key);
	if (pos==-1)
		printf ("\nElement %d not found",key);
	else
		printf ("\nElement %d found in %d position",key,pos+1);
}

	
