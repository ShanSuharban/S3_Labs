#include<stdio.h>

void Merge (int a[] , int low, int mid , int high ) 
{
	int i=low, j=mid+1, k=low;
	int b[100];
	while (i<=mid && j<=high )
	{
		if (a[i]<a[j])
		{
			b[k]=a[i];
			i++;k++;
		}

		else 
		{
			b[k]=a[j];
			j++;k++;
		}
	}

	while (i<=mid)
	{
		b[k]=a[i];
		i++;k++;
	}
	while (j<=high)
	{
		b[k]=a[j];
		j++;k++;
	}

	for (i=low;i<=high;i++)
		a[i]=b[i];

}

void MergeSort (int a[], int low, int high)
{
	if (high>low)
	{
		int mid=(low+high)/2;
		MergeSort (a,low,mid); // recursive calling mergesort for left sub array -> dividing
		MergeSort (a,mid+1,high); // recursive calling mergesort for right sub array -> dividing 
		Merge(a,low,mid,high); // recursive merging two sub arrays after seperation
	}

}

void main () 
{
	int n,i;
	printf ("\nEnter the size of array:  ");
	scanf ("%d",&n);
	int a[n];
	printf ("\nEnter the array elements: ");
	for (i=0;i<n;i++)
		scanf ("%d",&a[i]);

	MergeSort (a,0,n-1);
	printf ("Sorted Array: ");
	for (i=0;i<n;i++)
		printf ("%d\t", a[i]);
	
}
