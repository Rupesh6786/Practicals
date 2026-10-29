// Q2] to swap the values of 2 variable by call by reference methods

#include<stdio.h>

// function to swap the values of 2 variable..
void swap(int *x,int *y){
	int temp=*x;
	*x=*y;
	*y=temp;
}
int main(){
	int a,b;
	printf("Enter 2 number for swap operations:");
	scanf("%d %d",&a,&b)
	printf("before swap:\na=%d\nb=%d",a,b);
	swap(&a,&b);
	printf("\nafter swap:\na=%d\nb=%d",a,b);
	return 0;
}
