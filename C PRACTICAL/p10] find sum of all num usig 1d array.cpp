//Q.10] W.A.P to find sum of number using array

#include<stdio.h>

int main(){
	int sum=0,num[50],count;
	printf("\nHow many Number you want to enter:");
	scanf("%d",&count);
	
	for(int i=0;i<count;i++){
		printf("Enter the %d Number:",i+1);
		scanf("%d",&num[i]);
		sum+=num[i];
	}
	printf("\nThe sum of all the Number is %d",sum);
	return 0;
}
