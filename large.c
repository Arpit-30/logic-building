#include<stdio.h>

int main(){
    int a,b,c;
    printf("enter 1st number");
    scanf("%d",&a);
    printf("enter 2nd number");
    scanf("%d",&b);
    printf("enter 3rd number");
    scanf("%d",&c);
    if(a>b&&a>c){
        printf("A is larger number");
    }
    else if(b>c){
        printf("B is greater");
    }
    else{
        printf("c is greater");
    }
    return 0;
}