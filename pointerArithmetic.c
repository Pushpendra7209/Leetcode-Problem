#include <stdio.h>
int main()
{
    int a= 33;
    int *ptr=&a;
    printf("%u\n",&a);
    printf("%u\n",ptr);
     printf("%d\n",*ptr);

    ptr++;
    //ptr=&a;
    printf("%u\n",ptr);
   //  printf("%d\n",*ptr);

}