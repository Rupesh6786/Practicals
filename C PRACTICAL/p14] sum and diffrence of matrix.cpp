//Q.14] to find sum and difference of the given matrix

#include<stdio.h>

int main(){
	//define and declare the array of matrix
	int A[3][3]={{1,2,3},{4,5,6},{7,8,9}};
	int B[3][3]={{5,6,4},{3,8,9},{2,9,5}};
	
	printf("\nThe matrix A:\n");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			printf("|%d",A[i][j]);
		}
		printf("|\n");
	}
	printf("\nThe matrix B:\n");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			printf("|%d",B[i][j]);
		}
		printf("|\n");
	}
	printf("\nThe addition of A and B matrix :\n");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			printf("|%d",A[i][j]+B[i][j]);
		}
		printf("|\n");
	}
	printf("\nThe addition of A and B matrix :\n");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			printf("|%d",A[i][j]-B[i][j]);
		}
		printf("|\n");
	}
	return 0;
}
