//Q.12] W.A.P to check whether the given number is palindrome or not

#include<stdio.h>

//function to check palindrome
bool check_palindrome(int num){
	int reversed=0,orignalNum=num;
	while(num!=0){
		reversed=reversed*10+num%10;
		num/=10;
	}
	return (reversed==orignalNum);
}

int main(){
	int num;
	printf("Enter the number(check palindrome or not):");
	scanf("%d",&num);
	printf(check_palindrome(num)?"It's palindrome":"It's not palindrome");
	return 0;
}
