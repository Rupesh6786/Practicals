#include<iostream>
using namespace std;
class Example
{
	int a,b;
	public:
		Example(int c, int d)
		{
			a = c; b = d;
		}
		void sum()
		{
			cout<<"Sum of both members is: "<<a+b<<endl;
		}
};
int main()
{
	Example e1(5,6);
	e1.sum();
Example e3 = Example(10,20);
e3.sum();
	int l,m;
	cout<<"\nEnter values for l & m ";
	cin>>l>>m;
	Example e2(l,m);
	e2.sum();
	return 0;
}

