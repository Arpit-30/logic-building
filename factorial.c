#include <stdio.h>

int main() {
    int i, n;
    long long fac = 1;

    printf("Enter number: ");
    scanf("%d", &n);

    for(i = 1; i <= n; i++) {
        fac = fac * i;
    }

    printf("Factorial of %d is %lld\n", n, fac);

    return 0;
}