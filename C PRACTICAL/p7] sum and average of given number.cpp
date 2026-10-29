// Q.7] W.A.P to find the sum and average of numbers using do while loop

#include<stdio.h>

int main(){
	int num,count,totalcount,sum=0;
	printf("How many number you want to enter:");
	scanf("%d",&count);
	totalcount=count;
	
	printf("Enter the %d Numbers :",count);
	do{
		scanf("%d",&num);
		sum+=num;
		count-=1;
	}while(count!=0);
	
	printf("\nThe Sum of the Number is:%d \nAverage of the number:%.2f",sum,float(sum/totalcount));
	return 0;
}
