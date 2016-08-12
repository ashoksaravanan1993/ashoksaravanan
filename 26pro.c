#include<stdio.h>
#include<conio.h>
int main()
{
int i,j;
clrscr();
scanf("%d %d",&i,&j);
if(i==1||j==1)
return 1;
if(i<0&&j<0)
return 0;
printf("%d %d",i,j);
getch();
return 0;
}
