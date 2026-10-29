#include<iostream>
using namespace std;
class ArrayObject
{
	int rollno;
	char name[30];
	char clas[10];
	public:
		void read()
		{
			cout<<"Enter roll no ";
			cin>>rollno;
			cout<<" Enter name ";
			cin>>name;
			cout<<" Enter class ";
			cin>>clas;
		}
		void print()
		{
			cout<<" RollNo: "<<rollno<<" Class: "<<clas<<" Name: "<<name;
		}
};
int main()
{
	ArrayObject a[25];//Twenty five objects are created 
	int i,n;
	cout<<"Enter no of students to be processed: ";
	cin>>n;
	for(i = 0; i < n; i++)
	{
		cout<<" Student No"<<i+1<<endl;
		a[i].read();
	}
	cout<<"\nDetails of are as follows \n";
	for(i = 0; i < n; i++)
	{
		cout<<" \nStudent No"<<i+1<<endl;
		a[i].print();
	}
	return 0;
}

