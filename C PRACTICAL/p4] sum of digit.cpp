//Q4] sum of digit

#include<stdio.h>

//function to find the sum of digit
int sum_of_digit(int num){
	int sum=0,digit;
	while(num!=0){
		digit=num%10;
		sum+=digit;
		num/=10;
	}
	return sum;	
}
int main(){
	int num;
	printf("Enter the number:");
	scanf("%d",&num);
	printf("Sum of digit:%d",sum_of_digit(num));
	return 0;
	
}
