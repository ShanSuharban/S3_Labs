
#include<stdio.h>
#include<stdlib.h>

struct Node {
	int data;
	struct Node *link;
}*head=NULL;

void insertFirst (int x ) {
	struct Node *temp= (struct Node *)malloc(sizeof(struct Node));
	if (temp==NULL)
		printf ("\nNode is not created and insertion cant be performed");
	else if (head==NULL) {  //one node case
		temp -> data = x;
		head=temp;
		temp -> link = NULL;
	 }

	else {
		temp -> data = x;
		temp -> link = head;
		head=temp;
	}

}

void insertAtX (int x, int locdata) {
	struct Node *temp = (struct Node*)malloc(sizeof(struct Node));
	if (temp==NULL)
		printf ("\ntemp node cant be created, insertion cant be performed ");
	else if (head==NULL)
		insertFirst (x);
	else {
		struct Node *current=head;
		while ( current-> data != locdata) {
			current = current -> link;
		}
		
		if (current!=NULL) {
			temp -> data = x;
			temp -> link = current -> link;
			current -> link = temp;
		}
		else 
			printf ("target element not found ");
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
		struct Node *current=head;
		while (current -> link != NULL) {
			current =current -> link;
		
		}
		temp -> data = x;
		current -> link = temp;
		temp -> link = NULL; 
	}
	

}

void deleteFirst () {
	 if (head==NULL)
		printf ("\nEmpty linked list, deletion cant be perform ");
	else if (head -> link == NULL){
		printf ("\nDeleting %d ", head -> data);
		head = NULL;

	}
	else {
		printf ("\nDeleting %d", head -> data);
		head = head -> link;

	}

}

void deleteLast () {
	if (head==NULL)
		printf ("\nLinked list is empty, deletion cant be performed ");
	else if (head -> link == NULL)
		deleteFirst();
	else {
		struct Node *current=head;
		struct Node *prev=NULL;

		while (current -> link !=NULL) {
			prev=current; 
			current = current->link;
		}
		printf ("Deleting %d",current -> data);
		current=NULL;
		prev -> link = NULL;

	}
}
void deletebtw (int x) {
	if (head==NULL)
		printf ("\nLinked list cant be deleted, empty !");
	else if (head -> link ==  NULL)
		deleteFirst();
	else {
		struct Node *current = head;
		struct Node *prev=NULL;
		while (current -> data!=x) {
			prev=current;
			current = current -> link;
		}

		prev -> link = current -> link;
		printf ("Deleting btw node %d",current -> data);
		free (current);

	}

}

void display () {
	if (head==NULL) 
		printf ("\nEmpty linked list ");
	else {
		struct Node *current=head;
		while (current != NULL) {
			printf ("%d",current -> data);
			current = current -> link;
		} 
		printf ("\n");
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
