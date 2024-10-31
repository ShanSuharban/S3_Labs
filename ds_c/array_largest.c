#include<stdio.h>
void main () {
        int n,i,large,small;
        printf ("\nEnter the array limit: ");
        scanf ("%d",&n);

        int a[n];     
        printf ("\nEnter elements: ");
        for (i=0;i<n;i++) {
                scanf ("%d",&a[i]);
        }       
	large=small=a[0];
        for (i=0;i<n;i++) {
                if (a[i]>large) 
                        large=a[i];
                else 
			small=a[i];
	}

        printf ("\nLargest element: %d ",large);
	printf ("\nSmallest element: %d",small);
     
}
