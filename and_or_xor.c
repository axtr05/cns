#include <stdio.h>
int main() {
    char *a = "Hello world";
    for(int i = 0; a[i]; i++) printf("%c", a[i] & 127);
    printf("\n");
    for(int i = 0; a[i]; i++) printf("%c", a[i] | 127);
    printf("\n");
    for(int i = 0; a[i]; i++) printf("%c", a[i] ^ 127);
    return 0;
}