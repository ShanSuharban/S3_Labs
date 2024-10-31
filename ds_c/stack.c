#include<stdio.h>
#include<stdlib.h>
#define size 5

int top=-1;
int s[size];

void push (int n) {
	if (top==size-1) 
		printf ("stack is full");

	else {
		top++;
		s[top]=n;
	}
}

void pop () {
	if (top==-1)
		printf ("\nstack is underflow ");

	else 
		printf ("%d",s[top--]);
}

void display () {
	if (top==-1)
		printf ("\nStack is empty ");
	else {
		int i;
		for (i=top; i>=0; i--) {
			printf ("%d\t",s[i]);
		}
	}
}

void main () {
	int choice,n;
	do {
		printf ("\n\n\n1.Push (): \n2. Pop (): \n3. Display () \n4. Exit (): \nEnter your choice:  ");
		scanf ("%d",&choice);
		switch (choice) {
			case 1: 
				printf ("\nEnter the no: to insert: ");
				scanf ("%d",&n);
				push (n);
				break;
			case 2: 
				pop ();
				break;

			case 3: 
				display ();
				break;
			case 4: 
				exit (0);

			default:
				printf ("\nInvalid choice ");			
		} 

	} while (choice!=4);

}
