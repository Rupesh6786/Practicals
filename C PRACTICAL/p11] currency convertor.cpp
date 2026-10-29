//Q.10] menu driven program currency covertor

#include<stdio.h>

#define USD_TO_INR 85.52
#define INR_TO_USD 0.01169

int main(){
	while(true){
		int option;
		float result,amout;
		printf("\n\nWelcome to Currency converter Program.....!\n\n");
		printf("\nMenu:\n1.INR TO USD\n2.USD TO INR\n3.EXIT");
		printf("\nPlease!,Choose one of the above options:");
		scanf("%d",&option);
		
		if(option == 3){
			printf("Exiting....");
			break;
		}
		
		printf("Enter the Amout:");
		scanf("%f",&amout);
		if(option == 1){
			printf("AMOUNT:\nINR->%.2f\nUSD->%.2f",amout,amout*INR_TO_USD);
		}else if(option == 2){
			printf("AMOUNT:\nINR->%.2f\nUSD->%.2f",amout,amout*INR_TO_USD);
		}
	}
	return 0;
}
