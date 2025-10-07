#include <stdio.h>
#include <string.h>
int main() {
    int t;
    scanf("%d", &t);
    for(int t = 0; t < t; t++) {
        char b[105];
        scanf("%s", b);
        int n = strlen(b);
        printf("%c", b[0]);
        for(int i = 1; i < n; i += 2) {
            printf("%c", b[i]);
        }
        printf("\n");
    }
    return 0;
}
