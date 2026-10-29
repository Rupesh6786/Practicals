#include<iostream>
using namespace std;
class Unary
{
	int a;
	public:
		Unary(){}
		Unary(int k)
		{
			a = k;
		}
		void print()
		{
			cout<<" a = "<<a;
		}
		void operator -()
		{
			a = -a;
		}
};
int main()
{
	int h;
	cout<<"Enter value for h: ";
	cin>>h;
	Unary u1(h);
	cout<<" Value of a before overloading: ";
	u1.print();
	-u1;
	cout<<"\n Value of a after overloading: ";
	u1.print();
	return 0;
}

