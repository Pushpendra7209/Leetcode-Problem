#include <stdio.h>
#include <math.h>
int main(){
	int n;
	printf("Enter the size of array but less than 20: ");
	scanf("%d",&n);
	int a[20], b[20];
	int i = 0;
	printf("Enter contents of first array: ");
	for(i = 0; i < n; i++){
		scanf("%d",&a[i]);
	}
	printf("Enter contents of second array: ");
	for(i = 0; i < n; i++){
		scanf("%d",&b[i]);
	}
	int c[20];
	for(i = 0; i < n; i++){
		c[i] = a[i] * b[i];
	}
	int sum = 0;
	for(i = 0; i < n; i++){
		sum = sum + c[i];
	}
	printf("\n");
	printf("Contents of the arrays are:\n");
	for(i = 0; i < n; i++){
		printf("%d\t%d\t%d\n",a[i], b[i], c[i]);
	}
	printf("Square root of sum of elements of z is: %0.2f",sqrt(sum));
	return 0;	
}
