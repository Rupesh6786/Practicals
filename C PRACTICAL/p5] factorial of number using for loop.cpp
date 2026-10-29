// Q.5] factorial of number using for loop

#include<stdio.h>

// function to calculate the factorial
int factorial(int num){
	int fact=1;
	for(int i=1;i<=num;i++){
		fact*=i;
	}
	return fact;
}
int main(){
	int num;
	printf("Enter the number to find the factorial:");
	scanf("%d",&num);
	
	printf("The factorial of the %d is %d",num,factorial(num));
	return 0;
}
