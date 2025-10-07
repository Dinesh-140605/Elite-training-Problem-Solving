#include <stdio.h>
#include <stdlib.h>

long long gcd(long long a, long long b) {
    return (b == 0) ? a : gcd(b, a % b);
}

int main() {
    int t;
    scanf("%d", &t);

    while (t--) {
        int n;
        scanf("%d", &n);
        long long a[n];
        long long sum = 0;

        for (int i = 0; i < n; i++) {
            scanf("%lld", &a[i]);
            sum += a[i];
        }

        if (n == 1) {
            printf("%lld\n", sum);
            continue;
        }
        if (n == 2) {
            long long min_sum = (a[0] > a[1]) ? a[0] : a[1];
            printf("%lld\n", min_sum);
            continue;
        }

        long long g = 0;
        for (int i = 1; i < n; i++) {
            long long diff = llabs(a[i] - a[0]);
            g = gcd(g, diff);
        }

        if (g == 0) {
            
            printf("%lld\n", sum);
        } else if (g == 1) {
            
            printf("-1\n");
        } else {
           
            printf("%lld\n", sum - (sum % g));
        }
    }

    return 0;
}
