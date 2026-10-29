#include<iostream>
#include<string.h>
using namespace std;
int main()
{
	char str1[30];
	string str2,str3;
	cout <<"enter a char array";
	cin >>str1;
	str2=str3;
	str3=str2;
	cout <<"string in str3:"<<str3<<endl;
	string str4;
	cout<<"enter a stringb";
	cin>>str4;
	if (str3==str4)
	cout<<"string are same";
	else
	cout<<"string are not same";
	return 0 ;
}
