#include<stdio.h>
#include<Conio.h>

int main(){
    int number;
    printf("enter your number");
    scanf("%d",&number);
    if(number>0){
        printf("its an positive number");
    }
    else if(number<0){
        printf("its an negative number");
    }
    else{
        printf("its is zero");
    }
    return 0;
}