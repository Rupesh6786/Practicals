#include<iostream>
using namespace std;
class Binary
{
	char str[30];
	public:
		void read()
		{
			cin>>str;
		}
		int operator ==(Binary b1)
		{
			int flg = 0;
			for(int i =0,j = 0; (str[i]!='\0'||b1.str[j]!='\0');i++,j++)
			{
				if(str[i]!=b1.str[j])
				{
					flg = 1;
					break;
				}
			}
			return flg;	
		}
		void print()
		{
			cout<<str<<endl;
		}
};
int main()
{
	Binary b1,b2;
	cout<<" Enter 1st String: ";
	b1.read();
	cout<<" Enter 2nd String: ";
	b2.read();
	cout<<" 1st Srtring: ";
	b1.print();
	cout<<" 2nd String: ";
	b2.print();
	if((b1 == b2) == 0)
	cout<<" Both Strings are same ";
	else
	cout<<"Both strings are not same ";
	return 0; 
}

