#include<stdio.h>
#include<stdio.h>
#include<stdlib.h>
struct Node {
        int data;
        struct Node *prev;
        struct Node *next;
}*head=NULL, *current;
void insertFirst (int x) {
	 struct Node *temp=(struct Node *)malloc(sizeof(struct Node));
        if (temp==NULL)
                printf ("\nInsertion cant be done ");
	else if (head==NULL) {
		temp -> data = x;
		temp -> next = NULL;
		temp -> prev = NULL;
		head=temp;
	}
	else {
		temp -> data = x;
		temp -> next = head;
		temp -> prev =NULL;
		head -> prev = temp;
		head=temp;
	}
}
void insertLast (int x) {
	struct Node *temp=(struct Node *)malloc(sizeof(struct Node));
        if (temp==NULL)
                printf ("\nInsertion cant be done ");
	else if (head==NULL)
		insertFirst (x);
	else {
		current=head;
		while (current -> next != NULL)
			current = current -> next;
		temp -> data = x;
		current -> next = temp;
		temp -> prev = current;
		temp -> next = NULL;
	}
}

void deleteFirst ( ) {
	if (head == NULL)
		printf ("\nEmpty linked list");

	else if (head -> next == NULL &&  head -> prev == NULL) {
		printf ("Deleting %d", head -> data);
		head=NULL;
	}
	else {
		printf ("Deleting %d", head -> data);
		head = head -> next;
		head -> prev = NULL;
	}
}

void deleteLast () {
	  if (head == NULL)
                printf ("\nEmpty linked list");
          else if (head -> next == NULL)
		deleteFirst();
	 else {
		current = head;
		while (current -> next != NULL) 
			current = current -> next;
		printf ("Deleting %d", current -> data);
		current = current -> prev;
		current -> next =NULL;

	 }
}

void display () {
	 if (head==NULL) 
                printf ("\nEmpty linked list");
	else {
		current=head;
		while (current != NULL) {
			printf ("%d\t", current -> data);
			current = current -> next;
		}
	}

}
void main () {
			int choice,data,ldata,dataloc;
		do {
			printf ("\n\n LinkedList\n1.Insert First \n2.Insert Btw \n3.Insert Last \n4.Delete First \n5.Delete Btw \n6.Delete Last \n7.Display \n8.Exit \nEnter your choice:  ");
			scanf ("%d", &choice);
			switch (choice) {
				case 1: 
					printf ("\nEnter the data: ");
					scanf ("%d",&data);
					insertFirst (data);
					break;

			/*	case 2:
					printf ("Enter the data and dataloc to insert: ");
					scanf ("%d%d",&data,&dataloc);
					insertAtX (data,dataloc);
					break; */

				case 3:
					printf ("\nEnter the data to insert last: ");
					scanf ("%d",&ldata);
					insertLast (ldata);
					break;

				case 4: 
					deleteFirst ();
					break;

				/*case 5:
					printf ("\n Enter the node to be deleted: ");
					scanf ("%d",&data);
					deletebtw (data);
					break; */ 


				case 6:
					deleteLast ();
					break;
			

				case 7:
					display ();
					break;

				case 8: exit (0);

				default:
					printf ("\nInvalid your choice ");
	
			}
		}
		while (choice!=8);

}
