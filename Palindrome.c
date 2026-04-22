#include<stdio.h>
int main(){
    int n,i,a=0,original;
    printf("enter  mumbers");
    scanf("%d",&n);
    original=n;
    while(n>0){
        i=n%10;
        a=a*10+i;
        n=n/10;
    }
    if(original == a) {
        printf("Palindrome number\n");
    } else {
        printf("Not a palindrome\n");
    }
    return 0;
}