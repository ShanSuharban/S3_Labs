#include<stdio.h>
#include<stdlib.h>

struct Node
{
	int coef;
	int exp;
	struct Node*link;
}*head1 = NULL,*head2 = NULL, *head3 = NULL;
void display(struct Node*head, int i)
{
        struct Node *current = head;
        if(i == 1)
		printf("Resultant= ");
        while(current != NULL)
        {
                printf("%dx^%d\t", current -> coef, current -> exp);
                current = current -> link;
        }
	printf("\n");
}


struct Node* insertPoly()
{
	struct Node *head = NULL;
	printf("ENter no of terms:");
	int m;
	scanf("%d",&m);
	for(int i = 0; i< m ;i++)
	{
		                int coef,exp;
                printf("Enter coefficient:");
                scanf("%d",&coef);
                printf("Enter exponent:");
                scanf("%d",&exp);
                printf("\n");

       	struct Node*temp = (struct Node*)malloc(sizeof(struct Node));
        if(temp == NULL)
                printf("Insertion Failed!\n");
        else if(head == NULL)
        {
                temp -> coef = coef;
                temp -> exp = exp;
                temp -> link = NULL;
                head = temp;
        }
        else
        {
                struct Node*current = head;
                while(current -> link != NULL)
                        current = current -> link;
                temp -> coef = coef;
                temp -> exp = exp;
                temp -> link = NULL;
                current -> link = temp;
	}
}
	return head;
}

void insertLast(int coef, int exp)
{
	struct Node*temp = (struct Node*)malloc(sizeof(struct Node));
	if(temp == NULL)
		printf("Insertion Failed!\n");
	else if(head3 == NULL)
	{
		temp -> coef = coef;
		temp -> exp = exp;
		temp -> link = NULL;
		head3 = temp;
	}
	else
	{
		struct Node*current = head3;
		while(current -> link != NULL)
			current = current -> link;
		temp -> coef = coef;
		temp -> exp = exp;
		temp -> link = NULL;
		current -> link = temp;
		
	}

}

void calculate()
{
	struct Node *poly1, *poly2;
	poly1 = head1;
	poly2 = head2;
	while(poly1 != NULL && poly2 != NULL)
	{
		if(poly1 -> exp == poly2 -> exp)
		{
			int coef = poly1 -> coef + poly2 -> coef;
			insertLast(coef,poly1->exp);
			poly1  = poly1 -> link;
			poly2 = poly2 -> link;
		}
		else if( poly1 -> exp > poly2 -> exp)
		{
			insertLast(poly1 -> coef, poly1 -> exp);
			poly1 = poly1 -> link;
		}
		else
		{
			insertLast(poly2 -> coef, poly2 -> exp);
			poly2 = poly2 -> link;
		}
	}
	while(poly1 != NULL)
	{
		insertLast(poly1 -> coef, poly1 -> exp);
		poly1 = poly1 -> link;
	}
	while(poly2 != NULL)
	{
		insertLast(poly2 -> coef, poly2 -> exp);
		poly2 = poly2 -> link;
	}

}

void main()
{
    printf("For Term1\n");
	head1 = insertPoly();
	display(head1,0);

    printf("For Term2\n");
	head2 = insertPoly();
	display(head2,0);

	
	printf("Calculating...........\n");
	display(head1,0);
	printf("+");
	display(head2,0);
	calculate();
	display(head3,1);

}
