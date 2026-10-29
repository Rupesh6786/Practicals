//Q.15] check whether the given number is armstrong or not

#include<stdio.h>
#include<math.h>

bool check_armstrong(int num){
	int rem,sum=0,n=0; // declare variables
	int orignalNum=num;
	while(orignalNum!=0){ n++,orignalNum/=10;} // count the number digit in input field
	orignalNum=num;
	while(num!=0){ 
		rem=num%10;
		sum+=pow(rem,n); // find sum of all digit 
		num/=10;
	} 
	return (orignalNum==sum);
}

int main(){
	int num;
	printf("Enter the number(check armstrong):");
	scanf("%d",&num);
	printf(check_armstrong(num)?"It's armstong":"It's not armstong");
	return 0;
}
