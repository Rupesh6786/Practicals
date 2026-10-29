#include<iostream>
using namespace std;
class DynIntArray
{
	int *p, len;
	public:
		DynIntArray(int k)
		{
			len = k;
			p = new int(len);
		}
		void read()
		{
			cout<<" Enter elements of aaary: ";
			for(int i = 0; i < len; i++)
				cin>>p[i];
		}
		void MaxMin()
		{
			int max = p[0];
			int min = p[0];
			for(int  i =0 ; i < len; i++)
			{
			
				if(p[i]> max)
				max = p[i];
				if(p[i]<min)
				min = p[i];
			}
			cout<<" Max = "<<max<<"   "<<" Min = "<<min;
		}
		~DynIntArray()
		{
			delete(p);
			cout<<" deleted"<<endl;
		}
};
int main()
{
	int l;
	cout<<" Enter length of array: ";
	cin>>l;
	{
		DynIntArray d1(l);
		d1.read();
		d1.MaxMin();
		cout<<" 1st object";
	}
	cout<<"\n Now 2nd Object:\n";
	DynIntArray d2(l);
	d2.read();
	d2.MaxMin();
	cout<<" 2nd object";
	return 0;
}

