#include<iostream>
using namespace std;
class Example
{
	int a,b;
	public:
		void read()
		{
				cout<<"Enter values for a & b:";
				cin>>a>>b;
		}
		void print()
		{
			cout<<"Values of a & b is: ";
			cout<<a<<" "<<b<<endl;
		}
		void sum()
		{
			cout<<"Sum of a & b is "<<a+b;
		}
};
int main()
{
	Example e1, e2; 
	cout<<"Object e1 output\n";
	e1.read();
	e1.print();
	e1.sum();
	cout<<"\nObject e2 output\n";
	e2.read();
	e2.print();
	e2.sum();
	return 0;	
}

