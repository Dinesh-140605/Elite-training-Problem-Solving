#include <stdio.h>

int main() {
    /* //Sum of remainder//
    int n, h;
    scanf("%d %d", &n, &h);

    int width = 0;
    for (int i = 0; i < n; i++) {
        int a;
        scanf("%d", &a);
        if (a <= h) {
            width += 1;   
        } else {
            width += 2;   
        }
    }

    printf("%d\n", width);
    return 0;*/
    //walkthrough//
    /* int n;
    scanf("%d", &n);
    int curr= 0;
    int max = 0;
    for (int i = 0; i < n; i++) {
        int ai, bi;
        scanf("%d %d", &ai, &bi);
        curr-= ai;          
        curr += bi;          
        if (curr > max)
            max = curr;
    }
    printf("%d\n", max);
    return 0;*/
    //Vowels//
    char s[100];
    scanf("%s",s);
    int count =0;
    for(int i=0;s[i]!='\0';i++){
        if(s[i]=='a'||s[i]=='e'||s[i]=='i' ||s[i]=='o'||s[i]=='o'||s[i]=='u'){
            count++;
        }
    }
    printf("%d",count);
    return 0;
}
