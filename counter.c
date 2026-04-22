#include<stdio.h>
int main(){
    int num,x;
    int digit=0;
    printf("enter the number");
    scanf("%d",&num);

    while(num>0){
        x=num%10;
        num=num/10;
        digit++;
    }
    printf("number of digit  %d",digit);
    return 0;
}