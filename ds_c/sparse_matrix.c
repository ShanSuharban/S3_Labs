#include<stdio.h>

void sparse (int a[][20], int m, int n) {
	int k=1,i,j,count=0;
	int b[20][3];
	for (i=0;i<m;i++) {
		for (j=0;j<n;j++) {
			if (a[i][j]!=0) {
				b[k][0]=i;
				b[k][1]=j;
				b[k][2]=a[i][j];
				k++;
				count++;
			}
		}
	}
	b[0][0]=m;
	b[0][1]=n;
	b[0][2]=count;

	printf ("\nSparse Matrix: \n");
	for (i=0;i<=count;i++) {
		for (j=0;j<3;j++){
			printf ("%d\t",b[i][j]);
		}
		printf ("\n");
	}
	

}

void main () {
	int m,n,i,j;
	printf ("\nEnter the row and col of matrix: ");
	scanf ("%d%d",&m,&n);
	int a[20][20];

	printf ("\nEnter the matrix elements: ");
	for (i=0;i<m;i++) {
		for (j=0;j<n;j++)  {
			scanf ("%d",&a[i][j]);
		}
	}

	sparse (a,m,n);

}

