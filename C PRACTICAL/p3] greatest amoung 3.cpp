// Q3] greatest amoung 3 number with user input

#include<stdio.h>

// function to find the greatest amoung 3 number
int greatest_amoung_three(int a,int b,int c){
	if(a>=b && a>=c){
		return a;
	}else if(b>=a && b>=c){
		return b;
	}else{
		return c;
	}
}
int main(){
	int num1,num2,num3;
	printf("Enter 3 number:");
	scanf("%d %d %d",&num1,&num2,&num3);
	printf("The greatest amoung %d,%d and %d is %d",num1,num2,num3,greatest_amoung_three(num1,num2,num3));
	return 0;
}
