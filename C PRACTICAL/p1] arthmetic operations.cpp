//Q1] arthmatic operation with user input
#include<stdio.h>

int main(){
	//intialize variables
	int num1,num2;
	printf("welcome to arthmetic operation...");
	
	// get user inputs
	printf("\nEnter the 2 number:");
	scanf("%d %d",&num1,&num2)
	
	//arthmatic operations 
	printf("Addition of %d and %d is %d",num1,num2,num1+num2);
	printf("\nSubstraction of %d and %d is %d",num1,num2,num1-num2);
	printf("\nmultiplication of %d and %d is %d",num1,num2,num1*num2);
	printf("\ndivition of %d and %d is %d",num1,num2,num1/num2);
	printf("\nmodulus of %d and %d is %d",num1,num2,num1%num2);
	return 0;
}
