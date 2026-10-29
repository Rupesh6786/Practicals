#include<iostream>
using namespace std;
class FriendFun2; 
class FriendFun1
{
	int a,b;
	public:
		void read()
		{
			cout<<" Enter values for a & b: ";
			cin>>a>>b;
		}
		void friend sum(FriendFun1,FriendFun2);
};
class FriendFun2
{
	int c,d;
	public:
		void read()
		{
			cout<<" Enter values for c & d: ";
			cin>>c>>d;
		}
		void friend sum(FriendFun1,FriendFun2);
};
void sum(FriendFun1 f1, FriendFun2 f2)
{
	cout<<" Sum of corresponding members from both classes is: "<<f1.a+f2.c<<" "<<f1.b+f2.d;
}
int main()
{
	FriendFun1 o1;
	FriendFun2 o2;
	o1.read();
	o2.read();
	sum(o1,o2);
	return 0;
}

