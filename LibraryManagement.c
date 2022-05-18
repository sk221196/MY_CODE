#include<stdio.h>
#include<conio.h>
struct lib
{
	int id,bp,f;
	char bn[100],an[100];
}s[100];
int g=0;
void add();
void issue();
void viewIssue();
void Return_book();
int main()
{
	int ch;
	clrscr();
	do
	{
		printf("\n1.Add\n");
		printf("2.IssueBook\n");
		printf("3.ViewIssueBook\n");
		printf("4.ReturnBook\n");
		printf("5.Exit\n");
		scanf("%d",&ch);
		clrscr();
		switch(ch)
		{
			case 1:add();break;
			case 2:issue();break;
			case 3:viewIssue();break;
			case 4:Return_book();break;
			case 5:printf("Thank you");break;
			default:printf("Invalid choice\n");
		}
	}
	while(ch != 5);
	getch();
	return 0;
}
void add()
{
	int ch,i,n;
	printf("1.Add:");
	printf("2.View:");
	scanf("%d",&ch);
	if(ch==1)
	{
		printf("How many Books:");
		scanf("%d",&n);
		for(i=0;i<n;i++)
		{
			printf("Enter Book Name:");
			scanf("%s",s[g].bn);
			printf("Enter Author Name:");
			scanf("%s",s[g].an);
			printf("Enter Book Price:");
			scanf("%d",&s[g].bp);
			printf("Enter Book ID:");
			scanf("%d",&s[g].id);
			s[g].f=1;
			g++;
		}
	}
	else
	{
		for(i=0;i<g;i++)
		{
			if(s[i].f == 1)
			{
			    printf("%s ",s[i].bn);
			    printf("%s ",s[i].an);
			    printf("%d ",s[i].bp);
			    printf("%d ",s[i].id);
			    printf("\n");
			}
		}
	}
}
void issue()
{
	int id,i;
	printf("Enter Book ID:");
	scanf("%d",&id);
	for(i=0;i<g;i++)
	{
		if(s[i].id == id)
		{
			s[i].f=0;
			printf("Book Issued");
			break;
		}
	}
}
void viewIssue()
{
	int i=0,f=1;
	for(i=0;i<g;i++)
	{
	    if(s[i].f == 0)
	    {
	        printf("Issued book: ");
	        printf("%s ",s[i].bn);
			printf("%s ",s[i].an);
			printf("%d ",s[i].bp);
			printf("%d ",s[i].id);
			printf("\n");
			f=0;
        }
        /*if(s[i].f == 0)
        {
            break;
        }*/
	}
	 if(f)
	    {
	        printf("No Book Issued");
	   }

}
void Return_book()
{
    int id,i=0,f=1;
    printf("Enter Book ID:");
    scanf("%d",&id);
    for(i=0;i<g;i++)
    {
        if(s[i].id == id)
        {
            s[i].f=1;
            printf("Book Returned");
            f=0;
        }
        /*else
        {
            printf("No Book Returned");
        }*/
    }
    if(f)
    {
        printf("No Book Returned");
    }
}




















