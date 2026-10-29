//Q.12] using 2d array print transpose of the martix

#include<stdio.h>

int main(){
	
	//define and declare the array of matrix
	int num[3][3]={{1,2,3},{4,5,6},{7,8,9}};
	
	printf("\nThe matrix before transpose:\n");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			printf("|%d",num[i][j]);
		}
		printf("|\n");
	}
	printf("\nThe matrix after transpose:\n");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			printf("|%d",num[j][i]);
		}
		printf("|\n");
	}
	return 0;
}
