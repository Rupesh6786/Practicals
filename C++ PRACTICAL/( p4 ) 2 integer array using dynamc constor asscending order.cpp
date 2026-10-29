#include<iostream>
using namespace std;
class DynArray
{
	int *a, len;
	public:
		DynArray(int n)
		{
			len = n;
			a = new int(len);//space for array will be reserved by new function
		}	
		void read()
		{
			cout<<"Enter elements of array: ";
			for(int i = 0; i < len; i++)
			cin>>a[i];	
		}
		void sort()
		{
			int tmp;
			for(int i = 0; i < len; i++)
				for(int j = i; j < len; j++)
				if(a[i]>a[j])
				{
					tmp = a[i];
					a[i]=a[j];
					a[j] = tmp;
				}
		}
		void print()
		{
			cout<<"Elements in ascending order are given as foloows:\n";
			for(int i= 0; i < len; i++)
			cout<<a[i]<<" ";
		}
};
int main()
{
	int i;
	cout<<"Enter length of array to be created: ";
	cin>>i;
	DynArray d(i);
	d.read();
	d.sort();
	d.print();
	return 0;
}

