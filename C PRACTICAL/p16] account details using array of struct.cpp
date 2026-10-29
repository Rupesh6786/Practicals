// Q.16] to create a structure named bank ,having field acco no.,name and balance display 5 deatils[array of structure]

#include<stdio.h>

// declare a struct represent a bank
struct bank{
	int acc_no;    // account number
	char name[30]; // account holder name
	float balance; // account balance
};

int main(){
	printf("\n-------Welcome to our XYZ BANK-------- \n please enter the below details correctly!\n");
	struct bank account[5]; // array of structure
	 
	for(int i=0;i<5;i++){
		printf("\nEnter the Details for account %d\n",i+1);
		printf("Account Number:");
		scanf("%d",&account[i].acc_no);
		printf("Name:");
		scanf(" %[^\n]",account[i].name);
		printf("Balance:");
		scanf("%f",&account[i].balance);
	}
	printf("\nBank Account Details!\n-------------------------------");
	printf("\n| Account No.|   Name   | Balance |");
	for(int i=0;i<5;i++){
		printf("\n|  %d      |  %s  | %.2f  |",account[i].acc_no,account[i].name,account[i].balance);
	}
	printf("-------------------------------");	
	return 0;	
}
