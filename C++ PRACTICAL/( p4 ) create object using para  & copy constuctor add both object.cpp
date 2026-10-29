#include<iostream>
using namespace std;
class Example
{
	int a,b;
	public:
		Example(){}//Default Constructor 
		Example(int c, int d)
		{
			a = c; b = d;
		}
		Example(Example &e1)
		{
			a = e1.a;
			b = e1.b; 
		}
		Example add(Example o1, Example o2)
		{
			Example o3;
			o3.a = o1.a+o2.a;
			o3.b = o1.b+o2.b;
			return o3;
		}
		void print()
		{
			cout<<" Sum of members of both objects is given as: "<<a<<" "<<b;
		}
};
int main()
{
	int c,d;
	cout<<" Enter value of c & d: ";
	cin>>c>>d;
	Example ex1, ex2(c,d), ex3(ex2), ex4;
	ex1 = ex4.add(ex2, ex3);
	ex1.print();
	return 0;
}

