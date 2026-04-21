#include<stdio.h>
int main(){
    int n,i,a=0;
    printf("enter n mumbers");
    scanf("%d",&n);
    while(n>0){
        i=n%10;
        a=a*10+i;
        n=n/10;
    }
    printf("reversed number:%d\n",a);
    return 0;
}