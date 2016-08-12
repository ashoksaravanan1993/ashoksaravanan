#include<stdio.h>
#include<conio.h>
int main()
{
int m,n;
clrscr();
scanf("%d %d",&m,&n);
if(m==1||n==1)
return 1;
if(m<0&&n<0)
return 0;
printf("%d %d",m,n);
getch();
return 0;
}
