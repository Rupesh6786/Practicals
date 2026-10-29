#include<iostream>
using namespace std;
class Stu_Mem_Fun
{
	int a;
	public:
		static int count;
		static countfun()
		{
			cout<<"The object sequence no: "<<count<<endl;
			count++;
		//	cin<<a;
		}
		void read()
		{
			cout<<"Enter value for a:";
			cin>>a;
		}
		void print()
		{
			cout<<"Value of a is: "<<a<<endl;
		}
};
int Stu_Mem_Fun::count;
int main()
{
	Stu_Mem_Fun s1;
	Stu_Mem_Fun::countfun();
	s1.read();
	s1.print();
	Stu_Mem_Fun s2;
	Stu_Mem_Fun::countfun();
	s2.read();
	s2.print();
	Stu_Mem_Fun s3;
	Stu_Mem_Fun::countfun();
	s3.read();
	s3.print();
	return 0;
}

