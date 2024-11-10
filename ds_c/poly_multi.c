#include <stdio.h>
#include<stdlib.h>
struct node{
    int expo;
    int coef;
    struct node *next;
}*poly1=NULL,*poly2=NULL,*poly3=NULL,*Result=NULL;
struct node * create(struct node *poly,int co,int ex)
{
        struct node *new=malloc(sizeof(struct node));
        new->coef=co;
        new->expo=ex;
        new->next=NULL;
    
        if(poly==NULL)
            poly=new;
        else{
            struct node *temp=malloc(sizeof(struct node));
            temp=poly;
            while(temp->next!=NULL)
            {
                temp=temp->next;
            }
            temp->next=new;
        }
    return poly;
}
struct node *mul(struct node *poly1,struct node *poly2)
{   int x,y;
   struct node *temp1=poly1;
   struct node *temp2=poly2;
   while(temp1!=NULL)
   {
       while(temp2!=NULL)
       {
        poly3=create(poly3,temp1->coef*temp2->coef,temp1->expo+temp2->expo);
        temp2=temp2->next;
       }
       temp2=poly2;
       temp1=temp1->next;
   }
    temp1=poly3;
   while(temp1!=NULL)
   {   if(temp1->expo!=-1)
        {
       temp2=temp1->next;
       while(temp2!=NULL)
       {
           if(temp1->expo==temp2->expo)
           {
            temp1->coef=temp1->coef+temp2->coef;
            temp2->expo=-1;
           }
        temp2=temp2->next;
       }
       Result=create(Result,temp1->coef,temp1->expo);
        }
       temp1=temp1->next;
   }
   return Result;
}
/*struct node *avoidduplicate(struct node *poly)
{
    struct node *temp1=poly;
    struct node *temp2;
    while(temp1!=NULL)
    {
        
        temp2=temp1->next;
        while(temp2!=NULL)
        {   temp=temp2;
            if(temp1->expo==temp2->expo)
            {
                temp1->coef=temp1->coef+temp2->coef;
                cur->next=temp->next;
                free(temp);
            }
            temp2=temp->next;
            cur=cur->next;
        }
        temp1=temp1->next;
    }
    struct node *new = malloc(size)
    
}*/
void display(struct node *poly)
{
    struct node *temp=malloc(sizeof(struct node));
            temp=poly;
            while(temp!=NULL)
            {   if(temp->expo!=0)
                    printf("%dX^%d+",temp->coef,temp->expo);
                else
                    printf("%d",temp->coef);
                temp=temp->next;
            }
}
int main()
{
    int n1,n2,x,y,i;;
    printf("Enter number of terms of poly 1");
    scanf("%d",&n1);
    for(i=0;i<n1;i++)
    {
        printf("Enter COEF and Expo");
        scanf("%d%d",&x,&y);
        poly1=create(poly1,x,y);
    }
    printf("Enter number of terms of poly 2");
    scanf("%d",&n2);
    for(i=0;i<n2;i++)
    {
        printf("Enter COEF and Expo");
        scanf("%d%d",&x,&y);
        poly2=create(poly2,x,y);
    }
    display(poly1);
    printf("\n");
    display(poly2);
    printf("\n");
    poly3=mul(poly1,poly2);
   // poly3=avoidduplicate(poly3);
    display(poly3);
    return 0;
}
