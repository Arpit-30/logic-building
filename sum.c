#include<stdio.h>
int main(){
    int number,i,sum=0;
    printf("enter n mumbers");
    scanf("%d",&number);
    for(i=1;i<=number;i++){
        sum=sum+i;
    }
    printf("Sum = %d\n", sum);

    return 0;
}