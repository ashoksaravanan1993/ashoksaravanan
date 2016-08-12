#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
double temp,temp1;
//float median;
int a,count=0, median=0,log2;
clrscr();
scanf("%lf",&temp);
temp1=1<<log2;
for(a=0;a<64;a++)
{
if((temp1 && ((1<<a)=temp1)))
  {
count++;

}
}
median = pow(2,(1<<(count/2)));


printf("median:%f",median);
getch();
}
