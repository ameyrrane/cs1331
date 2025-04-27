#include <stdio.h>
#define SIZE 3
int main(void)
{
    char *faculty[SIZE] = {"David", "Yulia", "Doug"};

    for (int i = 0; i < SIZE; i++)
    {
        printf("%s\n", faculty[i]);
    }
}