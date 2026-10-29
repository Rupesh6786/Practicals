//Q.9] check whether the input is vowel or not

#include<stdio.h>
#include<ctype.h>

int main(){
	char ch;
	printf("Enter the character:");
	scanf("%c",&ch);
	switch(tolower(ch)){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			printf("%c,It is a vowel",ch);
			break;
		default:
			printf("%c, It is not a Vowel",ch);
	}
	return 0;
}


//using array of vowels methods
/*
#include<stdio.h>
#include<ctype.h>

int main(){
	char ch;
	char vowels[]={'a','e','i','o','u'};
	bool isvowel;
	printf("\nEnter a character:");
	scanf("%c", &ch);
	
	for(int i=0;i<5;i++){
		if(tolower(ch)==vowels[i]){
			isvowel=true;
			break;
		}
	}
	printf(isvowel ? "\nIt is vowel":"\nIt's not a vowel");
	return 0;
}
*/


