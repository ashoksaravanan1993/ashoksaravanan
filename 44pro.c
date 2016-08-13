#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

       long int e,r;
    scanf("%ld",&e);
    r=series(e);
    printf("%ld",r);
    return 0;
}
int series(int e)
    {
    int l;
    if(e==1)
        return 3;
    else
    if(e==2)
        return 4;
        else
        {
        if(e%2==0)
            l=4;
        else
            l=3;
        return(10*series((e-1)/2)+l);
    }
}
