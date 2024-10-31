#include<stdio.h>
#include<stdlib.h>

struct Node 
{
	int data;
	struct Node *link;
}*top=NULL,*current;

void push (int x) {
	struct Node *temp=(struct Node * )malloc(sizeof(struct Node));
	if (temp==NULL)
		printf ("\n Node temp cant created ");
	if (top == NULL) {
		temp -> data = x;
		temp -> link = NULL;
		top=temp;
	}
	else {		//insertfirst 
		temp -> data = x;
		temp -> link = top;
		top=temp;
		
	}

}

void pop () {	//deletefirst
	if (top==NULL)
		printf ("\nCant delete, empty linkedlist");
	else {
		printf ("poping %d",top -> data);
		top = top -> link;
	}
}

void display () {
	if (top==NULL)
		printf ("Empty stack ll");
	/*else if (top -> link = NULL) 
		printf ("%d",top -> data); */
	else {
		current=top;
		while (current!=NULL) {
			printf ("%d\t",current -> data);
			current = current -> link;
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
