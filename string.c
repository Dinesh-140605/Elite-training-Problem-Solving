#include <stdio.h>
#include <string.h>
 
int main() {
    int t;
    scanf("%d", &t);
 
   for (int i = 0; i < t; i++) {
        char s[105];
        scanf("%s", s);
 
        int n = strlen(s);
        if (n % 2 == 0 && strncmp(s, s + n/2, n/2) == 0) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }
    }
    return 0;
}