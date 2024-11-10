#include<stdio.h>
#include<stdlib.h>

struct Node {
	int data;
	struct Node *left;
	struct Node *right;
}*root;

struct Node *create()
{
	struct Node *newnode;
	int x;
        printf("\nEnter the number or enter -1: ");
        scanf("%d",&x);
        if(x==-1)
		return NULL;
	else {
        	newnode = (struct Node*)malloc(sizeof(struct Node));
		newnode -> data = x;
		printf ("\nThe left child of %d is:  ",x);
		newnode -> left = create ();
		printf ("\nThe right child of %d is: ",x);
		newnode -> right = create();

	}
	return newnode;
}

void preorder (struct Node *ptr) {
	if (ptr!=NULL) {
		printf ("%d", ptr -> data);
		preorder(ptr -> left);
		preorder (ptr -> right);
	}
}

void inorder (struct Node *ptr) {
	if (ptr!=NULL) {
		inorder(ptr -> left);
		printf ("%d", ptr -> data);
		inorder (ptr-> right);

	}
}

void postorder (struct Node *ptr) {
	if (ptr!=NULL) {
		postorder (ptr -> left);
		postorder (ptr -> right);
		printf ("%d", ptr -> data);
	}
}

void main () {
	root=create ();
	printf ("\n Preorder: ");
	preorder (root);
	printf ("\n Inorder: ");
	inorder (root);
	printf ("\n Postorder: ");
	postorder (root);
	printf ("\n");
}
