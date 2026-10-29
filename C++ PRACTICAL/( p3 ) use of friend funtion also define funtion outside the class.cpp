#include<iostream>
using namespace std;
class FriendFun
{
	int a,b;
	public:
		void read();
		void friend sum(FriendFun);
};
void FriendFun::read()
{
	cout<<"Enter values of a & b:";
	cin>>a>>b;
}
void sum(FriendFun f)
{
	cout<<"Sum of a & b is: "<<f.a+f.b;
}
int main()
{
	FriendFun f1;
	f1.read();
	sum(f1);
	return 0;
}

