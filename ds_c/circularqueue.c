#include<stdio.h>
#include<stdlib.h>
#define maxsize 5
int q[maxsize];
int front=-1, rear=-1;

void enqueue (int n) {
	if ((rear+1)%maxsize==front)
		printf ("queue is full ");

	else if (front==-1 || rear==-1) {
		rear=front=0;
		q[rear]=n;
	}

	else {
		rear=((rear+1)%maxsize);
		q[rear]=n;
	}	
}

void dequeue () {
	if (front==-1)
		printf ("no element present");
	else if (front==rear) {
		printf ("%d\t",q[front]);
		front=-1; rear=-1;
	}
	else {
		printf ("%d\t",q[front]);
		front=(front+1)%maxsize;
	}
}
void display () {
	int i;
	if (rear==-1 || front==-1)
		printf ("\nQueue is empty");

	else if (front<=rear) {
 
		for (i=front; i<=rear; i++) {
			printf ("%d\t",q[i]);
		}
	}
	else {
		for (i=front;i<maxsize;i++) 
			printf ("%d\t",q[i]);
		for (i=0;i<=rear;i++)
			printf ("%d\t",q[i]);
	}
}
	

void main () {
	int choice,i,n;
	do {
		printf ("\n\nCircular \n1.Enque (): \n2.Dequeue (): \n3.Display (): \n4. Exit (): \n.Enter your choice: ");
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
