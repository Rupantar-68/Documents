#include<stdio.h>
#include<stdlib.h>

typedef struct stk
{
int info;
struct stk *next;
}stack;

//Function prototypes
void push(stack **,int);
int pop(stack **);
int stack_empty(stack **);
void stack_print(stack **);

//Main function
int main()
{
int item,ch;
stack *top=NULL;
while(1)
{
printf("\n1.Push\n2.Pop\n3.Print\n0.Exit\nEnter your choice: ");
scanf("%d",&ch);
switch(ch)
{

case 1:
printf("\nEnter the information: ");
scanf("%d",&item);
push(&top,item);
break;
case 2:
item = pop(&top);
if(item!=9999)
printf("\ninformation poped: %d", item);
break;
case 3:
stack_print(&top);
break;
case 0:
exit(0);
default:
printf("\nInvalid Entry!!.Try again...");

}
}
return(0);
}

//Function to check whether a stack is empty or not
int stack_empty(stack **top)
{
if(*top==NULL)
return(1);

else
return(0);

}

//Fuction to push a element in the stack
void push(stack **top, int item)
{
stack *newnode;
newnode = (stack*)malloc(sizeof(stack));
newnode->info=item;
newnode->next=*top;
*top=newnode;
}

//Fuction to pop a element in the stack
int pop(stack **top)
{
int item;
if(stack_empty(top))
{
printf("Unsderflow!!");
return(9999);
}
stack *temp=*top;
*top=temp->next;
item=temp->info;
temp->next=NULL;

free(temp);
return(item);
}

//Fuction to display a stack
void stack_print(stack **top)
{
stack *loc=*top;
if(loc==NULL)
{
printf("\nStack not created!!");
return;
}
while(loc!=NULL)
{
printf("\n%d", loc->info);
loc=loc->next;
}
return;
}