#include <stdio.h>
int main() {
    long long n, m, a;
    scanf("%lld %lld %lld", &n, &m, &a);

    long long x = (n + a - 1) / a; 
    long long y = (m + a - 1) / a; 

    printf("%lld\n", x * y);
    return 0;
}
