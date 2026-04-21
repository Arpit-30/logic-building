#include<stdio.h>
#include<Conio.h>

int main(){
    int number;
    printf("enter your number");
    scanf("%d",&number);
    if(number%2==0){
        printf("its an even number");
    }
    else{
        printf("its is an odd number");
    }
    return 0;
}