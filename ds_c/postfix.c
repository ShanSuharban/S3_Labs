#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<ctype.h>
#define size 100

int top=-1;
int s[size];

void push (int n) {
	if (top==size-1) 
		printf ("stack is full");

	else {
		top++;
		s[top]=n;
	}
}

int pop () {
	if (top==-1)
		printf ("\nstack is underflow ");

       else {  
		int c = s[top--];
		return c;
	}
}

void main () {
	int op1,op2,result,x,a;
	char exp[100];
	char *c;
	printf ("\nEnter the post fix expression: ");
	scanf ("%s",exp);
	
	c=exp;

	while (*c!='\0') {
		if (isalnum(*c)) {
			 a= (int)*c;
			 a=a-48;
			 push (a);
		}
		else if (!(isalnum(*c))) {
			switch (*c) {
				case '+': 
					op1=pop();
					op2=pop();
					result= op2 + op1;
					push (result);
					break;
				case '-':
					op1=pop();
					op2=pop();
					result= op2 - op1;
					push (result);
					break;

				case '*':
					op1=pop();
					op2=pop();
					result= op2 * op1;
					push (result);
					break;

				case '/':
					op1=pop();
					op2=pop();
					result= op2 /op1;
					push (result);
					break;

				case '^': 
					op1=pop();
					op2=pop();
					result=pow(op2,op1);
					push (result);
					break;

				default:
					printf ("\nInvalid Expression");
				
			}
		}
		c++;

	}
	
	while (top!=-1)
		printf ("\n%d",pop());
}
