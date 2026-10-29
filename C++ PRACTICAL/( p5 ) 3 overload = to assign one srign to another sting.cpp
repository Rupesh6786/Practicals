#include<iostream>
using namespace std;
class Binary
{
	char a[30];
	public:
		void read()
		{
			cout<<"Enter the string: ";
			cin>>a;
		}
		void operator =(Binary b1)
		{
			for(int i = 0; a[i]!='\0';i++)
			a[i]=b1.a[i];
		}
		void print()
		{
			cout<<a;;
		}		
};
int main()
{
	Binary o1,o2;
	o1.read();
	cout<<"\n The string in o1 is: ";
	o1.print();
	o2 = o1;
	cout<<"\n The value in o2 after overloading = is: ";
	o2.print();
	return 0;
}

