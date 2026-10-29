#include<iostream>
#include<fstream>
using namespace std;
int main()
{
	int rollno, rollno1;
	char name[30], name1[30];
	ofstream outfile("Results.txt");
	cout<<"Enter Name: ";
	cin>>name;
	cout<<"Enter rollno: ";
	cin>>rollno;
	outfile<<name<<"\n";
	outfile<<rollno<<"\n";
	outfile.close();
	ifstream infile("Results.txt");
	infile>>name1;
	infile>>rollno1;
	cout<<" Name & rollno read from file is as follows:\n";
	cout<<name1<<endl;
	cout<<rollno1<<endl;
	return 0;
}

