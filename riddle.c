#include <stdio.h>
#include <string.h>
 
int main() {
    int n;
    scanf("%d", &n);
    char names[101][101];  
    for (int i = 0; i < n; i++) {
        char current[101];
        scanf("%s", current);
        int count = 0;   
        for (int j = 0; j < i; j++) {
            if (strcmp(names[j], current) == 0) {
                count = 1;
                break;
            }
        }
 
        if (count) {
            printf("YES\n");
        } else {
            printf("NO\n");   
        }
 
        strcpy(names[i], current);
    }
 
    return 0;
}