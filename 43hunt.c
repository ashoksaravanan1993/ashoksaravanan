#include <stdio.h>
#include <string.h>

int main(void) {
    long long int n;
    char a[n];
    int m,i,sum=1;
	scanf("%s",&a);
	n=strlen(a);
	for(i=0;i<n;i++)
	{
	    for(m=i+1;m<=n;m++)
	    {
	      if(a[i]==a[m]){
	         sum=sum+1;
	         i=m;
	          
	      }
	        else
	        {   if(sum==1)
	            {
	                printf("%c",a[i]);
	            }
	            else{
	            printf("%c%d",a[i],sum);}
	            break;
	        }
    	}
      sum=1;
	}
	
return 0;
}
