w#include<iostream>
using namespace std;
class Cal
{
	private:
		int a,b;
	public:
		void read()
		{
			cout<<"Enter values for a & b: ";
			cin>>a>>b;
		}
		void add()
		{
			cout<<"Sum of "<<a<<" & "<<b<<" is "<<a+b<<endl;
		}
		void sub()
		{
			cout<<"Diff of "<<a<<" & "<<b<<" is "<<a-b<<"\n";
		}
		void mul()
		{
			cout<<"Product of "<<a<<" & "<<b<<" is "<<a*b<<endl;
		}
		void divide()
		{
			if(b==0)
				cout<<"b is 0 and hence division by b is not possible"<<endl;
			else
				cout<<"Division of "<<a<<" by "<<b<<" is "<<a/b<<endl;
		}
		
};
int main()
{
	Cal c;
	c.read();
	c.add();
	c.sub()	;
	c.divide();
	c.mul();
	return 0;
}

