#include<iostream>
using namespace std;
class Binary
{
	int a,b,c;
	public:
		Binary(){}
		Binary(int l, int m, int n)
		{
			a = l;
			b = m;
			c = n;
		}
		void print()
		{
			cout<<" a = "<<a<<" b = "<<b<<" c = "<<c;
		}
		void operator +(Binary b1)
		{
			a = a+b1.a;
			b = b+b1.b;
			c = c+b1.c;
		}
};
int main()
{
	int i,j,k;
	cout<<" Enter values for i j & k ";
	cin>>i>>j>>k;
	Binary b1(i,j,k);
	cout<<" Enter another values for i j & k: ";
	cin>>i>>j>>k;
	Binary b2(i,j,k);
	cout<<"Values of objects before overlaoding: \n";
	cout<<"b1 =";
	b1.print();
	cout<<"\nb2 = ";
	b2.print();
	b1+b2;
	cout<<"\nAfter Overoading\n";
	b1.print();
	return 0;
}

