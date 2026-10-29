#include<iostream>
using namespace std;
class Evenodd
{
	int a;
	void read()
	{
		cout<<"additon value for n:";
		cin>>n;
	}
	public:
		int n;
		void check()
		{
			read();
			if(n%2==0)
			cout<<n<<"is even"<<endl;
			else
			cout<<n<<"is odd"<<endl;
		}
		void print()
		{
			cout<<"2nd object is assigned a value which is:"<<n;
		}
			
			
};
   int main()
   {
   	Evenodd e1,e2;
   	e2.n=5;
   //e1.read()
    e1.check();
	e2.print();
	return 0;	
   }
