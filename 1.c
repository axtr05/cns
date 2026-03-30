#include <stdio.h>
int main() {
    char s[] = "Hello world";
    for (int i = 0; s[i]; i++)
        s[i] ^= 0;
    printf("%s", s);
    return 0;
}
