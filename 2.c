#include <stdio.h>
int main() {
    char a[100];
    printf("Enter text: ");
    scanf("%[^\n]", a);
    for(int i=0;a[i];i++) printf("%c", a[i]&127);
    printf("\n");
    for(int i=0;a[i];i++) printf("%c", a[i]|127);
    printf("\n");
    for(int i=0;a[i];i++) printf("%c", a[i]^127);
    return 0;
}
