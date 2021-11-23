#include <stdio.h>

void printNto1(int n)
{
    if(n==0)
    return;
    
    printf("%d\n",n);
    n=n-1;
    
    printNto1(n);
}

int main() 
{
    printf("Enter the value of N ");
    int n;
    scanf("%d",&n);
    printNto1(n);
    
	return 0;
}