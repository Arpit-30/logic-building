#include <stdio.h>

int main(){
int i,n;

printf("Enter a number:");
scanf("%d",&n);

if (n<=1)
{
    printf("not a prime number");
    return 0;
}

for(i=2;i<n;i++){
    if(n%i==0){
        printf("not a prime number");
        return 0;
    }
}

printf("its a prime number");

return 0;
}