#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#define size 100

int top=-1;
char s[size];

void push (char c) {
	if (top==size-1) 
		printf ("stack is full");

	else {
		top++;
		s[top]=c;
	}
}

char pop () {
	if (top==-1)
		printf ("\nstack is underflow ");

	else {
		char b = s[top--];
		return b;
	}
}

int priority (char x) {
		if (x=='^')
			return 3;
		else if (x=='*' || x=='/')
			return 2;
		else if (x=='+' || x == '-')
			return 1;
		else 
			return 0;
}


void main () {
		char exp[100];
		char *c;
		char x;
		printf ("\nEnter the infix expression: ");
		scanf ("%s",exp);

		c=exp;

		while (*c!='\0') {
			if (isalnum (*c))
				printf ("%c",*c);
			else if (*c=='(')
				push (*c);
			else if (*c==')') {
				while ((x=pop())!='(')
					printf ("%c",x);
			}

			else {
				while (priority(s[top])>=priority(*c)) {
					printf ("%c",pop());
				}
				push (*c);
			}
				c++;

		}
				
		while (top!=-1)
			printf ("%c",pop());
		
}


