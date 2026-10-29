//Q.8] W.A.P to accept name,marks of 3 sub. and return total,avg ,% if more than 40 % then pass else workhard

#include<stdio.h>

int main(){
	char name[100];
	int marks[3],totalmarks=0;
	
	printf("Enter your name:");
	scanf("%s",name);
	
	for(int i=1;i<=3;i++){
		printf("Enter the marks for %d subject(out of 100):",i);
		scanf("%d",&marks[i]);
		totalmarks+=marks[i];
	}
	float percentage = (totalmarks / 300.0) * 100,average = totalmarks / 3.0;
	printf("Total %d \naverage: %.2f \npercentage:%.2f%",totalmarks,average,percentage);
	printf(percentage>=40? "\nyou Pass":"\nwork hard");
	return 0;
}
