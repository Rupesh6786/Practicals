#include<iostream>
using namespace std;
class A
{
	int a;
	public:
	void reada()
	{
		cout<<"Enter value for a: ";
		cin>>a;
	}
	void printa()
	{
		cout<<"a = "<<a<<endl;
	}
};
class B:public A
{
	int b;
	public:
		void readb()
		{
			cout<<"Enter value for b: ";
			cin>>b;
		}
		void printb()
		{
			cout<<"b = "<<b<<endl;
		}
};
class C:public B //C is also inherited via B
{
	int c;
	public:
		void readc()
		{
			cout<<"Enter value for c: ";
			cin>>c;
		}
		void printc()
		{
			cout<<"c = "<<c<<endl;
		}
};
int main()
{
	A a1;
	B b1;
	C c1;
	cout<<"Through class A"<<endl;
	a1.reada();
	a1.printa();
	//a1.readb();//Not allowed as A is inherited in B and not vice versa
	//a1.printb();//Not allowed as A is inherited in B and not vice versa
	cout<<"Through class B"<<endl;
	cout<<"Members of class A\n";
	b1.reada();
	b1.printa();
	cout<<"Members of class B\n";
	b1.readb();
	b1.printb();
	cout<<"Through class C"<<endl;
	cout<<"Members of class A\n";
	c1.reada();
	c1.printa();
	cout<<"Members of class B\n";
	c1.readb();
	c1.printb();
	cout<<"Members of class C\n";
	c1.readc();
	c1.printc();
	return 0;	
}

