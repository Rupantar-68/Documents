#include <stdio.h>
#include <stdlib.h> 

struct node
{
int info;
struct node * next;
};
struct node *create(struct node *, int);
void traverse (struct node *);
struct node *begin(struct node * ,int);
struct node *last (struct node *, int);

int main()  
{
    int n, choice;
    struct node*head=NULL;
    do
    {
    printf("\n1.Create\n2. Traverse\n3.Insert in first\n4.Insert in last\n5.Exit\n");
    printf("\nEnter choice:");
    scanf("%d", &choice);
    switch (choice)
        {
        case 1: printf("\nEnter the number of node: "); 
                scanf("%d", &n);
                head=create(head, n);
                break;

        case 2: traverse (head);
                break;

        case 3: printf("\nEnter any number:");
                scanf("%d", &n);
                head=begin (head, n);
                break;

        case 4: printf("\nEnter any number:");
                scanf("%d", &n);
                head=last (head,n);
                break;
        case 5: printf("\nYour Program Has Ended");
                return 0;       
        }
    }
    while (choice!=0);
    return 0;
}
struct node *create (struct node *head, int n)
{
        struct node *ptr, *temp;
        int i, item;
        if (head!=NULL)
    {
        printf("\n list already exists.");
        return (head);
    }
    for (i=1;i<=n;i++)
    {
    printf("\nPlease Enter item: ");
    scanf("%d", &item); 
    ptr=(struct node*) malloc(sizeof (struct node));
    ptr->info=item;
    ptr->next=NULL;
    if (head==NULL)
        head=ptr;
    else
        temp->next=ptr;
        temp=ptr;
    }
        return (head);
}
void traverse (struct node * head)
{
    struct node *loc;
    loc=head;
    while (loc!=NULL)
    {
        printf("\n%d\n", loc->info); 
        loc=loc->next;
    }
}
struct node *begin(struct node *head, int n)
{
    struct node *ptr;
    if (head==NULL)
    {
        printf("the list is empty:");
        return head;
    }
    else
    {
        ptr=(struct node *)malloc(sizeof(struct node));
        ptr->info=n;
        ptr->next=head; 
        head=ptr;
        return (head);
    }
}
struct node *last(struct node *head, int n)
{
    struct node *ptr, *loc;
    if (head==NULL)
    {
        printf("the list is empty: ");
        return head;
    }
    loc=head;
    while(loc->next!=NULL)
        loc=loc->next;
        ptr=(struct node *)malloc(sizeof(struct node)); 
        ptr->info=n;
        ptr->next=NULL;
        loc->next=ptr;
        return (head);
    }

