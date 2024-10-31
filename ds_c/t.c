#include<stdio.h>
#include<stdlib.h>
struct node
{
        int data;
        struct node *left;
        struct node *right;
}*root;
struct node *create()
{
        struct node *newnode;
        int x;
        printf("\n Enter data or enter -1:");
        scanf("%d",&x);
        if(x==-1)
        {
                return NULL;
        }
        else
        {
                newnode=(struct node *)malloc(sizeof(struct node));
                newnode->data=x;
                printf("The left child of %d is" ,x);
                newnode->left=create();
                printf("The right child of %d is",x);
                newnode->right=create();
        }
        return newnode;
}
void preorder(struct node *ptr)
{
        if(ptr!=NULL)
        {
                printf(" %d ",ptr->data);
                preorder(ptr->left);
                preorder(ptr->right);
        }
}
void inorder(struct node *ptr)
{
        if(ptr!=NULL)
        {
                inorder(ptr->left);
                printf(" %d ",ptr->data);
                inorder(ptr->right);
        }
}
void postorder(struct node *ptr)
{
        if(ptr!=NULL)
        {
                preorder(ptr->left);
                preorder(ptr->right);
                printf(" %d ",ptr->data);
        }
}
void main()
{
        root=create();
        printf("\n Preorder:");
        preorder(root);
        printf("\n Inorder:");
        inorder(root);
        printf("\n postOrder:");
        postorder(root);
        printf("\n");
}


