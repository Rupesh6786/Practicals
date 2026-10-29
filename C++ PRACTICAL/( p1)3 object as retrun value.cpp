#include<iostream>
using namespace std;
class Example
{
		int a,b,c;
	public:
		void read()
		{
			cout<<"Enter values for a & b&c:";
			cin>>a>>b>>c;
		}
		Example sum()
		{
			Example e;
			e.c= a+b+c;
			return e;
		}
		void print()
		{
			cout<<"Sum of a, b &c  after addition is: "<<c;
		}
};
int main()
{
	Example e1,e2;
	e1.read();
	e2 = e1.sum();
	e2.print();
	return 0;
}

