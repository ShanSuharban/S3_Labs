#include<stdio.h>
#include<stdlib.h>

struct Node {
	int data;
	struct Node *link;
}*front=NULL, *rear=NULL, *current;

void enqueue (int x) {
 	struct Node*temp = (struct Node*)malloc(sizeof(struct Node));
	if (temp==NULL)
		printf ("\nInsertion cant be done ");

	else if (front==NULL && rear==NULL ) {
		struct Node *temp=(struct Node *)malloc(sizeof(struct Node));
		temp -> data = x;
		temp -> link = NULL;
		front=temp;
		rear=temp;
	}
	else {
		struct Node *current=front;
		while (current -> link != NULL)
			current = current -> link;
		temp -> data = x;
		current -> link = temp;
		temp -> link = NULL;
		rear=temp;
	}
}

void dequeue () {
	if (front==NULL && rear==NULL)
		printf ("\nEmpty Queue ");

	else if (front==rear) {
		printf ("Deleting %d",front -> data);
		front= NULL; rear=NULL;	
	}
	
	else {
		printf ("Deleting %d",front -> data);
		front = front -> link;
	}
}

void display () {
	printf ("\n Your queue : ");
	if (front==NULL && rear==NULL)
		printf ("\nEmpty Queue");
	else {
		struct Node *current=front;
		while (current != NULL) {
			printf ("%d", current -> data);
			current = current -> link;
		}
	}
}

void main () {
	int choice,i,n;
	do {
		printf ("\n\n1.Enque (): \n2.Dequeue (): \n3.Display (): \n4. Exit (): \n.Enter your choice: ");
		scanf ("%d",&choice);
		switch (choice) {
			case 1:
				printf ("\nEnter no: to insert: ");
				scanf ("%d",&n);
				enqueue (n);
				break;
			case 2:
				dequeue ();
				break;
			case 3:
				display ();
				break;
			case 4:
				exit(0);
			default: 
				printf ("\nInvalid option");
		}
	} while (choice!=4);
}
