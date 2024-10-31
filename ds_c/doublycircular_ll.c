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

	else if (head==NULL ) {
		temp -> data = x;
		temp -> next = temp;
		temp -> prev = temp;
		head=temp;
	}
	else {		
		temp -> data = x;
		temp -> next = head;
		current = head -> prev;
		current -> next = temp;
		head -> prev = temp;
		temp -> prev = current;
		head =temp;
	}
}

void insertAtX (int x, int locdata) {
	struct Node *temp=(struct Node *)malloc(sizeof(struct Node));
        if (temp==NULL)
                printf ("\nInsertion cant be done ");
	else if (head == NULL )
		insertFirst(x);
	else {
		current=head;
		temp -> data = x;
		while (current -> data != locdata) {
			current = current -> next;
		}
		temp -> next = current -> next;
		temp -> prev = current;
		current -> next -> prev = temp;
		current -> next = temp;
	}

} 

void insertLast (int x) {
	struct Node *temp=(struct Node *)malloc(sizeof(struct Node ));
	if (temp==NULL)
		printf ("\nTemp Node cant be created , insertion cant be performed ");
	else if (head==NULL) {
		insertFirst (x);
	}
	else {
		
		temp -> data = x;
		current = head -> prev;
		current -> next = temp;
		temp -> prev = current;
		temp -> next = head;
		head -> prev = temp; 
	}

	

}

void deleteLast () {
	 if (head==NULL)
		printf ("\nEmpty linked list, deletion cant be perform ");
	 else if (head -> next == head && head -> prev == head) {
                printf ("%d", head -> data);
                head=NULL;
        }
	else {
		current = head -> prev;
		printf ("Deleting %d",current -> data);
		current = current -> prev;
		current -> next = head;
		head -> prev = current;
	}
	
}
void deleteFirst () {
	if (head==NULL)
		printf ("\n Temp cant be created");

	else if (head -> next == head && head -> prev == head) {
		printf ("%d", head -> data);
		head=NULL;
	}
	else {
		printf ("Deleting %d",head -> data);
		current = head -> prev;
		head = head -> next;
		head -> prev = current;
		current -> next = head;
	}
	
}
void deletebtw (int x) {


}

void display () {
	if (head==NULL) 
		printf ("\nEmpty linked list");
	else {
		current = head;
		while (current != head -> prev) {
			printf ("%d",current -> data);
			current = current -> next;
		}
		current = head -> prev;
		printf ("%d", current -> data);
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

				case 2:
					printf ("Enter the data and dataloc to insert: ");
					scanf ("%d%d",&data,&dataloc);
					insertAtX (data,dataloc);
					break; 

				case 3:
					printf ("\nEnter the data to insert last: ");
					scanf ("%d",&ldata);
					insertLast (ldata);
					break;

				case 4: 
					deleteFirst ();
					break;

				case 5:
					printf ("\n Enter the node to be deleted: ");
					scanf ("%d",&data);
					deletebtw (data);
					break; 


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
